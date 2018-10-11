package com.deloitte;

public class SyncThread {

	public static void main(String[] args) {
		SharedFunction sf=new SharedFunction();
		Runnable thread1=new Thread1(sf);
		new Thread(thread1).start();
		try {
			Thread.sleep(2);
		} catch (InterruptedException e) {}
		Runnable thread2=new Thread2(sf);
		new Thread(thread2).start(); 
	}

}
