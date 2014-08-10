package com.Threads.BlockingQueue;

import java.util.LinkedList;
import java.util.Queue;

public class BlockingQueue<E> extends LinkedList<E> implements Queue<E> {

	private Object monitor = new Object();
	private boolean isWait = false;
	@Override
	public boolean add(E e) {
		
		boolean res = super.add(e);
		if (isWait)
		{
			synchronized (monitor) {
				monitor.notify();
			}
			
			isWait = false;
		}
		
		return res;
	}

	@Override
	public E poll() {
		if (this.isEmpty())
		{
			synchronized (monitor) {
				try {
					isWait = true;
					monitor.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}			
		}
		return super.poll();
	}
	
}
