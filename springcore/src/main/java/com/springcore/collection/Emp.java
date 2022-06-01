package com.springcore.collection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Emp {
	private String EmpName;
	private List<String> contacts;
	private Set<String> addresses;
	private Map<String, String> courses;
	private Properties props;

	public String getEmpName() {
		return EmpName;
	}

	public void setEmpName(String empName) {
		EmpName = empName;
	}

	public List<String> getcontacts() {
		return contacts;
	}

	public void setcontacts(List<String> contacts) {
		this.contacts = contacts;
	}

	public Set<String> getAddresses() {
		return addresses;
	}

	public void setAddresses(Set<String> addresses) {
		this.addresses = addresses;
	}

	public Map<String, String> getCourses() {
		return courses;
	}

	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}

	public List<String> getContacts() {
		return contacts;
	}

	public void setContacts(List<String> contacts) {
		this.contacts = contacts;
	}

	public Properties getProps() {
		return props;
	}

	public void setProps(Properties props) {
		this.props = props;
	}

	public Emp(String empName, List<String> contacts, Set<String> addresses, Map<String, String> courses,
			Properties props) {
		super();
		EmpName = empName;
		this.contacts = contacts;
		this.addresses = addresses;
		this.courses = courses;
		this.props = props;
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

}
