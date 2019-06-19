package com.cafe24.initializer;

import javax.servlet.Filter;

import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.cafe24.jblog.config.AppConfig;
import com.cafe24.jblog.config.WebConfig;


public class SpringInit extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		
		return new Class<?>[] {AppConfig.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		return new Class<?>[] {WebConfig.class};
	}

	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		return new String[] {"/"};
	}

	@Override
	protected Filter[] getServletFilters() {
		return new Filter[] {new CharacterEncodingFilter("UTF-8",true)};
	}
	
	/*
	 * @Override protected FrameworkServlet
	 * createDispatcherServlet(WebApplicationContext servletAppContext) { //부모가 만든
	 * 것을 일부 설정을 수정해서 다시 보내준다 DispatcherServlet dispatcherServlet =
	 * (DispatcherServlet)super.createDispatcherServlet(servletAppContext);
	 * dispatcherServlet.setThrowExceptionIfNoHandlerFound(true); return
	 * dispatcherServlet; }
	 */

}
