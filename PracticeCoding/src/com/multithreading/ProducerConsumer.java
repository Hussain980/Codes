package com.multithreading;

import java.util.ArrayList;
import java.util.List;

// producer consumer problem in java with wait() and notify() method

public class ProducerConsumer {

	public static void main(String[] args) {
		List<Integer> sharedList = new ArrayList<Integer>();
		Thread thread1 = new Thread(new Producer(sharedList));
		Thread thread2 = new Thread(new Consumer(sharedList));
		thread1.start();
		thread2.start();
	}
}

class Producer implements Runnable {

	List<Integer> sharedList = null;
	final int MAX_SIZE = 5;
	private int i = 0;

	public Producer(List<Integer> sharedList) {
		super();
		this.sharedList = sharedList;
	}

	@Override
	public void run() {
		while (true) {
			try {
				produce(i++);
			} catch (InterruptedException e) {

			}
		}
	}

	public void produce(int i) throws InterruptedException {
		synchronized (sharedList) {
			while (sharedList.size() == MAX_SIZE) {
				System.out.println("shared list is full !! waiting consumer to consume it ");
				sharedList.wait();
			}
		}

		synchronized (sharedList) {
			System.out.println("producer produced elements  " + i);
			sharedList.add(i);
			Thread.sleep(1000);
			sharedList.notify();

		}
	}

}

class Consumer implements Runnable {

	List<Integer> sharedList = null;
	

	public Consumer(List<Integer> sharedList) {
		super();
		this.sharedList = sharedList;
	}

	@Override
	public void run() {
		while (true) {
			try {
				consume();
			} catch (InterruptedException e) {

			}
		}
	}

	public void consume() throws InterruptedException {
		synchronized (sharedList) {
			while (sharedList.isEmpty()) {
				System.out.println("shared list is empty ");
				sharedList.wait();
			}
		}

		synchronized (sharedList) {
			Thread.sleep(1000);
			System.out.println("Consumer consumed elements "+sharedList.remove(0));
			sharedList.notify();

		}
	}

}
