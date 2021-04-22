package com.divergentsl.springcore.javabasedconfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StudentDemoContainer {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(javaconfig.class);
		Student student = applicationContext.getBean(Student.class);
		System.out.println(student);

	}

}
