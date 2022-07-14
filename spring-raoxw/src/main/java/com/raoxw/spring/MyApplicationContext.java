package com.raoxw.spring;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApplicationContext extends ClassPathXmlApplicationContext {
	public MyApplicationContext(String str) {
		super(str);
	}

	@Override
	protected void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) {
		super.postProcessBeanFactory(beanFactory);
		System.out.println("=============excute MyApplicationContext postProcessBeanFactory===========");
	}
}
