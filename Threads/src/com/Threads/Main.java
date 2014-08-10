package com.Threads;

public class Main {

	public static void main(String[] args) {
		
		long start = System.currentTimeMillis();
		Thread a = new Thread(new ThreadA());
		Thread b = new Thread(new ThreadA());
		
		a.start();
		b.start();
		
		try {
			a.join();
			b.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(ThreadA.counter + " " + (System.currentTimeMillis() - start ));
	}

}
