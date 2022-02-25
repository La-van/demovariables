package com.java.basics;

public class Basics {
	private void add() {
		System.out.println("Addition");
		System.out.println("a+b");
	}
	
	private void sub() {
		System.out.println("Subtraction");
		System.out.println("a-b");
	}
	
	private void mul() {
		System.out.println("Multiplication");
		System.out.println("a*b");
	}
	
	public static void main(String[] args) {
		
		Basics b = new Basics();
		b.add();
		b.sub();
		b.mul();
		
		
	}

}
