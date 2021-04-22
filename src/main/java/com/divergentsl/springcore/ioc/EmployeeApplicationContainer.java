package com.divergentsl.springcore.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.divergentsl.springcore.service.EmployeeInitDestroyByAnnotation;
import com.divergentsl.springcore.service.EmployeeInitDestroyByInterface;
import com.divergentsl.springcore.service.EmployeeInitDestroyByMethod;

public class EmployeeApplicationContainer {
	public static void main(String[] args) {
		
		System.out.println("*********************************** Start *******************");
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("employeeconfig.xml");

		System.out.println("***********************************By MEthod*******************");
		EmployeeInitDestroyByMethod byMethod = (EmployeeInitDestroyByMethod) context
				.getBean("EmployeeInitDestroyByMethod");
		System.out.println(byMethod.getAge());
		// to call destroy Method that belongs to AbstractApplicationContext 
		((AbstractApplicationContext) context).registerShutdownHook();
		
		System.out.println("***********************************By Annotation*******************");
		EmployeeInitDestroyByAnnotation annotation=(EmployeeInitDestroyByAnnotation) context.getBean("EmployeeInitDestroyByAnnotation");
		System.out.println(annotation.getName());
		System.out.println("***********************************By Interface **********************");
		EmployeeInitDestroyByInterface annotation2=(EmployeeInitDestroyByInterface) context.getBean("EmployeeInitDestroyByInterface");
	    System.out.println(annotation2.getMobile());
		System.out.println("\n\n***********************************End*******************");
	
	}
}
