package com.SpringMVC.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class WebApplications implements WebApplicationInitializer {

	public void onStartup(ServletContext servletContext) throws ServletException {
		
		System.out.println("Custom class Loaded .......");

		XmlWebApplicationContext web = new XmlWebApplicationContext();

		web.setConfigLocation("classpath:application-fileConfig.xml");
		System.out.println("applicATION FILE LOASS");

		DispatcherServlet servlet = new DispatcherServlet(web);

		ServletRegistration.Dynamic mycustom = servletContext.addServlet("myweb", servlet);
		mycustom.setLoadOnStartup(1);
		mycustom.addMapping("/websitePage/");
	}

}
