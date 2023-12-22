package caf.war.LicenseEligibilityTaskImpl.taskclient;

 

import com.webmethods.portal.service.task.ITaskData;
import com.webmethods.caf.faces.data.ContentProviderException;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import com.webmethods.caf.faces.annotations.ExpireWithPageFlow;
import com.webmethods.caf.faces.annotations.DTManagedBean;
import com.webmethods.caf.faces.annotations.BeanType;
 
/**
 * Task Client bean for 'IssueLicenceTask' task.
 */ 
@ManagedBean(name = "IssueLicenceTask")
@SessionScoped
@ExpireWithPageFlow
@DTManagedBean(beanType = BeanType.DEFAULT)
public class IssueLicenceTask extends com.webmethods.caf.faces.data.task.impl.TaskContentProviderExtended {

	private static final long serialVersionUID = 9056187748490907648L;
	
	/**
	 * Globally unique task type id
	 */
	private static final String TASK_TYPE_ID = "1A5B9EF8-7CD4-9650-2260-89701D9EB138";

	/**
	 * Default constructor
	 */
	public IssueLicenceTask() {
		super();
		setTaskTypeID(TASK_TYPE_ID);
	}
	
	/**
	 * Task Data Object
	 */
	public static class TaskData extends com.webmethods.caf.faces.data.task.impl.TaskData {

		private static final long serialVersionUID = 1664558262673747968L;
		 
			
		public static String[][] FIELD_NAMES = new String[][] {{"businessDoc", "BusinessDoc"},
		};


		private caf.war.LicenseEligibilityTaskImpl.is.document.ADESPLicenseMgmt_documents_LicenceIssuanceProc_BusinessDoc businessDoc = null;


		public static final String[] INPUTS = new String[] {"businessDoc", };


		public static final String[] OUTPUTS = new String[] {"businessDoc", };
 
		public TaskData() {
		}

		public caf.war.LicenseEligibilityTaskImpl.is.document.ADESPLicenseMgmt_documents_LicenceIssuanceProc_BusinessDoc getBusinessDoc()  {
			if (businessDoc == null) {
				businessDoc = new caf.war.LicenseEligibilityTaskImpl.is.document.ADESPLicenseMgmt_documents_LicenceIssuanceProc_BusinessDoc();
			}
			return businessDoc;
		}

		public void setBusinessDoc(caf.war.LicenseEligibilityTaskImpl.is.document.ADESPLicenseMgmt_documents_LicenceIssuanceProc_BusinessDoc businessDoc)  {
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