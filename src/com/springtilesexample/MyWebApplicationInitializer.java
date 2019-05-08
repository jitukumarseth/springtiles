package com.springtilesexample;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;


public class MyWebApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("MyWebApplicationInitializer-getRootConfigClasses");
		return new Class[] {JlcConfig.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("MyWebApplicationInitializer-getServletConfigClasses");
		return new Class[] {JlcConfig.class};
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("MyWebApplicationInitializer-getServletMappings");
				return new String[] {"*.jlc"};
	}
	
	

}
