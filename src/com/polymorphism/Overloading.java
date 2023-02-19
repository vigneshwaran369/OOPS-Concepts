package com.polymorphism;

public class Overloading {

	public void thisIsMy() {

		System.out.println("mobile");
	}
	public void thisIsMy(int lapNo) {
		System.out.println(lapNo);
	}
	public void thisIsMy(int a, int b) {
		System.out.println(a+","+b);
	}
	public void thisIsMy(String a,String b) {
		System.out.println(a+","+b);
		
		}
	public static void main(String[] args) {
Overloading vic = new Overloading();
vic.thisIsMy(45);
vic.thisIsMy();
vic.thisIsMy(56, 3450);
vic.thisIsMy("vicky"  ,  "vicky");
	}

}
