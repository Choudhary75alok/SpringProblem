package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

// implementing bean lifecycle using annotation
public class Example {
	private String subject;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "Example [subject=" + subject + "]";
	}

	@PostConstruct
	public void Cool() {
		System.out.println("init method");
	}

	@PreDestroy
	public void hot() {
		System.out.println("destroy method");
	}

}
