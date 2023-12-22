/**
 * 
 */
package caf.war.LicenseEligibilityTaskImpl;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ApplicationScoped;
import com.webmethods.caf.faces.annotations.DTManagedBean;
import com.webmethods.caf.faces.annotations.BeanType;

/**
 * @author Lalith Podduturi
 *
 */
@ManagedBean(name = "LicenseEligibilityTaskImpl")
@ApplicationScoped
@DTManagedBean(displayName = "LicenseEligibilityTaskImpl", beanType = BeanType.APPLICATION)
public class LicenseEligibilityTaskImpl extends com.webmethods.caf.faces.bean.BaseApplicationBean 
{
	public LicenseEligibilityTaskImpl()
	{
		super();
		setCategoryName( "CafApplication" );
		setSubCategoryName( "LicenseEligibilityTaskImpl" );
	}
}