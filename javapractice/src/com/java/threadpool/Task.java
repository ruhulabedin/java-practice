package com.java.threadpool;

public class Task implements Runnable {

	private int taskId;

	public Task(int taskId) {
		this.taskId = taskId;
	}

	@Override
	public synchronized void run() {
		System.out.println("Task ID : " + this.taskId + " performed by "
				+ Thread.currentThread().getName());

	}

}
