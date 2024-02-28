package caf.war.ADESPCommonTaskImpl.taskclient;

 

import com.webmethods.portal.service.task.ITaskData;

import caf.war.ADESPCommonTaskImpl.is.document.ADESPCommon_documents_objections_BusinessDoc;

import com.webmethods.caf.faces.data.ContentProviderException;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import com.webmethods.caf.faces.annotations.ExpireWithPageFlow;
import com.webmethods.caf.faces.annotations.DTManagedBean;
import com.webmethods.caf.faces.annotations.BeanType;
 
/**
 * Task Client bean for 'ObjectionsTask' task.
 */ 
@ManagedBean(name = "ObjectionsTask")
@SessionScoped
@ExpireWithPageFlow
@DTManagedBean(beanType = BeanType.DEFAULT)
public class ObjectionsTask extends com.webmethods.caf.faces.data.task.impl.TaskContentProviderExtended {

	private static final long serialVersionUID = 160685815102776320L;
	
	/**
	 * Globally unique task type id
	 */
	private static final String TASK_TYPE_ID = "19317E4E-0DAB-AB8F-8A9F-7AB082788409";

	/**
	 * Default constructor
	 */
	public ObjectionsTask() {
		super();
		setTaskTypeID(TASK_TYPE_ID);
	}
	
	/**
	 * Task Data Object
	 */
	public static class TaskData extends com.webmethods.caf.faces.data.task.impl.TaskData {

		private static final long serialVersionUID = 8398352380001642496L;
		 
			
		public static String[][] FIELD_NAMES = new String[][] {{"businessDoc", "BusinessDoc"},
		};


		private caf.war.ADESPCommonTaskImpl.is.document.ADESPCommon_documents_objections_BusinessDoc businessDoc = null;


		public static final String[] INPUTS = new String[] {"businessDoc", };


		public static final String[] OUTPUTS = new String[] {"businessDoc", };


		public TaskData() {
		}


		public caf.war.ADESPCommonTaskImpl.is.document.ADESPCommon_documents_objections_BusinessDoc getBusinessDoc()  {
			if (businessDoc == null) {
				businessDoc = new caf.war.ADESPCommonTaskImpl.is.document.ADESPCommon_documents_objections_BusinessDoc();
			}
			return businessDoc;
		}


		public void setBusinessDoc(caf.war.ADESPCommonTaskImpl.is.document.ADESPCommon_documents_objections_BusinessDoc businessDoc)  {
			this.businessDoc = businessDoc;
		}
		
		
		
	}
	
	/**
	 * Return current task data object
	 * @return current task data
	 */
	public TaskData getTaskData() {
		return (TaskData)getValue(PROPERTY_KEY_TASKDATA);
	}

	/**
	 * Creates new task data object
	 * @return newly created task data object
	 */	
	protected ITaskData newTaskData() throws ContentProviderException {
		return new TaskData();
	}

}