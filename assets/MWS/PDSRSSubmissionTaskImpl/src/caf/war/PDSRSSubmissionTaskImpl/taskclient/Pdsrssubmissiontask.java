package caf.war.PDSRSSubmissionTaskImpl.taskclient;

 

import com.webmethods.portal.service.task.ITaskData;
import com.webmethods.caf.faces.data.ContentProviderException;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import com.webmethods.caf.faces.annotations.ExpireWithPageFlow;
import com.webmethods.caf.faces.annotations.DTManagedBean;
import com.webmethods.caf.faces.annotations.BeanType;
 
/**
 * Task Client bean for 'PDSRSSubmissionTask' task.
 */ 
@ManagedBean(name = "Pdsrssubmissiontask")
@SessionScoped
@ExpireWithPageFlow
@DTManagedBean(beanType = BeanType.DEFAULT)
public class Pdsrssubmissiontask extends com.webmethods.caf.faces.data.task.impl.TaskContentProviderExtended {

	private static final long serialVersionUID = 463930236690480128L;
	
	/**
	 * Globally unique task type id
	 */
	private static final String TASK_TYPE_ID = "583FCEA4-6A46-0892-9D82-F5F8DC7134CC";

	/**
	 * Default constructor
	 */
	public Pdsrssubmissiontask() {
		super();
		setTaskTypeID(TASK_TYPE_ID);
	}
	
	/**
	 * Task Data Object
	 */
	public static class TaskData extends com.webmethods.caf.faces.data.task.impl.TaskData {

		private static final long serialVersionUID = 5820078060636471296L;
		 
			
		public static String[][] FIELD_NAMES = new String[][] {{"businessDoc", "BusinessDoc"},
		};


		private caf.war.PDSRSSubmissionTaskImpl.is.document.PDSRSSubmission_documents_BusinessDoc businessDoc = null;


		public static final String[] INPUTS = new String[] {"businessDoc", };


		public static final String[] OUTPUTS = new String[] {"businessDoc", };
 
		public TaskData() {
		}

		public caf.war.PDSRSSubmissionTaskImpl.is.document.PDSRSSubmission_documents_BusinessDoc getBusinessDoc()  {
			if (businessDoc == null) {
				businessDoc = new caf.war.PDSRSSubmissionTaskImpl.is.document.PDSRSSubmission_documents_BusinessDoc();
			}
			return businessDoc;
		}

		public void setBusinessDoc(caf.war.PDSRSSubmissionTaskImpl.is.document.PDSRSSubmission_documents_BusinessDoc businessDoc)  {
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