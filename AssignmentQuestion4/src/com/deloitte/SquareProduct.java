package com.deloitte;

import java.util.Scanner;

public class SquareProduct {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);		
		System.out.println("Enter two Numbers to multiply");
		double a=scan.nextDouble();
		double b=scan.nextDouble();
		System.out.println("Enter the number to find the square root");
		double c=scan.nextDouble();
		NumberUtil nu = new NumberUtil();
		double ans=nu.product(a,b);
		System.out.println("The product of 2 numbers is "+ans);
		ans =nu.sqrt(c);
		System.out.println("The square root of the number is "+ans);
	}

}
