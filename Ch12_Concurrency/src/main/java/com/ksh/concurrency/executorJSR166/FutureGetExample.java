package com.ksh.concurrency.executorJSR166;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadLocalRandom;

public class FutureGetExample {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService es = Executors.newSingleThreadExecutor();

		Future<Long> futureResults= es.submit(new Callable<Long>() {

			@Override
			public Long call() throws Exception {
				Thread.sleep(1000);
				System.out.println("returning");
				return ThreadLocalRandom.current().nextLong();
			}
		});
		
		System.out.println("callable submitted");
		
	 	Long result = futureResults.get();
	 	System.out.println(result);
	 	es.shutdown();
	}
}
