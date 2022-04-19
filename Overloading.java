package com.java.content;

public class Overloading {
	private void detail(int a) 
	{
		System.out.println(a);

	}
	private void detail(int a, String b)
	{
	    System.out.println(b+a);	

	}
	private void detail(int a, int b, int c) {
           System.out.println(a*b+c);

	}
	private void detail(String a, char b) {
		System.out.println(a+b);

	}
public static void main(String[] args) {
	Overloading emp = new Overloading();
	emp.detail(12);
	emp.detail(100, "RX");
	emp.detail("Call", 's');
	emp.detail(10, 20, 30);
	
}
}
