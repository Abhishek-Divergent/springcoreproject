package com.divergentsl.springcore.ioc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.divergentsl.springcore.service.FactoryMethodService;

public class FactoryMethodServiceContainer {
	@SuppressWarnings("unused")
	private final static Logger myLogger = LoggerFactory.getLogger(StudentApplicationContainer.class.getName());

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("studentconfig.xml");
		FactoryMethodService f1 = (FactoryMethodService) context.getBean("factorymethodid");
		f1.printMethod();

	}
}
