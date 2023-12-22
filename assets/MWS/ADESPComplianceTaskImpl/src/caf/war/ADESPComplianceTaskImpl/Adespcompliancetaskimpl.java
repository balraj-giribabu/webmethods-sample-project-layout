/**
 * 
 */
package caf.war.ADESPComplianceTaskImpl;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ApplicationScoped;
import com.webmethods.caf.faces.annotations.DTManagedBean;
import com.webmethods.caf.faces.annotations.BeanType;

/**
 * @author Administrator
 *
 */
@ManagedBean(name = "Adespcompliancetaskimpl")
@ApplicationScoped
@DTManagedBean(displayName = "ADESPComplianceTaskImpl", beanType = BeanType.APPLICATION)
public class Adespcompliancetaskimpl extends com.webmethods.caf.faces.bean.BaseApplicationBean 
{
	public Adespcompliancetaskimpl()
	{
		super();
		setCategoryName( "CafApplication" );
		setSubCategoryName( "ADESPComplianceTaskImpl" );
	}
}