package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcore/lifecycle/lifeconfig.xml");

		// registering shutdown hook to call the destroy function
		context.registerShutdownHook();

//		Samosa s1 = (Samosa) context.getBean("s1");
//		System.out.println(s1);

//		Pepsi p1 = (Pepsi) context.getBean("p1");
//		System.out.println(p1);

		Example sub = (Example) context.getBean("sub");
		System.out.println(sub);
	}

}
