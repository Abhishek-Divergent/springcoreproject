package com.divergentsl.springcore.ioc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.divergentsl.springcore.service.Student;

/**
 * This class is container class it will perform all operation to instantiate
 * the application class to configure the object to assemble the dependencies
 * between the objects
 * 
 * @author JAI MAHAKAL
 *
 */
public class StudentApplicationContainer {
	private final static Logger myLogger = LoggerFactory.getLogger(StudentApplicationContainer.class.getName());
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		 ApplicationContext context = new ClassPathXmlApplicationContext("studentconfig.xml");
		 Student s1= (Student) context.getBean("student");
         myLogger.info(" "+s1);
	}
}
