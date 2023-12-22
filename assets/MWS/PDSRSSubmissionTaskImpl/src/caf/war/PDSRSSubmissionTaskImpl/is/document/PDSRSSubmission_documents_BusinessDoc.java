package caf.war.PDSRSSubmissionTaskImpl.is.document;

 import java.io.Serializable;

/**
 * IS document wrapper
 */
public  class PDSRSSubmission_documents_BusinessDoc extends java.lang.Object implements Serializable {

	
	private static final long serialVersionUID = 1L;
	// IS Document type used to generate this class
	public static final String DOCUMENT_TYPE = "PDSRSSubmission.documents:BusinessDoc";

	// Used by Designer to access the source document.
	 @SuppressWarnings("unused")
	private static final String DOCUMENT_SRC = "http://localhost:5555";
	private java.lang.String requestId;
	private java.lang.String requestType;
	private java.lang.String processType;
	private java.lang.String action;
	private java.lang.String status;
	private boolean approvalRequired;
	private boolean doeApprovalRequired;
	private java.lang.String interfaceId;
	private java.lang.String processId;
	private int childCount;
	private java.lang.String isChildTask;
	private java.lang.String actedBy;
	private java.lang.String[] companyAssignees = null;
	private java.lang.String notificationId;
	private java.lang.String emailId;
	private java.lang.String applicantName;
	private java.lang.String siteDescription;
	private java.lang.String submittedBy;
	private java.lang.String submittedDate;
	private java.lang.String siteId;
	private java.lang.String applicantId;
	private java.lang.String reportDate;
	public static String[][] FIELD_NAMES = new String[][] {{"requestId", "requestId"},{"requestType", "requestType"},{"processType", "processType"},{"action", "action"},{"status", "status"},{"approvalRequired", "approvalRequired"},{"doeApprovalRequired", "doeApprovalRequired"},{"interfaceId", "interfaceId"},{"processId", "processId"},{"childCount", "childCount"},{"isChildTask", "isChildTask"},{"actedBy", "actedBy"},{"companyAssignees", "companyAssignees"},{"notificationId", "notificationId"},{"emailId", "emailId"},{"applicantName", "applicantName"},{"siteDescription", "siteDescription"},{"submittedBy", "submittedBy"},{"submittedDate", "submittedDate"},{"siteId", "siteId"},{"applicantId", "applicantId"},{"reportDate", "reportDate"},{"taskConfig", "taskConfig"},
	};
	private caf.war.PDSRSSubmissionTaskImpl.is.document.IXCommon_documents_TaskConfig[] taskConfig = null;

	
	public PDSRSSubmission_documents_BusinessDoc() {
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


	public java.lang.String getProcessType()  {
		
		return processType;
	}


	public void setProcessType(java.lang.String processType)  {
		this.processType = processType;
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


	public boolean getApprovalRequired()  {
		
		return approvalRequired;
	}


	public void setApprovalRequired(boolean approvalRequired)  {
		this.approvalRequired = approvalRequired;
	}


	public boolean getDoeApprovalRequired()  {
		
		return doeApprovalRequired;
	}


	public void setDoeApprovalRequired(boolean doeApprovalRequired)  {
		this.doeApprovalRequired = doeApprovalRequired;
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


	public java.lang.String getIsChildTask()  {
		
		return isChildTask;
	}


	public void setIsChildTask(java.lang.String isChildTask)  {
		this.isChildTask = isChildTask;
	}


	public java.lang.String getActedBy()  {
		
		return actedBy;
	}


	public void setActedBy(java.lang.String actedBy)  {
		this.actedBy = actedBy;
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


	public java.lang.String getNotificationId()  {
		
		return notificationId;
	}


	public void setNotificationId(java.lang.String notificationId)  {
		this.notificationId = notificationId;
	}


	public java.lang.String getEmailId()  {
		
		return emailId;
	}


	public void setEmailId(java.lang.String emailId)  {
		this.emailId = emailId;
	}


	public java.lang.String getApplicantName()  {
		
		return applicantName;
	}


	public void setApplicantName(java.lang.String applicantName)  {
		this.applicantName = applicantName;
	}


	public java.lang.String getSiteDescription()  {
		
		return siteDescription;
	}


	public void setSiteDescription(java.lang.String siteDescription)  {
		this.siteDescription = siteDescription;
	}


	public java.lang.String getSubmittedBy()  {
		
		return submittedBy;
	}


	public void setSubmittedBy(java.lang.String submittedBy)  {
		this.submittedBy = submittedBy;
	}


	public java.lang.String getSubmittedDate()  {
		
		return submittedDate;
	}


	public void setSubmittedDate(java.lang.String submittedDate)  {
		this.submittedDate = submittedDate;
	}


	public java.lang.String getSiteId()  {
		
		return siteId;
	}


	public void setSiteId(java.lang.String siteId)  {
		this.siteId = siteId;
	}


	public java.lang.String getApplicantId()  {
		
		return applicantId;
	}


	public void setApplicantId(java.lang.String applicantId)  {
		this.applicantId = applicantId;
	}


	public java.lang.String getReportDate()  {
		
		return reportDate;
	}


	public void setReportDate(java.lang.String reportDate)  {
		this.reportDate = reportDate;
	}


	public caf.war.PDSRSSubmissionTaskImpl.is.document.IXCommon_documents_TaskConfig[] getTaskConfig()  {
		if (taskConfig == null) {
			//TODO: create/set default value here
		}
		return taskConfig;
	}


	public void setTaskConfig(caf.war.PDSRSSubmissionTaskImpl.is.document.IXCommon_documents_TaskConfig[] taskConfig)  {
		this.taskConfig = taskConfig;
	}
	
	

}