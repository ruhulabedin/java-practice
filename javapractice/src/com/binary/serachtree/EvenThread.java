package com.binary.serachtree;

public class EvenThread  implements Runnable{

	@Override
	public synchronized void run() {
	
		for(int i=1;i<10;i=i+2){
			System.out.println(i);
		}
		
	}

}
