package com.deloitte;

import java.util.Scanner;

public class Factorial {
	
	private int factorial(int n) {		
		if(n==0) {
			return 1;
		}
		else
		return n*(factorial(n-1));
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Number, to display the factorial");
		int n=scan.nextInt();
		Factorial f= new Factorial();
		System.out.println("The factorial of " +n+ " is "+ f.factorial(n));
		
	}


}
