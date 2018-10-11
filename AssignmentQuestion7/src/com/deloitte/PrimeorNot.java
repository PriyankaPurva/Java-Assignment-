package com.deloitte;

import java.util.Scanner;

public class PrimeorNot {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=s.nextInt();
		PrimeorNot p=new PrimeorNot();
		boolean yn=p.prime(num);
	    if(yn==true) {
	    	System.out.println("The number "+num+" is not a prime number");
	    }
	    else {
	    	System.out.println("The number "+num+" is prime number");
	    }
	    	
	}

	private boolean prime(int num) {
		for(int i = 2; i <= num/2; i++)
        {
            // condition for nonprime number
            if(num % i == 0)
            {
                return false;
            }
        }
		return true;

}
}
