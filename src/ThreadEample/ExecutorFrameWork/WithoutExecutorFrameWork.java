package ThreadEample.ExecutorFrameWork;

import java.math.BigInteger;

public class WithoutExecutorFrameWork {
    public static void main(String args[]) {
        for (int i = 0; i < 100000000; i++) {
            Thread threadone = new Thread(new Task());
            threadone.start();
        }
        System.out.println("Thread Name  " + Thread.currentThread().getName());
    }
}

class Task implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread Name  " + Thread.currentThread().getName());
    }
}
