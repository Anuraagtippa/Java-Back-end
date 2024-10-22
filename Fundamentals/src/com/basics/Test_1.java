package com.basics;


class Code{

	@Override
	public String toString() {
		return "hi";
	}
	
	
}
public class Test_1 {
	
	public static void main(String[] args) {
	Code cd = new Code();
	System.out.println(cd);
	
	Code cd2 = new Code();
	System.out.println(cd2.hashCode());
	
	Code cd3 = new Code();
	System.out.println(cd3.toString());
	
//	 Code cd2 = new Code(); System.out.println(cd2);
//	 
//	 Code cd3= cd2; System.out.println(cd3.hashCode()); 
	 
//	 .hashCode() function is defined inside the object class(parent class)
//	 .toString() function can also be used to fetch the address of the class.
	 
	 
	}

}
