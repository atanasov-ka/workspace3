package com.Threads;

import com.Threads.BlockingQueue.BlockingQueue;

public class ThreadB implements Runnable {

	public ThreadB(BlockingQueue<Integer> q)
	{
		queue = q;
	}
	
	BlockingQueue<Integer> queue;
	
	@Override
	public void run() {
		System.out.println(queue.poll());
	}

}
