package com.abstractionExample;

public class NewOnePartialAbstaction1 extends NewOnePartialAbstraction {

	
	@Override
	public void buyThisColourShirt() {
      System.out.println("White");
		
	}
	@Override
	public void buyThisColourPant() {
 System.out.println("Black");		
	}
	public static void main(String[] args) {
		
		NewOnePartialAbstaction1 dress= new NewOnePartialAbstaction1();
		
		dress.buyThisColourPant();
		dress.buyThisColourShirt();
		dress.buyThisdress();

	}

}
