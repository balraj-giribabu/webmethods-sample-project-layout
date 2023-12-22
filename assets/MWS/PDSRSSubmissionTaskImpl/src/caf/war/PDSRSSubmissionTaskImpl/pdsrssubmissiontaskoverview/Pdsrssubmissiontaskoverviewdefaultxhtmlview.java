/**
 * 
 */
package caf.war.PDSRSSubmissionTaskImpl.pdsrssubmissiontaskoverview;

/**
 * @author Administrator
 *
 */

import com.webmethods.caf.faces.data.task.TaskDisplayProvider;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import com.webmethods.caf.faces.annotations.ExpireWithPageFlow;
import com.webmethods.caf.faces.annotations.DTManagedBean;
import com.webmethods.caf.faces.annotations.BeanType;

@ManagedBean(name = "Pdsrssubmissiontaskoverviewdefaultxhtmlview")
@SessionScoped
@ExpireWithPageFlow
@DTManagedBean(displayName = "Pdsrssubmissiontaskoverview/default", beanType = BeanType.PAGE)
public class Pdsrssubmissiontaskoverviewdefaultxhtmlview extends com.webmethods.caf.faces.bean.BasePageBean {


	private static final long serialVersionUID = 1L;
	private static final String[][] INITIALIZE_PROPERTY_BINDINGS = new String[][] {
		{"#{activePreferencesBean.currentTab}", "TaskData"},
	};

	// binding the Task Display Provider to the current taskID (passed to the Portlet Bean via the URL)
	private TaskDisplayProvider taskDisplayProvider = null;
	private static final String[][] TASKDISPLAYPROVIDER_PROPERTY_BINDINGS = new String[][] { {
			"#{TaskDisplayProvider.taskID}", "#{Pdsrssubmissiontaskoverview.taskID}" }, };
	private transient caf.war.PDSRSSubmissionTaskImpl.pdsrssubmissiontaskoverview.Pdsrssubmissiontaskoverview pdsrssubmissiontaskoverview = null;
	private caf.war.PDSRSSubmissionTaskImpl.taskclient.Pdsrssubmissiontask pdsrssubmissiontask = null;
	private static final String[][] PDSRSSUBMISSIONTASK_PROPERTY_BINDINGS = new String[][] {
		{"#{Pdsrssubmissiontask.taskID}", "#{Pdsrssubmissiontaskoverview.taskID}"},
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

	/*
	 * Get the Task Display Provider for the current taskID
	 */
	public TaskDisplayProvider getTaskDisplayProvider() {
		if (taskDisplayProvider == null) {
			taskDisplayProvider = (TaskDisplayProvider) resolveExpression("#{TaskDisplayProvider}");
		}
		resolveDataBinding(TASKDISPLAYPROVIDER_PROPERTY_BINDINGS,
				taskDisplayProvider, "taskDisplayProvider", false, false);
		return taskDisplayProvider;
	}

	public caf.war.PDSRSSubmissionTaskImpl.pdsrssubmissiontaskoverview.Pdsrssubmissiontaskoverview getPdsrssubmissiontaskoverview()  {
		if (pdsrssubmissiontaskoverview == null) {
		    pdsrssubmissiontaskoverview = (caf.war.PDSRSSubmissionTaskImpl.pdsrssubmissiontaskoverview.Pdsrssubmissiontaskoverview)resolveExpression("#{Pdsrssubmissiontaskoverview}");
		}
		return pdsrssubmissiontaskoverview;
	}

	public caf.war.PDSRSSubmissionTaskImpl.taskclient.Pdsrssubmissiontask getPdsrssubmissiontask()  {
		if (pdsrssubmissiontask == null) {
		    pdsrssubmissiontask = (caf.war.PDSRSSubmissionTaskImpl.taskclient.Pdsrssubmissiontask)resolveExpression("#{Pdsrssubmissiontask}");
		}
	
	    resolveDataBinding(PDSRSSUBMISSIONTASK_PROPERTY_BINDINGS, pdsrssubmissiontask, "pdsrssubmissiontask", false, false);
		return pdsrssubmissiontask;
	}

}