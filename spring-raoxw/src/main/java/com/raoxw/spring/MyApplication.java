package com.raoxw.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MutablePropertySources;

import java.util.Map;

public class MyApplication {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
		//禁用循环依赖
		//context.setAllowCircularReferences(false);
		//context.refresh();
		//ConfigurableEnvironment environment = context.getEnvironment();
		//Map<String, Object> systemEnvironment = environment.getSystemEnvironment();
		//System.out.println(systemEnvironment);
		//Map<String, Object> systemProperties = environment.getSystemProperties();
		//System.out.println(systemProperties);
		User user = context.getBean(User.class);
		System.out.println(user);
	}
}
