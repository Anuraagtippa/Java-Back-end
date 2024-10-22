package com.basics;


class Box{
	public void printDimension() {
		int length= 100;
		int breadth = 100;
		System.out.println(length*breadth);
		
		
	}
}

public class Variable_3 {

	public static void main(String[] args) {
		Box b = new Box();
		b.printDimension();
	}

}
