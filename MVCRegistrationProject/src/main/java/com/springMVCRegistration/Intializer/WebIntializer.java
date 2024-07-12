
package com.springMVCRegistration.Intializer;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.springMVCRegistration.Config.MySecurityConfig;
import com.springMVCRegistration.Config.RegisterPageConfig;
import com.springMVCRegistration.Controller.SecurityClass;

public class WebIntializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		Class[] configFiles = { MySecurityConfig.class };
		return configFiles;
	
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
//	 Class[] g= {RegisterPageConfig.class};
	 Class[] g= {SecurityClass.class};
		return g;
	}

	@Override
	protected String[] getServletMappings() {
		String[] defaultMapping = { "/" };
		return defaultMapping;
	}

}
