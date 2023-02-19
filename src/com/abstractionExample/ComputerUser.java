package com.abstractionExample;

public abstract class ComputerUser {
	
	public  abstract void keyboard();
	public abstract void mouse();
	 static void display() {
		System.out.println("displaying everything quick");
	}

	public static void main(String[] args) {
		
		display();
		
			}
	
}
