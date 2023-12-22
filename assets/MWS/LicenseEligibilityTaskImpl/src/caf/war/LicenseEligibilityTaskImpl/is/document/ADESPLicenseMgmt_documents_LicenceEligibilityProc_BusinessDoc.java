package caf.war.LicenseEligibilityTaskImpl.is.document;

 import java.io.Serializable;

/**
 * IS document wrapper
 */
public  class ADESPLicenseMgmt_documents_LicenceEligibilityProc_BusinessDoc extends java.lang.Object implements Serializable {

	
	private static final long serialVersionUID = 1L;
	// IS Document type used to generate this class
	public static final String DOCUMENT_TYPE = "ADESPLicenseMgmt.documents.LicenceEligibilityProc:BusinessDoc";

	// Used by Designer to access the source document.
	 @SuppressWarnings("unused")
	private static final String DOCUMENT_SRC = "http://localhost:5555";
	private java.lang.String requestId;
	private java.lang.String requestType;
	private java.lang.String licenceType;
	private java.lang.String processType;
	private java.lang.String publicNoticeId;
	private java.lang.String action;
	private java.lang.String status;
	private java.lang.String interfaceId;
	private java.lang.String processId;
	private int childCount;
	private java.lang.String notificationId;
	private java.lang.String isChildTask;
	private java.lang.String[] companyAssignees = null;
	private java.lang.String licenceNumber;
	private java.lang.String applicantId;
	private java.lang.String applicantName;
	private java.lang.String licenceApplicationNumber;
	private java.lang.String submittedByName;
	private java.lang.String regulatedActivity;
	private java.lang.String regulatedActivityType;
	private java.lang.String location;
	private java.lang.String paymentRequestNumber;
	private java.lang.String remarks;
	public static String[][] FIELD_NAMES = new String[][] {{"requestId", "requestId"},{"requestType", "requestType"},{"licenceType", "licenceType"},{"processType", "processType"},{"publicNoticeId", "publicNoticeId"},{"action", "action"},{"status", "status"},{"interfaceId", "interfaceId"},{"processId", "processId"},{"childCount", "childCount"},{"notificationId", "notificationId"},{"isChildTask", "isChildTask"},{"companyAssignees", "companyAssignees"},{"licenceNumber", "licenceNumber"},{"applicantId", "applicantId"},{"applicantName", "applicantName"},{"licenceApplicationNumber", "licenceApplicationNumber"},{"submittedByName", "submittedByName"},{"regulatedActivity", "regulatedActivity"},{"regulatedActivityType", "regulatedActivityType"},{"location", "location"},{"paymentRequestNumber", "paymentRequestNumber"},{"remarks", "remarks"},{"taskConfig", "taskConfig"},
	};
	private caf.war.LicenseEligibilityTaskImpl.is.document.IXCommon_documents_TaskConfig[] taskConfig = null;

	
	public ADESPLicenseMgmt_documents_LicenceEligibilityProc_BusinessDoc() {
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


	public java.lang.String getProcessType()  {
		
		return processType;
	}


	public void setProcessType(java.lang.String processType)  {
		this.processType = processType;
	}


	public java.lang.String getPublicNoticeId()  {
		
		return publicNoticeId;
	}


	public void setPublicNoticeId(java.lang.String publicNoticeId)  {
		this.publicNoticeId = publicNoticeId;
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


	public java.lang.String getInterfaceId()  {
		
		return interfaceId;
	}


	public void setInterfaceId(java.lang.String interfaceId)  {
		this.interfaceId = interfaceId;
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


	public java.lang.String getNotificationId()  {
		
		return notificationId;
	}


	public void setNotificationId(java.lang.String notificationId)  {
		this.notificationId = notificationId;
	}


	public java.lang.String getIsChildTask()  {
		
		return isChildTask;
	}


	public void setIsChildTask(java.lang.String isChildTask)  {
		this.isChildTask = isChildTask;
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


	public java.lang.String getLicenceNumber()  {
		
		return licenceNumber;
	}


	public void setLicenceNumber(java.lang.String licenceNumber)  {
		this.licenceNumber = licenceNumber;
	}


	public java.lang.String getApplicantId()  {
		
		return applicantId;
	}


	public void setApplicantId(java.lang.String applicantId)  {
		this.applicantId = applicantId;
	}


	public java.lang.String getApplicantName()  {
		
		return applicantName;
	}


	public void setApplicantName(java.lang.String applicantName)  {
		this.applicantName = applicantName;
	}


	public java.lang.String getLicenceApplicationNumber()  {
		
		return licenceApplicationNumber;
	}


	public void setLicenceApplicationNumber(java.lang.String licenceApplicationNumber)  {
		this.licenceApplicationNumber = licenceApplicationNumber;
	}


	public java.lang.String getSubmittedByName()  {
		
		return submittedByName;
	}


	public void setSubmittedByName(java.lang.String submittedByName)  {
		this.submittedByName = submittedByName;
	}


	public java.lang.String getRegulatedActivity()  {
		
		return regulatedActivity;
	}


	public void setRegulatedActivity(java.lang.String regulatedActivity)  {
		this.regulatedActivity = regulatedActivity;
	}


	public java.lang.String getRegulatedActivityType()  {
		
		return regulatedActivityType;
	}


	public void setRegulatedActivityType(java.lang.String regulatedActivityType)  {
		this.regulatedActivityType = regulatedActivityType;
	}


	public java.lang.String getLocation()  {
		
		return location;
	}


	public void setLocation(java.lang.String location)  {
		this.location = location;
	}


	public java.lang.String getPaymentRequestNumber()  {
		
		return paymentRequestNumber;
	}


	public void setPaymentRequestNumber(java.lang.String paymentRequestNumber)  {
		this.paymentRequestNumber = paymentRequestNumber;
	}


	public java.lang.String getRemarks()  {
		
		return remarks;
	}


	public void setRemarks(java.lang.String remarks)  {
		this.remarks = remarks;
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