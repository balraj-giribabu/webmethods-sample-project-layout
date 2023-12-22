package caf.war.LicenseEligibilityTaskImpl.is.document;

 import java.io.Serializable;

/**
 * IS document wrapper
 */
public  class ADESPLicenseMgmt_documents_TaskConfig extends java.lang.Object implements Serializable {

	
	private static final long serialVersionUID = 1L;
	// IS Document type used to generate this class
	public static final String DOCUMENT_TYPE = "ADESPLicenseMgmt.documents:TaskConfig";
	private java.lang.String taskName;
	private java.lang.String[] assignee = null;
	private caf.war.LicenseEligibilityTaskImpl.is.document.ADESPLicenseMgmt_documents_TaskConfig.Actions[] actions = null;
	public static String[][] FIELD_NAMES = new String[][] {{"taskName", "taskName"},{"assignee", "assignee"},{"actions", "actions"},{"isParallel", "isParallel"},
	};
	private boolean isParallel;

	// Used by Designer to access the source document.
	 @SuppressWarnings("unused")
	

	
	public ADESPLicenseMgmt_documents_TaskConfig() {
	}

	public java.lang.String getTaskName()  {
		
		return taskName;
	}

	public void setTaskName(java.lang.String taskName)  {
		this.taskName = taskName;
	}

	public java.lang.String[] getAssignee()  {
		if (assignee == null) {
			//TODO: create/set default value here
		}
		return assignee;
	}

	public void setAssignee(java.lang.String[] assignee)  {
		this.assignee = assignee;
	}

	/**
	 * IS document wrapper
	 */
	public static class Actions extends java.lang.Object implements Serializable {
	
		
		private static final long serialVersionUID = 1L;
		private java.lang.String actionName;
		private java.lang.String statusCode;
		public static String[][] FIELD_NAMES = new String[][] {{"actionName", "actionName"},{"statusCode", "statusCode"},{"notificationId", "notificationId"},
		};
		private java.lang.String notificationId;
		
	
		// Used by Designer to access the source document.
		 @SuppressWarnings("unused")
		
	
		
		public Actions() {
		}


		public java.lang.String getActionName()  {
			
			return actionName;
		}


		public void setActionName(java.lang.String actionName)  {
			this.actionName = actionName;
		}


		public java.lang.String getStatusCode()  {
			
			return statusCode;
		}


		public void setStatusCode(java.lang.String statusCode)  {
			this.statusCode = statusCode;
		}


		public java.lang.String getNotificationId()  {
			
			return notificationId;
		}


		public void setNotificationId(java.lang.String notificationId)  {
			this.notificationId = notificationId;
		}
		
		
	
	}

	public caf.war.LicenseEligibilityTaskImpl.is.document.ADESPLicenseMgmt_documents_TaskConfig.Actions[] getActions()  {
		if (actions == null) {
			//TODO: create/set default value here
		}
		return actions;
	}

	public void setActions(caf.war.LicenseEligibilityTaskImpl.is.document.ADESPLicenseMgmt_documents_TaskConfig.Actions[] actions)  {
		this.actions = actions;
	}

	public boolean getIsParallel()  {
		
		return isParallel;
	}

	public void setIsParallel(boolean isParallel)  {
		this.isParallel = isParallel;
	}
	
	

}