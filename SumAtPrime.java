package com.deloitte;

import java.util.Scanner;

public class SumAtPrime {

	public static void main(String[] args) {
		int sum=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the total number of elements");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the elements");
		for (int i = 0; i <n; i++) {
		  arr[i]=sc.nextInt();			
		}
		sum=getSumAtPrime(arr);
		System.out.println("The total is: "+sum);
	}

	private static int getSumAtPrime(int[] arr) {
		int n=1;
		int tot=0;
		for(int i=0;i<arr.length;i++) {
			if(isPrime(i)) {
				tot+=arr[i];
				System.out.println(i);
			}
					
		}
		System.out.println(tot);
		return tot;
	}

	private static boolean isPrime(int i) {
		boolean success=false;
		if(i==0||i==1)
			success=false;
		else if(i==2||i==3)
			success=true;
		else {
			for(int n=2;n<=i/2;n++) {
				if(i%n!=0) {
					success=true;
				}
				else {
					success=false;
					return success;
				}
				
		}
		
	}
		return success;
}
}