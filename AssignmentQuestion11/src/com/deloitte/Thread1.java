package com.deloitte;


public class Thread1 implements Runnable{
	private SharedFunction sf;
	public Thread1(SharedFunction sf) {
		this.sf=sf;
	}

	@Override
	public void run() {
		for (int i = 8; i <=13 ; i++) {
			sf.setData(i);
		}
		
	}
	

}
