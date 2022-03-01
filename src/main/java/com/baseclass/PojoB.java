package com.baseclass;

public class PojoB {
	
	public static void main(String[] args) {
		
		PojoA a=new PojoA();
		
		int a2 = a.getA();
		
		System.out.println("the value a is " +a2);
		
		a.setA(1000);
		
		int a3 = a.getA();
		
		System.out.println("Updated value is " +a3);
		
		
	}

}
