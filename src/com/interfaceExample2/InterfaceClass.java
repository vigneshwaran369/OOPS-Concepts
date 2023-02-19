package com.interfaceExample2;

public class InterfaceClass implements NewOneForInterfaceA,NewOneForInterfaceB{
	
	@Override
	public void schoolName() {
    System.out.println("SKV Higher sec school");
	}
	@Override
	public void schoolAddress() {
    System.out.println("kunnathur - Madurai");		
	}
    @Override
	public void className() {
	System.out.println("Section F");
	}
	@Override
	public void studentName() {
    System.out.println("Name : vicky");
	}
	@Override
	public void teacherName() {
	System.out.println("Anbumaniramathas");
	}
	public static void main(String[] args) {
		InterfaceClass vik = new InterfaceClass();
		vik.schoolName();
		vik.schoolAddress();
		vik.studentName();
		vik.className();
		vik.teacherName();



	}

}
