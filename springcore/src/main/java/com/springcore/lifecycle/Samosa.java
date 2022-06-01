package com.springcore.lifecycle;

//implementing life cycle methods using xml configuration

public class Samosa {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("setting the value");
		this.price = price;
	}

	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}

	public void hey() { // init()
		System.out.println("inside init method called: hey how are you??");
	}

	public void bye() { // destroy()
		System.out.println("inside destroyed method called : sorry ! going to die, bye!!");
	}

}
