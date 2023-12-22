package caf.war.ADESPCommonTaskImpl.taskclient;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import com.webmethods.caf.faces.annotations.DTManagedBean;

import caf.war.ADESPCommonTaskImpl.is.document.ADESPCommon_documents_publicRegistry_BusinessDoc;
import caf.war.ADESPCommonTaskImpl.is.document.ADESPCommon_documents_publicRegistry_TaskConfig;
import caf.war.ADESPCommonTaskImpl.is.document.IXCommon_documents_TaskConfig;
import caf.war.ADESPCommonTaskImpl.is.document.IXCommon_documents_TaskConfig.Actions;

import com.webmethods.caf.faces.annotations.BeanType;

@ManagedBean(name = "PublicRegisterTaskRuleContext")
@SessionScoped
@DTManagedBean(displayName = "PublicRegisterTask Rule Context", beanType = BeanType.DEFAULT)
public class PublicRegisterTaskRuleContext  extends  com.webmethods.caf.faces.data.task.impl.BaseTaskRuleContext {

	private java.lang.String isChildTask;
	String[] assigneeRole;
	String[] assigneeUser;
	String userType = null;
	String role = null;
	
	
	private static final String[][] ONQUEUE_PROPERTY_BINDINGS = new String[][] {
	};
	private transient caf.war.ADESPCommonTaskImpl.wsclient.ixtaskmanagement.ws.provider.soap.queuetaskoperations.QueueTask queueTask = null;
	private static final String[][] QUEUETASK_PROPERTY_BINDINGS = new String[][] {
		{"#{queueTask.authCredentials.authenticationMethod}", "1"},
		{"#{queueTask.authCredentials.requiresAuth}", "true"},
		{"#{queueTask.autoRefresh}", "false"},
		{"#{queueTask.endpointAddress}", "#{environment[\"wsclient-endpointAddress\"]}/ws/IXTaskManagement.ws.provider.soap:queueTaskOperations/IXTaskManagement_ws_provider_soap_queueTaskOperations_Port"},
		{"#{queueTask.authCredentials.userName}", "#{environment[\"wsclient-username\"]}"},
		{"#{queueTask.authCredentials.password}", "#{environment[\"wsclient-password\"]}"},
	};
	public java.lang.String getIsChildTask()  {
		
		return isChildTask;
	}

	public String onQueue() throws Exception{
		PublicRegisterTask currentTask = (PublicRegisterTask) this.getCurrentTask();
		caf.war.ADESPCommonTaskImpl.taskclient.PublicRegisterTask.TaskData taskData = currentTask
				.getTaskData();
		String requestId = taskData.getBusinessDoc().getRequestId();
		String taskId = currentTask.getTaskInfo().getTaskID();
		String taskName = currentTask.getTaskInfo().getName();
		String processmodelId=currentTask.getTaskInfo().getProcessModelID();
		String interfceId = taskData.getBusinessDoc().getInterfaceId();
		if (currentTask.getTaskInfo().getParentTaskID() == null) {
			taskData.getBusinessDoc().setIsChildTask("NO");
			currentTask.applyChangesNoAccept();
		} else {
			taskData.getBusinessDoc().setIsChildTask("YES");
			currentTask.applyChangesNoAccept();
			
		}
		
		ADESPCommon_documents_publicRegistry_BusinessDoc businessDoc = currentTask.getTaskData().getBusinessDoc();
	
	//	System.out.println("Queuing task "+taskName + " with task id "+taskId + " for request id "+requestId);
		for (IXCommon_documents_TaskConfig taskConfig : businessDoc.getTaskConfig()) {
		
			if (taskConfig.getTaskName().equalsIgnoreCase(currentTask.getTaskInfo().getName()) || taskConfig.getTaskName().trim().equalsIgnoreCase(currentTask.getTaskInfo().getName().split("-")[0].trim())) {
		//		System.out.println("Task name matched and is parallel flag is "+ taskConfig.getIsParallel() );
				if (taskConfig.getIsParallel() && taskData.getBusinessDoc().getIsChildTask().equalsIgnoreCase("NO")) {
			//		System.out.println("inside parallel task" );
					
					if (currentTask.getTaskInfo().getParentTaskID() == null
							|| currentTask.getTaskInfo().getParentTaskID().isEmpty()) {
				//		System.out.println("queuing child tasks" );
						int i = 0;
						for (String assignee : taskConfig.getAssignee()) {
							PublicRegisterTask collaborationTask = new PublicRegisterTask();
							collaborationTask.getTaskInfo().setAssignedToList(new String[] {assignee});
							collaborationTask.getTaskInfo().setIsMandatory(1);
							collaborationTask.getTaskInfo().setParentTaskID(currentTask.getTaskID());
							collaborationTask.getTaskInfo()
									.setName(currentTask.getTaskInfo().getName() + " - " + assignee);
							collaborationTask.queueNewTask();
							i++;
						}
						currentTask.getTaskData().getBusinessDoc().setChildCount(i);
					}
				}
				else {
					System.out.println("outside parallel task" );
					if(taskData.getBusinessDoc().getIsChildTask().equalsIgnoreCase("NO")) {
						currentTask.getTaskInfo().setAssignedToList(taskConfig.getAssignee());
						
						}
					for (Actions action : taskConfig.getActions()) {
						if (action.getActionName().equalsIgnoreCase("QUEUED")) {
							currentTask.getTaskData().getBusinessDoc().setStatus(action.getStatusCode());
							currentTask.applyChangesNoAccept();
							break;
						}
					}
					getQueueTask().getParameters().getQueueTask().getQueueTask().getInput().setAction("QUEUED");
					getQueueTask().getParameters().getQueueTask().getQueueTask().getInput().setComments(null);
				//  getQueueTask().getParameters().getQueueTask().getQueueTask().getInput().setInterfaceId(interfceId);
					getQueueTask().getParameters().getQueueTask().getQueueTask().getInput().setRequestId(requestId);
					getQueueTask().getParameters().getQueueTask().getQueueTask().getInput().setUserType(taskConfig.getUserType());
					getQueueTask().getParameters().getQueueTask().getQueueTask().getInput().setTaskId(taskId);
					getQueueTask().getParameters().getQueueTask().getQueueTask().getInput().setTaskName(taskName);
					getQueueTask().getParameters().getQueueTask().getQueueTask().getInput().setNotificationId(currentTask.getTaskData().getBusinessDoc().getNotificationId());
					getQueueTask().getParameters().getQueueTask().getQueueTask().getInput().setProcessModelId(processmodelId);
					getQueueTask().getParameters().getQueueTask().getQueueTask().getInput().setStatus(currentTask.getTaskData().getBusinessDoc().getStatus());
					getQueueTask().getParameters().getQueueTask().getQueueTask().getInput().setAssignee(currentTask.getTaskInfo().getAssignedToList());
					

					
				//	System.out.println("calling queue task" );
					getQueueTask().refresh();
				}
				

				currentTask.applyChangesNoAccept();
				break;
			}
			else {
			//	System.out.println("Task name did not match" );
			}
		}
		
		
		
		return null;
	}

	public caf.war.ADESPCommonTaskImpl.wsclient.ixtaskmanagement.ws.provider.soap.queuetaskoperations.QueueTask getQueueTask()  {
		if (queueTask == null) {
		    queueTask = (caf.war.ADESPCommonTaskImpl.wsclient.ixtaskmanagement.ws.provider.soap.queuetaskoperations.QueueTask)resolveExpression("#{QueueTask}");
		}
	
	    resolveDataBinding(QUEUETASK_PROPERTY_BINDINGS, queueTask, "queueTask", false, false);
		return queueTask;
	}
}