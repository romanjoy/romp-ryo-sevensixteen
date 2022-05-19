package mutex;

import java.util.concurrent.locks.ReentrantLock;

public class SequenceGeneratorUsingReentrantLock extends SequenceGenerator {
    private ReentrantLock mutex = new ReentrantLock();

    public int getNextSequence() {
        try {
            mutex.lock();
            return super.getNextSequence();
        } finally {
            mutex.unlock();
        }
    }
}
