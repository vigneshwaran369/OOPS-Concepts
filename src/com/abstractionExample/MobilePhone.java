package com.abstractionExample;

public class MobilePhone extends ComputerUser {

	public void displayInMobile() {
		System.out.println("small size and handfull");
	}
	public void keyboard() {
		System.out.println("abc available6666");
		
	}
	public void mouse() {
		System.out.println("showing everything6666");
		
	}
	
	public static void main(String[] args) {
             MobilePhone vicky = new MobilePhone();
		
				vicky.displayInMobile();
				vicky.keyboard();
				vicky.mouse();
				display();

		

	}

}
