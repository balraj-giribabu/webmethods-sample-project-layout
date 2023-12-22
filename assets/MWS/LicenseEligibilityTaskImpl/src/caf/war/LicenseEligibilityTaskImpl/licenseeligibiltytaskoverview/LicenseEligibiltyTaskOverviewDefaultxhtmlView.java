/**
 * 
 */
package caf.war.LicenseEligibilityTaskImpl.licenseeligibiltytaskoverview;

/**
 * @author Lalith Podduturi
 *
 */

import com.webmethods.caf.faces.data.task.TaskDisplayProvider;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import com.webmethods.caf.faces.annotations.ExpireWithPageFlow;
import com.webmethods.caf.faces.annotations.DTManagedBean;
import com.webmethods.caf.faces.annotations.BeanType;

@ManagedBean(name = "LicenseEligibiltyTaskOverviewDefaultxhtmlView")
@SessionScoped
@ExpireWithPageFlow
@DTManagedBean(displayName = "LicenseEligibiltyTaskOverview/default", beanType = BeanType.PAGE)
public class LicenseEligibiltyTaskOverviewDefaultxhtmlView extends com.webmethods.caf.faces.bean.BasePageBean {


	private static final long serialVersionUID = 1L;
	private static final String[][] INITIALIZE_PROPERTY_BINDINGS = new String[][] {
		{"#{activePreferencesBean.currentTab}", "TaskData"},
	};

	// binding the Task Display Provider to the current taskID (passed to the Portlet Bean via the URL)
	private TaskDisplayProvider taskDisplayProvider = null;
	private static final String[][] TASKDISPLAYPROVIDER_PROPERTY_BINDINGS = new String[][] { {
			"#{TaskDisplayProvider.taskID}", "#{LicenseEligibiltyTaskOverview.taskID}" }, };
	private transient caf.war.LicenseEligibilityTaskImpl.licenseeligibiltytaskoverview.LicenseEligibiltyTaskOverview licenseEligibiltyTaskOverview = null;
	private caf.war.LicenseEligibilityTaskImpl.taskclient.LicenseEligibiltyTask licenseEligibiltyTask = null;
	private static final String[][] LICENSEELIGIBILTYTASK_PROPERTY_BINDINGS = new String[][] {
		{"#{LicenseEligibiltyTask.taskID}", "#{LicenseEligibiltyTaskOverview.taskID}"},
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

	public caf.war.LicenseEligibilityTaskImpl.licenseeligibiltytaskoverview.LicenseEligibiltyTaskOverview getLicenseEligibiltyTaskOverview()  {
		if (licenseEligibiltyTaskOverview == null) {
		    licenseEligibiltyTaskOverview = (caf.war.LicenseEligibilityTaskImpl.licenseeligibiltytaskoverview.LicenseEligibiltyTaskOverview)resolveExpression("#{LicenseEligibiltyTaskOverview}");
		}
		return licenseEligibiltyTaskOverview;
	}

	public caf.war.LicenseEligibilityTaskImpl.taskclient.LicenseEligibiltyTask getLicenseEligibiltyTask()  {
		if (licenseEligibiltyTask == null) {
		    licenseEligibiltyTask = (caf.war.LicenseEligibilityTaskImpl.taskclient.LicenseEligibiltyTask)resolveExpression("#{LicenseEligibiltyTask}");
		}
	
	    resolveDataBinding(LICENSEELIGIBILTYTASK_PROPERTY_BINDINGS, licenseEligibiltyTask, "licenseEligibiltyTask", false, false);
		return licenseEligibiltyTask;
	}

}