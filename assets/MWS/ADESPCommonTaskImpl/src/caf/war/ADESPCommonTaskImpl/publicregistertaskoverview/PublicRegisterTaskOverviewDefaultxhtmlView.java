/**
 * 
 */
package caf.war.ADESPCommonTaskImpl.publicregistertaskoverview;

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

@ManagedBean(name = "PublicRegisterTaskOverviewDefaultxhtmlView")
@SessionScoped
@ExpireWithPageFlow
@DTManagedBean(displayName = "PublicRegisterTaskOverview/default", beanType = BeanType.PAGE)
public class PublicRegisterTaskOverviewDefaultxhtmlView extends com.webmethods.caf.faces.bean.BasePageBean {


	private static final long serialVersionUID = 1L;
	private static final String[][] INITIALIZE_PROPERTY_BINDINGS = new String[][] {
		{"#{activePreferencesBean.currentTab}", "TaskData"},
	};

	// binding the Task Display Provider to the current taskID (passed to the Portlet Bean via the URL)
	private TaskDisplayProvider taskDisplayProvider = null;
	private static final String[][] TASKDISPLAYPROVIDER_PROPERTY_BINDINGS = new String[][] { {
			"#{TaskDisplayProvider.taskID}", "#{PublicRegisterTaskOverview.taskID}" }, };
	private transient caf.war.ADESPCommonTaskImpl.publicregistertaskoverview.PublicRegisterTaskOverview publicRegisterTaskOverview = null;
	private caf.war.ADESPCommonTaskImpl.taskclient.PublicRegisterTask publicRegisterTask = null;
	private static final String[][] PUBLICREGISTERTASK_PROPERTY_BINDINGS = new String[][] {
		{"#{PublicRegisterTask.taskID}", "#{PublicRegisterTaskOverview.taskID}"},
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

	public caf.war.ADESPCommonTaskImpl.publicregistertaskoverview.PublicRegisterTaskOverview getPublicRegisterTaskOverview()  {
		if (publicRegisterTaskOverview == null) {
		    publicRegisterTaskOverview = (caf.war.ADESPCommonTaskImpl.publicregistertaskoverview.PublicRegisterTaskOverview)resolveExpression("#{PublicRegisterTaskOverview}");
		}
		return publicRegisterTaskOverview;
	}

	public caf.war.ADESPCommonTaskImpl.taskclient.PublicRegisterTask getPublicRegisterTask()  {
		if (publicRegisterTask == null) {
		    publicRegisterTask = (caf.war.ADESPCommonTaskImpl.taskclient.PublicRegisterTask)resolveExpression("#{PublicRegisterTask}");
		}
	
	    resolveDataBinding(PUBLICREGISTERTASK_PROPERTY_BINDINGS, publicRegisterTask, "publicRegisterTask", false, false);
		return publicRegisterTask;
	}

}