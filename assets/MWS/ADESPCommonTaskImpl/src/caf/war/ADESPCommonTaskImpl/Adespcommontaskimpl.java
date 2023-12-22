/**
 * 
 */
package caf.war.ADESPCommonTaskImpl;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ApplicationScoped;
import com.webmethods.caf.faces.annotations.DTManagedBean;
import com.webmethods.caf.faces.annotations.BeanType;

/**
 * @author Administrator
 *
 */
@ManagedBean(name = "Adespcommontaskimpl")
@ApplicationScoped
@DTManagedBean(displayName = "ADESPCommonTaskImpl", beanType = BeanType.APPLICATION)
public class Adespcommontaskimpl extends com.webmethods.caf.faces.bean.BaseApplicationBean 
{
	public Adespcommontaskimpl()
	{
		super();
		setCategoryName( "CafApplication" );
		setSubCategoryName( "ADESPCommonTaskImpl" );
	}
}