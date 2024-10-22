package com.basics;


class Vehicle{
	static String companyName= "TataMotors";
}

public class Variable_2 {

	public static void main(String[] args) {
		//syntax = className.varName;
				System.out.println(Vehicle.companyName); 
		
		
		Vehicle v = new Vehicle();
		Vehicle v2 = new Vehicle();
		
		System.out.println(v.companyName);
		System.out.println(v2.companyName);
		
		v.companyName="fsfs";
		System.out.println(v.companyName);
		System.out.println(v2.companyName);
		
		
		
		
	}

}
