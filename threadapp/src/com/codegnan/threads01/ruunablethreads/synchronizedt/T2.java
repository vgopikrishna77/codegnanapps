package com.codegnan.threads01.ruunablethreads.synchronizedt;

public class T2 implements Runnable {

	public void run() {

		for (int i = 0; i < 100; i++)
			Counter.increment();
	}

}
