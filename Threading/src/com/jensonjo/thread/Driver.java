package com.jensonjo.thread;

public class Driver {

	public static void main(String[] args) {
		
		Recording b = new Recording("Recording");
		b.start();
		
		Playing a = new Playing("Playing");
		a.start();

		
	}

}
