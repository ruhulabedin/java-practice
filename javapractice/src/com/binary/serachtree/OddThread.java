package com.binary.serachtree;

public class OddThread implements Runnable{
	@Override
	public synchronized void run() {
	
		for(int i=0;i<=10;i=i+2){
			System.out.println(i);
		}
		
	}
}
