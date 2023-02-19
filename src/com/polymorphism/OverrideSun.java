package com.polymorphism;

public class OverrideSun extends OverrideDad{
	
	public void myProperty() {
		System.out.println("i dont want your property. I have money to buy home");
	}
	public void myProperty2() {
		System.out.println("i dont need land");
	}

	public static void main(String[] args) {

OverrideDad property = new OverrideSun();
property.myProperty();
property.myProperty2();
property.myProperty3();


	}

}
