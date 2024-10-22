package com.basics;


class Student{
	  int studentId = 101; //instance variable:

	@Override
	public String toString() {
		return ""+studentId;
	}
	
	
}

public class Variable_1 {

	public static void main(String[] args) {
		
		//Creating an object of type student:
		Student s  = new Student();
		
		//Accessing Instance variable:
		System.out.println(s);
		
		Student s1 = new Student();
		System.out.println(s1); // object copy of instance variable:
		
		
		s.studentId=1;// Changing the value of the instance variable value:
		System.out.println("______________________________________");
		
		System.out.println("After changes");
		
		System.out.println(s.studentId);
		System.out.println(s1.studentId);
	}

}
