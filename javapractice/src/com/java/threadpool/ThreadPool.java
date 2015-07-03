package com.java.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {
	
	public static void main(String[] args) {
		ExecutorService service = Executors.newFixedThreadPool(10);
		for(int i=0;i<=10;i++){
			service.submit(new Task(i));	
		}
	}

}
