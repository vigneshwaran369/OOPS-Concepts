package com.abstractionExample;

public class LaptopUsers extends ComputerUser{
	public void keyboard() {
		System.out.println("abc available");
		
	}
	public void mouse() {
		System.out.println("showing everything");
	}
	public static void main(String[] args) {
		
		ComputerUser vicky = new LaptopUsers();
		vicky.keyboard();
		vicky.mouse();
		display();
	
		

	}

}
