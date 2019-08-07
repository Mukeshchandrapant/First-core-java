package com.add;

import java.util.Scanner;

public class Addtion {
	
	public static void main(String[] args) {
		
		int a, b;
		Scanner sc = new Scanner(System.in);		
		System.out.println("Enter two numbers:");
		a = sc.nextInt();
		b = sc.nextInt();
		
		System.out.println("Addition of your entered numbers :: " + (a+b));
		
	}

}
