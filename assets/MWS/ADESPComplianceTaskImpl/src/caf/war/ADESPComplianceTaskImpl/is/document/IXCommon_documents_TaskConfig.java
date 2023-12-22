package caf.war.ADESPComplianceTaskImpl.is.document;

 import java.io.Serializable;

/**
 * IS document wrapper
 */
public  class IXCommon_documents_TaskConfig extends java.lang.Object implements Serializable {

	
	private static final long serialVersionUID = 1L;
	// IS Document type used to generate this class
	public static final String DOCUMENT_TYPE = "IXCommon.documents:TaskConfig";
	private java.lang.String taskName;
	private java.lang.String[] assignee = null;
	private caf.war.ADESPComplianceTaskImpl.is.document.IXCommon_documents_TaskConfig.Actions[] actions = null;
	private boolean isParallel;
	public static String[][] FIELD_NAMES = new String[][] {{"taskName", "taskName"},{"assignee", "assignee"},{"actions", "actions"},{"isParallel", "isParallel"},{"userType", "userType"},
	};
	private java.lang.String userType;

	// Used by Designer to access the source document.
	 @SuppressWarnings("unused")
	

	
	public IXCommon_documents_TaskConfig() {
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
		private java.lang.String notificationId;
		public static String[][] FIELD_NAMES = new String[][] {{"actionName", "actionName"},{"statusCode", "statusCode"},{"notificationId", "notificationId"},{"button", "button"},
		};
		private java.lang.String button;
		
	
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


		public java.lang.String getButton()  {
			
			return button;
		}


		public void setButton(java.lang.String button)  {
			this.button = button;
		}
		
		
	
	}

	public caf.war.ADESPComplianceTaskImpl.is.document.IXCommon_documents_TaskConfig.Actions[] getActions()  {
		if (actions == null) {
			//TODO: create/set default value here
		}
		return actions;
	}

	public void setActions(caf.war.ADESPComplianceTaskImpl.is.document.IXCommon_documents_TaskConfig.Actions[] actions)  {
		this.actions = actions;
	}

	public boolean getIsParallel()  {
		
		return isParallel;
	}

	public void setIsParallel(boolean isParallel)  {
		this.isParallel = isParallel;
	}

	public java.lang.String getUserType()  {
		
		return userType;
	}

	public void setUserType(java.lang.String userType)  {
		this.userType = userType;
	}
	
	

}