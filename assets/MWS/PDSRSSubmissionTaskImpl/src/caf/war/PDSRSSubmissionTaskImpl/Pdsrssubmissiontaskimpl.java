/**
 * 
 */
package caf.war.PDSRSSubmissionTaskImpl;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ApplicationScoped;
import com.webmethods.caf.faces.annotations.DTManagedBean;
import com.webmethods.caf.faces.annotations.BeanType;

/**
 * @author Administrator
 *
 */
@ManagedBean(name = "Pdsrssubmissiontaskimpl")
@ApplicationScoped
@DTManagedBean(displayName = "PDSRSSubmissionTaskImpl", beanType = BeanType.APPLICATION)
public class Pdsrssubmissiontaskimpl extends com.webmethods.caf.faces.bean.BaseApplicationBean 
{
	public Pdsrssubmissiontaskimpl()
	{
		super();
		setCategoryName( "CafApplication" );
		setSubCategoryName( "PDSRSSubmissionTaskImpl" );
	}
}