/**
 * 
 */
package caf.war.ADESPCommonTaskImpl.objectionstaskoverview;

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

@ManagedBean(name = "ObjectionsTaskOverviewDefaultxhtmlView")
@SessionScoped
@ExpireWithPageFlow
@DTManagedBean(displayName = "ObjectionsTaskOverview/default", beanType = BeanType.PAGE)
public class ObjectionsTaskOverviewDefaultxhtmlView extends com.webmethods.caf.faces.bean.BasePageBean {


	private static final long serialVersionUID = 1L;
	private static final String[][] INITIALIZE_PROPERTY_BINDINGS = new String[][] {
		{"#{activePreferencesBean.currentTab}", "TaskData"},
	};

	// binding the Task Display Provider to the current taskID (passed to the Portlet Bean via the URL)
	private TaskDisplayProvider taskDisplayProvider = null;
	private static final String[][] TASKDISPLAYPROVIDER_PROPERTY_BINDINGS = new String[][] { {
			"#{TaskDisplayProvider.taskID}", "#{ObjectionsTaskOverview.taskID}" }, };
	private transient caf.war.ADESPCommonTaskImpl.objectionstaskoverview.ObjectionsTaskOverview objectionsTaskOverview = null;
	private caf.war.ADESPCommonTaskImpl.taskclient.ObjectionsTask objectionsTask = null;
	private static final String[][] OBJECTIONSTASK_PROPERTY_BINDINGS = new String[][] {
		{"#{ObjectionsTask.taskID}", "#{ObjectionsTaskOverview.taskID}"},
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

	public caf.war.ADESPCommonTaskImpl.objectionstaskoverview.ObjectionsTaskOverview getObjectionsTaskOverview()  {
		if (objectionsTaskOverview == null) {
		    objectionsTaskOverview = (caf.war.ADESPCommonTaskImpl.objectionstaskoverview.ObjectionsTaskOverview)resolveExpression("#{ObjectionsTaskOverview}");
		}
		return objectionsTaskOverview;
	}

	public caf.war.ADESPCommonTaskImpl.taskclient.ObjectionsTask getObjectionsTask()  {
		if (objectionsTask == null) {
		    objectionsTask = (caf.war.ADESPCommonTaskImpl.taskclient.ObjectionsTask)resolveExpression("#{ObjectionsTask}");
		}
	
	    resolveDataBinding(OBJECTIONSTASK_PROPERTY_BINDINGS, objectionsTask, "objectionsTask", false, false);
		return objectionsTask;
	}

}