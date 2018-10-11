package com.deloitte;

import java.util.Random;

public class RandomNum {

	public static void main(String[] args) {
		String[] article= {"the", "a",  "one", "some" };
		String[] noun = {"boy", "girl", "dog", "town", "car"};
		String[] verb = {"drove", "jumped", "ran", "walked", "skipped"};
		String[] preposition = {"to", "from", "over", "under", "on"};
		
		
		for (int i = 1; i <= 20; i++) {
			int a=new Random().nextInt(article.length);
			int n=new Random().nextInt(noun.length);
			int v=new Random().nextInt(verb.length);
			int p=new Random().nextInt(preposition.length);
			int a1=new Random().nextInt(article.length);
			int n1=new Random().nextInt(noun.length);
			
			StringBuilder sentbuilder=new StringBuilder();
		    sentbuilder.append(article[a]).append(" ").append(noun[n]).append(" ").append(verb[v]).append(" ").append(preposition[p]).append(" ").append(article[a1]).append(" ").append(noun[n1]).append(".");
		    
		    sentbuilder.setCharAt(0, Character.toUpperCase(sentbuilder.charAt(0)));
		   sentbuilder.append("\n");
		   System.out.println(sentbuilder.toString());
		}
		
		
	}

}
