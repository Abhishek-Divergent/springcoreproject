package com.divergentsl.springcore.javabasedconfiguration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StudentDemoContainer {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(javaconfig.class);
		context.getEnvironment().setActiveProfiles("Dev");
		context.register(javaconfig.class);
		Student student=context.getBean("Student",Student.class);
		System.out.println(student);
	}

}
