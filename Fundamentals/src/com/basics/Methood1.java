package com.basics;

class Employee{
	
	public void getEmployeeInfo() {
		System.out.println("No details available");
	}
	
	public static void getCompanyName() {
		System.out.println("NO company found");
	}
	
	public String getEmployeeName() {
		
		return "Anurag";
	}
}

public class Methood1 {

	public static void main(String[] args) {
		
		//accessing non-static method
		//syntax: objName.methodName;
		Employee emp = new Employee();
		emp.getEmployeeInfo();
		
		//accessing static method
		//syntax: classname.methodName;
		
		Employee.getCompanyName();
		
		System.out.println(emp.getEmployeeName());
	}

}
