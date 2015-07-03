package com.hashcodeequals;

public class ThreadOne implements Runnable {

	@Override
	public void run() {

		for (int i = 0; i < 11; i++) {
			try {
				Thread.sleep(2000);
				System.out.println("--------->>>"+Thread.activeCount());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
