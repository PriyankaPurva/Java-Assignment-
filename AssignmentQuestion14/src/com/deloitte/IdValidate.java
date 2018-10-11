package com.deloitte;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IdValidate {
	Pattern pattern1;
	Matcher matcher1;
	String regex ="^([1-9]{3}-?[0-9]{2}-?[0-9]{4})$";

	public IdValidate() {
		pattern1 = Pattern.compile(regex);
	}

	private boolean validate1(String input) {
		matcher1 = pattern1.matcher(input);
		return matcher1.matches();
	}

	
	public static void main(String[] args) {
		IdValidate nv=new IdValidate();
		PasswordValidate nv2=new PasswordValidate();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a ID");
		String input = s.nextLine();
		boolean valid=nv.validate1(input);
		if(valid) {
		System.out.println("Input is valid: "+ valid);
		System.out.println("Enter the password");
		String input1=s.nextLine();
		boolean valid2=nv2.validate2(input1);
		if(valid) {
			System.out.println("Password is valid: "+valid);
		}
		else {
			System.out.println("Password is not valid");			
		}
        }
		else {
			System.out.println("Input is not valid");
		}

}
}
