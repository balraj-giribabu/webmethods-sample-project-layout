package caf.war.ADESPCommonTaskImpl.taskclient;

 

import com.webmethods.portal.service.task.ITaskData;
import com.webmethods.caf.faces.data.ContentProviderException;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import com.webmethods.caf.faces.annotations.ExpireWithPageFlow;
import com.webmethods.caf.faces.annotations.DTManagedBean;
import com.webmethods.caf.faces.annotations.BeanType;
 
/**
 * Task Client bean for 'PublicRegisterTask' task.
 */ 
@ManagedBean(name = "PublicRegisterTask")
@SessionScoped
@ExpireWithPageFlow
@DTManagedBean(beanType = BeanType.DEFAULT)
public class PublicRegisterTask extends com.webmethods.caf.faces.data.task.impl.TaskContentProviderExtended {

	private static final long serialVersionUID = 267372817393703936L;
	
	/**
	 * Globally unique task type id
	 */
	private static final String TASK_TYPE_ID = "17400B04-BC0F-D2C4-6BAE-C75B4C722124";

	/**
	 * Default constructor
	 */
	public PublicRegisterTask() {
		super();
		setTaskTypeID(TASK_TYPE_ID);
	}
	
	/**
	 * Task Data Object
	 */
	public static class TaskData extends com.webmethods.caf.faces.data.task.impl.TaskData {

		private static final long serialVersionUID = 4182147336261036032L;
		 
			
		public static String[][] FIELD_NAMES = new String[][] {{"businessDoc", "BusinessDoc"},
		};


		private caf.war.ADESPCommonTaskImpl.is.document.ADESPCommon_documents_publicRegistry_BusinessDoc businessDoc = null;


		public static final String[] INPUTS = new String[] {"businessDoc", };


		public static final String[] OUTPUTS = new String[] {"businessDoc", };


		public TaskData() {
		}


		public caf.war.ADESPCommonTaskImpl.is.document.ADESPCommon_documents_publicRegistry_BusinessDoc getBusinessDoc()  {
			if (businessDoc == null) {
				businessDoc = new caf.war.ADESPCommonTaskImpl.is.document.ADESPCommon_documents_publicRegistry_BusinessDoc();
			}
			return businessDoc;
		}


		public void setBusinessDoc(caf.war.ADESPCommonTaskImpl.is.document.ADESPCommon_documents_publicRegistry_BusinessDoc businessDoc)  {
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