package com.deloitte;

public class Thread2 implements Runnable {
	private SharedFunction sf;
	public Thread2(SharedFunction sf) {
		this.sf=sf;
	}
	@Override
	public void run() {
		for (int i = 6; i>=1; i--) {
			sf.setData(i);
		}
	}


}
