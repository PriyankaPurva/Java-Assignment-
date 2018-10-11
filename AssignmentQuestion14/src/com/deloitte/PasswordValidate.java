package com.deloitte;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidate {
	Pattern pattern2;
	Matcher matcher2;
	String regex2="^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[#$%^&*]){8,}$";
	
	public PasswordValidate() {
		pattern2 = Pattern.compile(regex2);
	}
	public boolean validate2(String input) {
	matcher2=pattern2.matcher(input);
	return matcher2.matches();
    }

}
