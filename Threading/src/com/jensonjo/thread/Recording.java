package com.jensonjo.thread;

public class Recording implements Runnable{

	private Thread t;
	private String name;

	public Recording(String name) {
		this.name = name;
		System.out.println("Object created : " + name);
	}

	public void start() {
		if (t == null) {
			t = new Thread(this, this.name);
			t.start();
			System.out.println("Started Thread :" + this.name);
		}

	}

	@Override
	public void run() {
		System.out.println("Running " + name);
		try {
			for (int i = 4; i > 0; i--) {
				System.out.println("Thread: " + name + ", " + i);
				// Let the thread sleep for a while.
				Thread.sleep(2000);
			}
		} catch (InterruptedException e) {
			System.out.println("Thread " + name + " interrupted.");
		}
		System.out.println("Thread " + name + " exiting.");
	}



}
