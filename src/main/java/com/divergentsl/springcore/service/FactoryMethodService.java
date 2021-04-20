package com.divergentsl.springcore.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.divergentsl.springcore.ioc.StudentApplicationContainer;

public class FactoryMethodService {
	private final static Logger myLogger = LoggerFactory.getLogger(StudentApplicationContainer.class.getName());
	private static FactoryMethodService obj = new FactoryMethodService();

	private FactoryMethodService() {

	}

	public static FactoryMethodService getInstance() {

		return obj;
	}

	public void printMethod() {
		myLogger.info(" This is  Factory Method Service class :");
	}
}
