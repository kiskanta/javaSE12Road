package com.ksh.concurrency.executorJSR166;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceEample {
	private static int nThreads = 2;

	private static int nTasks = 10;

	public static void main(String[] args) {

		/**
		 * p1 - Executor created with 2 threads
		 */
		ExecutorService executor = Executors.newFixedThreadPool(nThreads); // creates 2 threads in executors

		System.out.println("Executor created with 2 Threads");

		for (int i = 0; i <= nTasks; i++) {
			Runnable r = new MyRunnable(i);
			/**
			 * P2 - Thread pool executors it internally uses a blocking queue in that queue
			 * it keeps storing all the tasks that you submitted. And all the 10 tasks which
			 * is t0 to t9 all of them will perform these same two steps the 2 steps are
			 * fetched the next task from the queue and execute it and since all 10 threads
			 * attempt to take the task from the queue at the same time that is concurrently
			 * you want the queue to be able to handle concurrent operations so you want
			 * queue which is thread safe and that is why Thread pool uses in the blocking
			 * queue.
			 */
			executor.execute(r);
		}

		executor.shutdown();
		System.out.println("Executor Service Shutdown");
	}
}

class MyRunnable implements Runnable {

	int taskNumber;

	MyRunnable(int taskNumber) {
		this.taskNumber = taskNumber;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " executing task no ");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}