package com.example.rom.concurrency;

import java.util.concurrent.CyclicBarrier;

/**
 * Worker threads run in CyclicBarrier
 *
 * @author Roman Fu
 * @version 1.0
 */
public class CyclicBarrierForWorker {

    private static class Worker extends Thread {
        private final CyclicBarrier cyclicBarrier;

        public Worker(CyclicBarrier cyclicBarrier) {
            this.cyclicBarrier = cyclicBarrier;
        }

        public void run() {
            super.run();
            try {
                System.out.println(Thread.currentThread().getName() + "start to wait other thread...");
                cyclicBarrier.await();
                System.out.println(Thread.currentThread().getName() + " start to execute...");
                Thread.sleep(5000);  // do something
                System.out.println(Thread.currentThread().getName() + "execute over.");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        int threadCount = 3;
        CyclicBarrier cyclicBarrier = new CyclicBarrier(threadCount);

        for (int i = 0; i < threadCount; i++) {
            System.out.println("Worker thread will be created,No." + i);
            Worker worker = new Worker(cyclicBarrier);
            worker.start();
        }
    }
}
