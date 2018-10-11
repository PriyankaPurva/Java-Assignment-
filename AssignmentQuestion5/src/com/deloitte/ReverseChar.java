package com.deloitte;

public class ReverseChar {

	public static void main(String[] args) {
		char [] cArr= {'B','U','H','D','I','U','Q','I','L'};
		System.out.println("The original array given is as follows");
		for (int i = 0; i < cArr.length; i++) {
			System.out.print(cArr[i] +" ");
		}
		System.out.println("\nThe reverse of the given array is ");
		for (int i = cArr.length-1; i >=0 ; i--) {
			System.out.print(cArr[i]+" ");
		}
	}

}
