package caf.war.ADESPComplianceTaskImpl.taskclient;

 

import com.webmethods.portal.service.task.ITaskData;
import com.webmethods.caf.faces.data.ContentProviderException;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import com.webmethods.caf.faces.annotations.ExpireWithPageFlow;
import com.webmethods.caf.faces.annotations.DTManagedBean;
import com.webmethods.caf.faces.annotations.BeanType;
 
/**
 * Task Client bean for 'ComplianceTask' task.
 */ 
@ManagedBean(name = "ComplianceTask")
@SessionScoped
@ExpireWithPageFlow
@DTManagedBean(beanType = BeanType.DEFAULT)
public class ComplianceTask extends com.webmethods.caf.faces.data.task.impl.TaskContentProviderExtended {

	private static final long serialVersionUID = 348928489678435328L;
	
	/**
	 * Globally unique task type id
	 */
	private static final String TASK_TYPE_ID = "5F170990-6CA0-EBBE-E781-1D4DAC1277C0";

	/**
	 * Default constructor
	 */
	public ComplianceTask() {
		super();
		setTaskTypeID(TASK_TYPE_ID);
	}
	
	/**
	 * Task Data Object
	 */
	public static class TaskData extends com.webmethods.caf.faces.data.task.impl.TaskData {

		private static final long serialVersionUID = 8863820190668782592L;
		 
			
		public static String[][] FIELD_NAMES = new String[][] {{"businessDoc", "BusinessDoc"},
		};


		private caf.war.ADESPComplianceTaskImpl.is.document.ADESPCompliance_documents_BusinessDoc businessDoc = null;


		public static final String[] INPUTS = new String[] {"businessDoc", };


		public static final String[] OUTPUTS = new String[] {"businessDoc", };
 
		public TaskData() {
		}

		public caf.war.ADESPComplianceTaskImpl.is.document.ADESPCompliance_documents_BusinessDoc getBusinessDoc()  {
			if (businessDoc == null) {
				businessDoc = new caf.war.ADESPComplianceTaskImpl.is.document.ADESPCompliance_documents_BusinessDoc();
			}
			return businessDoc;
		}

		public void setBusinessDoc(caf.war.ADESPComplianceTaskImpl.is.document.ADESPCompliance_documents_BusinessDoc businessDoc)  {
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