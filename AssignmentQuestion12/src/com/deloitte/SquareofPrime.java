package com.deloitte;

public class SquareofPrime {
	static int MAX=900;

	public static void main(String[] args) {
		boolean success=false;
		for (int i = 1; i <= MAX; i++) {
			success=isPrime(i) ;
			if(success) {
				System.out.println(i+":"+(i*i));
			}
			else
				continue;
			}
		
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
