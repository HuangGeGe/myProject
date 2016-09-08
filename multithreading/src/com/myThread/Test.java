package com.myThread;

public class Test {
	public static void main(String[] args) {
		TestThread testThread = new TestThread();
		Thread t1 = new Thread(testThread);
		Thread t2 = new Thread(testThread);
		Thread t3 = new Thread(testThread);
		t1.start();
		t2.start();
		t3.start();
	}
}
