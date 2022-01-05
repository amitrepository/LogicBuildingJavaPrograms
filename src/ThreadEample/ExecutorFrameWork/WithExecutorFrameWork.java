package ThreadEample.ExecutorFrameWork;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class WithExecutorFrameWork {
    public static void main(String args[]) {

        ExecutorService service = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 100; i++) {
            service.execute(new Task());
        }
        //System.out.println("Thread Name  " + Thread.currentThread().getName());
    }
}

class Task1 implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread Name  " + Thread.currentThread().getName());
    }
}
