package com.springcore.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcore/collection/collectionconfig.xml");
		Emp emp = (Emp) context.getBean("emp1");

		System.out.println(emp.getEmpName());
		System.out.println(emp.getcontacts());
		System.out.println(emp.getAddresses());
		System.out.println(emp.getCourses());
		System.out.println(emp.getProps());

	}

}
