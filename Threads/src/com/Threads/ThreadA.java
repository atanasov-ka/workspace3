package com.Threads;

import java.util.concurrent.atomic.AtomicInteger;

public class ThreadA implements Runnable {
	
	private static Object monitor = new Object();
	public static AtomicInteger counter = new AtomicInteger(0);
	@Override
	public void run() {
		for (int i = 0; i < 20_000_000; ++i)
			increment();
	}
	
	private static void increment()
	{
		counter.addAndGet(1);
	}

}
