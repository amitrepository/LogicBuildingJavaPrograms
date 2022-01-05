package ThreadEample.Producer.Consumer;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class MyBlockingQueueWaitNotify<E> {
    private Queue<E> queue;
    private int max = 16;
    private ReentrantLock lock = new ReentrantLock(true);
    private Object notEmpty = new Object();
    private Object notFull = new Object();

    public MyBlockingQueueWaitNotify(int size) {
        queue = new LinkedList<>();
        this.max = size;
    }

    public synchronized void put(E e) {
        lock.lock();
        try {
            while (queue.size() == max) {
                notFull.wait();
            }
            queue.add(e);
            notEmpty.notifyAll();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        } finally {
            {
                lock.unlock();
            }
        }
    }

    public synchronized E take() {
        lock.lock();
        try {
            while (queue.size() == 0) {
                notEmpty.wait();
            }
            E item = queue.remove();
            notFull.notifyAll();
            return item;
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
        return null;
    }
}
