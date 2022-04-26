package com.example.rom.concurrency;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Print 1~100 By two threads in lock condition
 *
 * @author Roman Fu
 * @version 1.0
 */
public class PrintNumLockCondition implements Runnable {
    private int number = 0;
    private final ReentrantLock lock = new ReentrantLock();
    private final Condition notFull = lock.newCondition();

    @Override
    public void run() {
        while (number < 100) {
            lock.lock();
            number++;
            System.out.println(Thread.currentThread().getName() + ", Number: " + number);
            notFull.signal();
            try {
                if (number < 100)
                    notFull.await();
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }
    }

    public static void main(String[] args) {
        PrintNumLockCondition lockCondition = new PrintNumLockCondition();
        Thread t1 = new Thread(lockCondition, "T1");
        Thread t2 = new Thread(lockCondition, "T2");
        t1.start();
        t2.start();
    }
}
