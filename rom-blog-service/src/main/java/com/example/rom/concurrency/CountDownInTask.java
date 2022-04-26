package com.example.rom.concurrency;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Two threads execute in CountDownLatch
 *
 * @author Roman Fu
 * @version 1.0
 */
public class CountDownInTask {
    public static void main(String[] args) {
        final CountDownLatch latch = new CountDownLatch(2);
        System.out.println("Main Thread starts ...");

        ExecutorService executorService1 = Executors.newSingleThreadExecutor();
        executorService1.execute(() -> {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("sub thread：" + Thread.currentThread().getName() + " start...");
            latch.countDown();
        });
        executorService1.shutdown();

        ExecutorService executorService2 = Executors.newSingleThreadExecutor();
        executorService2.execute(() -> {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("sub thread：" + Thread.currentThread().getName() + " start...");
            latch.countDown();
        });
        executorService2.shutdown();

        System.out.println("Waiting...");

        try {
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Sub threads over, main thread continue...");
    }

}
