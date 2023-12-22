/**
 * 
 */
package caf.war.LicenseEligibilityTaskImpl.issuelicencetaskoverview;

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

@ManagedBean(name = "IssueLicenceTaskOverviewDefaultxhtmlView")
@SessionScoped
@ExpireWithPageFlow
@DTManagedBean(displayName = "IssueLicenceTaskOverview/default", beanType = BeanType.PAGE)
public class IssueLicenceTaskOverviewDefaultxhtmlView extends com.webmethods.caf.faces.bean.BasePageBean {


	private static final long serialVersionUID = 1L;
	private static final String[][] INITIALIZE_PROPERTY_BINDINGS = new String[][] {
		{"#{activePreferencesBean.currentTab}", "TaskData"},
	};

	// binding the Task Display Provider to the current taskID (passed to the Portlet Bean via the URL)
	private TaskDisplayProvider taskDisplayProvider = null;
	private static final String[][] TASKDISPLAYPROVIDER_PROPERTY_BINDINGS = new String[][] { {
			"#{TaskDisplayProvider.taskID}", "#{IssueLicenceTaskOverview.taskID}" }, };
	private transient caf.war.LicenseEligibilityTaskImpl.issuelicencetaskoverview.IssueLicenceTaskOverview issueLicenceTaskOverview = null;
	private caf.war.LicenseEligibilityTaskImpl.taskclient.IssueLicenceTask issueLicenceTask = null;
	private static final String[][] ISSUELICENCETASK_PROPERTY_BINDINGS = new String[][] {
		{"#{IssueLicenceTask.taskID}", "#{IssueLicenceTaskOverview.taskID}"},
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

	public caf.war.LicenseEligibilityTaskImpl.issuelicencetaskoverview.IssueLicenceTaskOverview getIssueLicenceTaskOverview()  {
		if (issueLicenceTaskOverview == null) {
		    issueLicenceTaskOverview = (caf.war.LicenseEligibilityTaskImpl.issuelicencetaskoverview.IssueLicenceTaskOverview)resolveExpression("#{IssueLicenceTaskOverview}");
		}
		return issueLicenceTaskOverview;
	}

	public caf.war.LicenseEligibilityTaskImpl.taskclient.IssueLicenceTask getIssueLicenceTask()  {
		if (issueLicenceTask == null) {
		    issueLicenceTask = (caf.war.LicenseEligibilityTaskImpl.taskclient.IssueLicenceTask)resolveExpression("#{IssueLicenceTask}");
		}
	
	    resolveDataBinding(ISSUELICENCETASK_PROPERTY_BINDINGS, issueLicenceTask, "issueLicenceTask", false, false);
		return issueLicenceTask;
	}

}