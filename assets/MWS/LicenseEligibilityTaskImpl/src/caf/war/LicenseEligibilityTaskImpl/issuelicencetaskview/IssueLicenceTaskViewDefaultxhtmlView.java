/**
 * 
 */
package caf.war.LicenseEligibilityTaskImpl.issuelicencetaskview;

/**
 * @author Administrator
 *
 */

import com.webmethods.caf.faces.data.dir.PrincipalModel;
import com.webmethods.caf.faces.data.dir.PrincipalModelList;
import com.webmethods.caf.faces.data.task.impl.TaskContentProvider;
import com.webmethods.caf.faces.data.task.impl.TaskVotingServiceFactory;
import com.webmethods.portal.mech.task.voting.details.pojo.TaskVoteEntry;

import com.softwareag.caf.shared.task.core.model.TaskVotingTable;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import com.webmethods.caf.faces.annotations.ExpireWithPageFlow;
import com.webmethods.caf.faces.annotations.DTManagedBean;
import com.webmethods.caf.faces.annotations.BeanType;

@ManagedBean(name = "IssueLicenceTaskViewDefaultxhtmlView")
@SessionScoped
@ExpireWithPageFlow
@DTManagedBean(displayName = "IssueLicenceTaskView/default", beanType = BeanType.PAGE)
public class IssueLicenceTaskViewDefaultxhtmlView extends com.webmethods.caf.faces.bean.task.BaseTaskDetailsPageBean {

 
	/**
	 * Determines if a de-serialized file is compatible with this class.
	 *
	 * Maintainers must change this value if and only if the new version
	 * of this class is not compatible with old versions. See Sun docs
	 * for <a href=http://java.sun.com/j2se/1.5.0/docs/guide/serialization/spec/version.html> 
	 * details. </a>
	 */
	private static final long serialVersionUID = 1L;
	private com.webmethods.caf.faces.data.task.TaskDisplayProvider taskDisplayProvider = null;
	private static final String[][] TASKDISPLAYPROVIDER_PROPERTY_BINDINGS = new String[][] {
		{"#{TaskDisplayProvider.taskID}", "#{IssueLicenceTaskView.taskID}"},
	};
	
	/**
	 * Has permission to view voting details
	 */
	public boolean getHasVotingDetailsPermission() {
		return getIssueLicenceTask().getCanUserViewTaskVotingStatistics();
	}
	
	public List<TaskVoteEntry> getListOfVotingTableEntries() {
		List<TaskVoteEntry> listOfVotingTableEntries = null;
		try {
			listOfVotingTableEntries = TaskVotingServiceFactory.getVotingService().getTaskVotesDetails(Integer.valueOf(getIssueLicenceTask().getTaskID()));
		} catch (Exception e) {
            this.error(e);
            this.log(e);
        }
		
		return listOfVotingTableEntries;
	}
	
	/**
	 * Get task voting strategy
	 */
	public String getTaskVotingStrategy() {
        final TaskVotingTable table = TaskVotingServiceFactory.getVotingService().parseVotingTable(getIssueLicenceTask().getTaskInfo().getTaskVotingTable());
        return table.getStrategy();
    }
    
    /**
	 * Get task voting threshold
	 */
    public String getTaskVotingThreshold() {
        final TaskVotingTable table = TaskVotingServiceFactory.getVotingService().parseVotingTable(getIssueLicenceTask().getTaskInfo().getTaskVotingTable());
        return table.getValue();
    }
    
	/**
	 * Get count of all users assigned to the task
	 */
	 public int getTotalUserAssignedCount() {
        int totalUserAssignedCount = 0;
        try {
            totalUserAssignedCount = TaskVotingServiceFactory.getVotingService().getTotalUserAssignedCount(Integer.valueOf(getIssueLicenceTask().getTaskID()));
        }
        catch (Exception e) {
            this.error(e);
            this.log(e);
        }
        return totalUserAssignedCount;
    }
    
	 /**
	 * Get all task votes by status
	 */
    public Map<String, Integer> getTaskVotingCount() {
        Map<String, Integer> map = null;
        try {
            map = (Map<String, Integer>)TaskVotingServiceFactory.getVotingService().getTaskVotesCountByStatus(Integer.valueOf(getIssueLicenceTask().getTaskID()));
        }
        catch (Exception e) {
            this.error(e);
            this.log(e);
        }
        return map;
    }
    
	public com.webmethods.caf.faces.data.task.TaskDisplayProvider getTaskDisplayProvider()  {
		if (taskDisplayProvider == null) {
		    taskDisplayProvider = (com.webmethods.caf.faces.data.task.TaskDisplayProvider)resolveExpression("#{TaskDisplayProvider}");
		}
	    resolveDataBinding(TASKDISPLAYPROVIDER_PROPERTY_BINDINGS, taskDisplayProvider, "taskDisplayProvider", false, false);
		return taskDisplayProvider;
	}

	/**
	 * Cancel button action handler
	 */
	public String cancelView() {
		try {
			// just redirect to return (finish) url
			String url = getIssueLicenceTaskView().getFinishUrl();
			if (url != null && url.length() > 0) {
				getFacesContext().getExternalContext().redirect(url);
			}
		} catch (Exception e) {
			error(e);
			log(e);
		}
		return null;
	}
	
	/**
	 * Complete button action handler
	 */
	public String completeTask() {
		try {
			if( !getIssueLicenceTask().isUpdateable() ){
				String errMsg = "You must accept a task before updating it";	//view.task.pagebean.task.accept.msg
				error(errMsg);
				return null; 
			}
			// do the work
			getIssueLicenceTask().voteComplete();
		
			// then redirect to finish url
			String url = getIssueLicenceTaskView().getFinishUrl(); 
			if (url != null && url.length() > 0) {
				getFacesContext().getExternalContext().redirect(url);
			}
		} catch (Exception e) {
			error(e);
			log(e);
		}
		return null;
	}	

	/**
	 * Submit button action handler
	 */
	public String submitTask() {
		try {
			if( !getIssueLicenceTask().isUpdateable() ){
				String errMsg = "You must accept a task before updating it";	//view.task.pagebean.task.accept.msg
				error(errMsg);
				return null; 
			}


			// do the work
			getIssueLicenceTask().applyChanges();
		} catch (Exception e) {
			error(e);
			log(e);
		}
		return null;
	}

	private PrincipalModelList selectedPrincipalList;

	public PrincipalModelList getPrincipalList() {
		return selectedPrincipalList;
	}
	
	public void setPrincipalList(PrincipalModelList value) {
		this.selectedPrincipalList = value;
	}
	
	/**
	 * Action Event Handler for the control with id='dialogPrincipalAssignTo'
	 */
	public String assignToPrincipals() {
		try {

			// get the current assigned principals for this task
			TaskContentProvider tp = getIssueLicenceTask();

			List<String> currentPrincipalList = new ArrayList<String>();
			String[] currentPrincipalIDs = tp.getTaskInfo().getAssignedToList();
			if (currentPrincipalIDs != null && currentPrincipalIDs.length > 0) {
				for (int ix = 0; ix < currentPrincipalIDs.length; ix++) {
					String principalID = currentPrincipalIDs[ix];
					currentPrincipalList.add( principalID );
				}
			}
			
			// get the selected principals from the picker
			if (selectedPrincipalList != null && selectedPrincipalList.size() > 0) {
				// loop and add the selected principals to the existing list
				for (int ix = 0; ix < selectedPrincipalList.size(); ix++) {
					PrincipalModel principalModel = (PrincipalModel) selectedPrincipalList.get(ix);
					String principalID = principalModel.getPrincipalID(); 
					if( !currentPrincipalList.contains( principalID)) {
						currentPrincipalList.add( principalID );
					}
				}
			}
				
			currentPrincipalIDs = currentPrincipalList.toArray( currentPrincipalIDs);
			tp.getTaskInfo().setAssignedToList(currentPrincipalIDs);
			tp.applyChangesNoAccept();
				
			// then redirect to finish url
			//String url = getRonTask36TaskView().getFinishUrl(); 
			//if (url != null && url.length() > 0) {
			//	getFacesContext().getExternalContext().redirect(url);
			//}				
		} catch (Exception e) {
			error(e);
			log(e);
		}		
		return null;
	}
	
	private static final String[][] INITIALIZE_PROPERTY_BINDINGS = new String[][] {
		{"#{IssueLicenceTask.reset}", null}
	};
	private transient caf.war.LicenseEligibilityTaskImpl.issuelicencetaskview.IssueLicenceTaskView issueLicenceTaskView = null;
	private caf.war.LicenseEligibilityTaskImpl.taskclient.IssueLicenceTask issueLicenceTask = null;
	private static final String[][] ISSUELICENCETASK_PROPERTY_BINDINGS = new String[][] {
		{"#{IssueLicenceTask.taskID}", "#{IssueLicenceTaskView.taskID}"},
		{"#{IssueLicenceTask.autoAccept}", "false"},
		{"#{IssueLicenceTask.adhocRouting}", "false"},
	};

	/**
	 * Initialize page
	 */
	public String initialize() {
		try {
		    resolveDataBinding(INITIALIZE_PROPERTY_BINDINGS, null, "initialize", true, false);
		} catch (Exception e) {
			error(e);
			log(e);
		}
		return null;	
	}
	
	@Override
	protected void beforeRenderResponse() {
		super.beforeRenderResponse();
		try {
			getIssueLicenceTask().refresh();
		} catch( Exception ex ) {
			error(ex);
			log(ex);
		}
		
	}

	public caf.war.LicenseEligibilityTaskImpl.issuelicencetaskview.IssueLicenceTaskView getIssueLicenceTaskView()  {
		if (issueLicenceTaskView == null) {
		    issueLicenceTaskView = (caf.war.LicenseEligibilityTaskImpl.issuelicencetaskview.IssueLicenceTaskView)resolveExpression("#{IssueLicenceTaskView}");
		}
		return issueLicenceTaskView;
	}

	public caf.war.LicenseEligibilityTaskImpl.taskclient.IssueLicenceTask getIssueLicenceTask()  {
		if (issueLicenceTask == null) {
		    issueLicenceTask = (caf.war.LicenseEligibilityTaskImpl.taskclient.IssueLicenceTask)resolveExpression("#{IssueLicenceTask}");
		}
	
	    resolveDataBinding(ISSUELICENCETASK_PROPERTY_BINDINGS, issueLicenceTask, "issueLicenceTask", false, false);
		return issueLicenceTask;
	}
}
