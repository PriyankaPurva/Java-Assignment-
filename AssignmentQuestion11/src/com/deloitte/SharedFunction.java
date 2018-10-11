package com.deloitte;

public class SharedFunction {
	private int data;
	synchronized public void setData(int data) {
		notify();
		System.out.println(+data);
		this.data = data;
		try {
			wait(1000);
		} catch (InterruptedException e) {
		}
	}
	synchronized public int getData() {
		notify();
		int temp=data;
		System.out.println(data);
		try {
			wait(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return temp;
	}

}
