package com.interfaceExample2;

public class ForInterfaceClass implements Firstinterface ,SecondInterface {
   //using constructor in interface
	ForInterfaceClass(){
		System.out.println("hi this vicky");
	}
	
    public void display() {
	System.out.println("dlkjfodsif");
	
}
   public void mouse () {
	System.out.println("jfhjkdhfkjg");
}
	public static void main(String[] args) {
		
       ForInterfaceClass vicky = new ForInterfaceClass();
       vicky.display();
       vicky.mouse();
       
       ForInterfaceClass vic = new ForInterfaceClass();
       
	}

}
