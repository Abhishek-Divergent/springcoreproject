package com.divergentsl.springcore.ioc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.divergentsl.springcore.service.FactoryMethodService;
import com.divergentsl.springcore.service.Student;

/** This class  is container class it will perform all operation
 * to instantiate the application class
 * to configure the object
 * to assemble the dependencies between the objects
 * 
 * @author JAI MAHAKAL
 *
 */
public class StudentApplicationContainer {
	private final static Logger myLogger = LoggerFactory.getLogger(StudentApplicationContainer.class.getName());
	public static void main(String[] args) {
		myLogger.info("Container start");
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("studentconfiguration.xml");
		Student student = (Student) context.getBean("studentid");
		myLogger.info(" " + student);
		FactoryMethodService service = (FactoryMethodService) context.getBean("factorymethodid");
		service.printMethod();
		myLogger.info("Container End");
	}
}
