package com.springcore.ci;

public class Addition {
	private int a;
	private int b;

	public Addition(double a, double b) {
		System.out.println("double,double");
		this.a = (int) a;
		this.b = (int) b;
	}

	public Addition(int a, int b) {
		System.out.println("int ,int");
		this.a = a;
		this.b = b;
	}

//	public Addition(String a, String b) {
//		System.out.println("String, String");
//		this.a = Integer.parseInt(a);
//		this.b = Integer.parseInt(b);
//	}

	public void doSum() {
		System.out.println("the value of a:" + this.a);
		System.out.println("the value of b:" + this.b);
		System.out.println("Sum is :" + (this.a + this.b));
	}

}
