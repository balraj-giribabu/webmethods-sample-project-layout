package caf.war.LicenseEligibilityTaskImpl.is.document;

 import java.io.Serializable;

/**
 * IS document wrapper
 */
public  class ADESPLicenseMgmt_documents_LicenceIssuanceProc_BusinessDoc extends java.lang.Object implements Serializable {

	
	private static final long serialVersionUID = 1L;
	// IS Document type used to generate this class
	public static final String DOCUMENT_TYPE = "ADESPLicenseMgmt.documents.LicenceIssuanceProc:BusinessDoc";

	// Used by Designer to access the source document.
	 @SuppressWarnings("unused")
	private static final String DOCUMENT_SRC = "http://localhost:5555";
	private java.lang.String requestId;
	private java.lang.String requestType;
	private java.lang.String licenceType;
	private java.lang.String action;
	private java.lang.String status;
	private java.lang.String processId;
	private int childCount;
	private java.lang.String interfaceId;
	private java.lang.String isChildTask;
	private java.lang.String notificationId;
	private java.lang.String[] companyAssignees = null;
	private java.lang.String isLicenceFeeRequired;
	public static String[][] FIELD_NAMES = new String[][] {{"requestId", "requestId"},{"requestType", "requestType"},{"licenceType", "licenceType"},{"action", "action"},{"status", "status"},{"processId", "processId"},{"childCount", "childCount"},{"interfaceId", "interfaceId"},{"isChildTask", "isChildTask"},{"notificationId", "notificationId"},{"companyAssignees", "companyAssignees"},{"isLicenceFeeRequired", "isLicenceFeeRequired"},{"taskConfig", "taskConfig"},
	};
	private caf.war.LicenseEligibilityTaskImpl.is.document.IXCommon_documents_TaskConfig[] taskConfig = null;

	
	public ADESPLicenseMgmt_documents_LicenceIssuanceProc_BusinessDoc() {
	}


	public java.lang.String getRequestId()  {
		
		return requestId;
	}


	public void setRequestId(java.lang.String requestId)  {
		this.requestId = requestId;
	}


	public java.lang.String getRequestType()  {
		
		return requestType;
	}


	public void setRequestType(java.lang.String requestType)  {
		this.requestType = requestType;
	}


	public java.lang.String getLicenceType()  {
		
		return licenceType;
	}


	public void setLicenceType(java.lang.String licenceType)  {
		this.licenceType = licenceType;
	}


	public java.lang.String getAction()  {
		
		return action;
	}


	public void setAction(java.lang.String action)  {
		this.action = action;
	}


	public java.lang.String getStatus()  {
		
		return status;
	}


	public void setStatus(java.lang.String status)  {
		this.status = status;
	}


	public java.lang.String getProcessId()  {
		
		return processId;
	}


	public void setProcessId(java.lang.String processId)  {
		this.processId = processId;
	}


	public int getChildCount()  {
		
		return childCount;
	}


	public void setChildCount(int childCount)  {
		this.childCount = childCount;
	}


	public java.lang.String getInterfaceId()  {
		
		return interfaceId;
	}


	public void setInterfaceId(java.lang.String interfaceId)  {
		this.interfaceId = interfaceId;
	}


	public java.lang.String getIsChildTask()  {
		
		return isChildTask;
	}


	public void setIsChildTask(java.lang.String isChildTask)  {
		this.isChildTask = isChildTask;
	}


	public java.lang.String getNotificationId()  {
		
		return notificationId;
	}


	public void setNotificationId(java.lang.String notificationId)  {
		this.notificationId = notificationId;
	}


	public java.lang.String[] getCompanyAssignees()  {
		if (companyAssignees == null) {
			//TODO: create/set default value here
		}
		return companyAssignees;
	}


	public void setCompanyAssignees(java.lang.String[] companyAssignees)  {
		this.companyAssignees = companyAssignees;
	}


	public java.lang.String getIsLicenceFeeRequired()  {
		
		return isLicenceFeeRequired;
	}


	public void setIsLicenceFeeRequired(java.lang.String isLicenceFeeRequired)  {
		this.isLicenceFeeRequired = isLicenceFeeRequired;
	}


	public caf.war.LicenseEligibilityTaskImpl.is.document.IXCommon_documents_TaskConfig[] getTaskConfig()  {
		if (taskConfig == null) {
			//TODO: create/set default value here
		}
		return taskConfig;
	}


	public void setTaskConfig(caf.war.LicenseEligibilityTaskImpl.is.document.IXCommon_documents_TaskConfig[] taskConfig)  {
		this.taskConfig = taskConfig;
	}
	
	

}