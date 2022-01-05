package ThreadEample.Producer.Consumer;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class MyBlockingQueue<E> {
    private Queue<E> queue;
    private int max = 16;
    private ReentrantLock lock = new ReentrantLock(true);
    private Condition notEmpty = lock.newCondition();
    private Condition notFull = lock.newCondition();

    public MyBlockingQueue(int size) {
        queue = new LinkedList<>();
        this.max = size;
    }

    public void put(E e) {
        lock.lock();
        try {
            while (queue.size() == max) {
                notFull.await();
            }
            queue.add(e);
            notEmpty.signal();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        } finally {
            {
                lock.unlock();
            }
        }
    }

    public E take() {
        lock.lock();
        try {
            while (queue.size() == 0) {
                notEmpty.await();
            }
            E item = queue.remove();
            notFull.signal();
            return item;
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
        return null;
    }
}
