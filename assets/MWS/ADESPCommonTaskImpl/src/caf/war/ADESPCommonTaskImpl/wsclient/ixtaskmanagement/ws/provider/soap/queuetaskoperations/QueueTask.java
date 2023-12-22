package caf.war.ADESPCommonTaskImpl.wsclient.ixtaskmanagement.ws.provider.soap.queuetaskoperations;


import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import com.webmethods.caf.faces.annotations.ExpireWithPageFlow;
import com.webmethods.caf.faces.annotations.DTManagedBean;
import com.webmethods.caf.faces.annotations.BeanType;

/**
 * Web Service Client bean generated for 
 * caf.war.ADESPCommonTaskImpl.wsclient.ixtaskmanagement.ws.provider.soap.queuetaskoperations.IXTaskManagementWsProviderSoapQueueTaskOperationsStub.queueTask.
 */
@ManagedBean(name = "QueueTask")
@SessionScoped
@ExpireWithPageFlow
@DTManagedBean(beanType = BeanType.DEFAULT)
public class QueueTask extends com.webmethods.caf.faces.data.ws.wss.WSSContentProvider {

	private static final long serialVersionUID = 7456103681935752192L;
	
	/**
	 * Constructor
	 */
	public QueueTask() {
		super(caf.war.ADESPCommonTaskImpl.wsclient.ixtaskmanagement.ws.provider.soap.queuetaskoperations.IXTaskManagementWsProviderSoapQueueTaskOperationsStub.class,  // port type proxy class
			"queueTask", // method to invoke
			new String[] { "queueTask", } // method parameter names
		);
		
		// init wsclient
		initParams();
		
		
		// parameters bean
		parameters = new Parameters();
			
		// initial result
		result = null;
	}
	
	
	/**
	 * Method parameters bean
	 */
	public class Parameters implements Serializable {

		private static final long serialVersionUID = 1626708446506544128L;
		
		public Parameters() {
		}
	
	  
		private caf.war.ADESPCommonTaskImpl.wsclient.ixtaskmanagement.ws.provider.soap.queuetaskoperations.IXTaskManagementWsProviderSoapQueueTaskOperationsStub.QueueTaskE queueTask  = new  caf.war.ADESPCommonTaskImpl.wsclient.ixtaskmanagement.ws.provider.soap.queuetaskoperations.IXTaskManagementWsProviderSoapQueueTaskOperationsStub.QueueTaskE() ;

		public caf.war.ADESPCommonTaskImpl.wsclient.ixtaskmanagement.ws.provider.soap.queuetaskoperations.IXTaskManagementWsProviderSoapQueueTaskOperationsStub.QueueTaskE getQueueTask() {
			return queueTask;
		}

		public void setQueueTask(caf.war.ADESPCommonTaskImpl.wsclient.ixtaskmanagement.ws.provider.soap.queuetaskoperations.IXTaskManagementWsProviderSoapQueueTaskOperationsStub.QueueTaskE queueTask) {
			this.queueTask = queueTask;
		}
		
	}
	
	/**
	 * Return method invocation parameters bean
	 */
	public Parameters getParameters() {
		return (Parameters)parameters;
	}	
	


	
	/**
	 * Return method invocation result bean
	 */
	public caf.war.ADESPCommonTaskImpl.wsclient.ixtaskmanagement.ws.provider.soap.queuetaskoperations.IXTaskManagementWsProviderSoapQueueTaskOperationsStub.QueueTaskResponseE getResult() {
		return (caf.war.ADESPCommonTaskImpl.wsclient.ixtaskmanagement.ws.provider.soap.queuetaskoperations.IXTaskManagementWsProviderSoapQueueTaskOperationsStub.QueueTaskResponseE)result;
	}
	
	
}