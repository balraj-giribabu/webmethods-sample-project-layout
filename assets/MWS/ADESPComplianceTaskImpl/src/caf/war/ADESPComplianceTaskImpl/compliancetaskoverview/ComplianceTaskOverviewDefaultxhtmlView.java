/**
 * 
 */
package caf.war.ADESPComplianceTaskImpl.compliancetaskoverview;

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

@ManagedBean(name = "ComplianceTaskOverviewDefaultxhtmlView")
@SessionScoped
@ExpireWithPageFlow
@DTManagedBean(displayName = "ComplianceTaskOverview/default", beanType = BeanType.PAGE)
public class ComplianceTaskOverviewDefaultxhtmlView extends com.webmethods.caf.faces.bean.BasePageBean {


	private static final long serialVersionUID = 1L;
	private static final String[][] INITIALIZE_PROPERTY_BINDINGS = new String[][] {
		{"#{activePreferencesBean.currentTab}", "TaskData"},
	};

	// binding the Task Display Provider to the current taskID (passed to the Portlet Bean via the URL)
	private TaskDisplayProvider taskDisplayProvider = null;
	private static final String[][] TASKDISPLAYPROVIDER_PROPERTY_BINDINGS = new String[][] { {
			"#{TaskDisplayProvider.taskID}", "#{ComplianceTaskOverview.taskID}" }, };
	private transient caf.war.ADESPComplianceTaskImpl.compliancetaskoverview.ComplianceTaskOverview complianceTaskOverview = null;
	private caf.war.ADESPComplianceTaskImpl.taskclient.ComplianceTask complianceTask = null;
	private static final String[][] COMPLIANCETASK_PROPERTY_BINDINGS = new String[][] {
		{"#{ComplianceTask.taskID}", "#{ComplianceTaskOverview.taskID}"},
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

	public caf.war.ADESPComplianceTaskImpl.compliancetaskoverview.ComplianceTaskOverview getComplianceTaskOverview()  {
		if (complianceTaskOverview == null) {
		    complianceTaskOverview = (caf.war.ADESPComplianceTaskImpl.compliancetaskoverview.ComplianceTaskOverview)resolveExpression("#{ComplianceTaskOverview}");
		}
		return complianceTaskOverview;
	}

	public caf.war.ADESPComplianceTaskImpl.taskclient.ComplianceTask getComplianceTask()  {
		if (complianceTask == null) {
		    complianceTask = (caf.war.ADESPComplianceTaskImpl.taskclient.ComplianceTask)resolveExpression("#{ComplianceTask}");
		}
	
	    resolveDataBinding(COMPLIANCETASK_PROPERTY_BINDINGS, complianceTask, "complianceTask", false, false);
		return complianceTask;
	}

}