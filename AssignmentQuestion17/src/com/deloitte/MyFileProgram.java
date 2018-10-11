package com.deloitte;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyFileProgram {
	Pattern pattern1;
	Matcher matcher1;
	String regex ="^([1-9]{3}-?[0-9]{2}-?[0-9]{4})$";

	public MyFileProgram() {
		pattern1 = Pattern.compile(regex);
	}
	
	private boolean validate1(String input) {
		matcher1 = pattern1.matcher(input);
		return matcher1.matches();
	}

	public static void main(String[] args) {
		MyFileProgram nv=new MyFileProgram();
		String line;
		File f1=new File("Id.txt");
		File f2=new File("File.txt");
		FileReader fr=null;
		BufferedReader br=null;
		FileWriter fw=null;
		BufferedWriter bw=null;
		try {
			fr=new FileReader(f1);
			br=new BufferedReader(fr); 
			fw=new FileWriter(f2,true);
			bw=new BufferedWriter(fw);
			while((line=br.readLine())!=null) {
				boolean valid=nv.validate1(line);
				if(valid) {
				bw.write(line+": Valid");
				}
				else {
					bw.write(line+": Invalid");
				}				
				bw.newLine();
			}		
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {if(br!=null)br.close();}
			catch(IOException e) {}
			try {if(bw!=null)bw.close();}
			catch(IOException e) {}
		}
		

	}

}
