package com.myThread;

public class TestThread implements Runnable{
	int a = 1;
	
	@Override
	public void run() {
		System.out.println(a++);
	}
	
}
