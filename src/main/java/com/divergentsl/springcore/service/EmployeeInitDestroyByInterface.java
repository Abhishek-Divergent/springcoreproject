package com.divergentsl.springcore.service;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class EmployeeInitDestroyByInterface implements InitializingBean, DisposableBean {
	String mobile;

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public EmployeeInitDestroyByInterface() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println(" init By Interface ");
	}

	public void destroy() throws Exception {
		System.out.println("Destroy Interface");
	}

}
