package com.basics;


//Object.class is the default parent class for every class.

//Default package is java.lang:

public class TypeCast {
	
	static Object obj;
	
	public static void main(String[] args) {
		//data_type varName = value;
		
		//Implicit type casting 
		
		byte a = 10;
		short b =a;
		System.out.println(a+" "+b);
		
		//Explicit type casting 
		
		int x = 234;
		byte y = (byte)x;
		System.out.println(x+" "+y);
		
		
		
		// ClassName varName = new ClassName(); : Syntax for creating an Object
		TypeCast tc = new TypeCast();
		obj = tc;
		//Why no error? 
		//Because obj type variable can store any oother variable as obj is the parent class. But the other classes cannot store the obj type variable.
		
	}

}
