package ThreadEample.ExecutorFrameWork;

import java.time.LocalTime;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

//Send mail to all student of university regarding their registration of the academic year.
//6000 student
//data from the different db
//0.5 sec each student
// 6000 * 0.5 = 3000 sec or 50 min

public class SendMail implements Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class ExuctorServiceRealLifeProblem {
    public static void main(String[] args) throws InterruptedException {
        LocalTime time = LocalTime.now();
        System.out.println(time.getSecond());
        ExecutorService es = Executors.newFixedThreadPool(1);
        for (int i = 0; i < 10; i++) {
            es.submit(new SendMail());
        }
        es.shutdown();
        es.awaitTermination(1, TimeUnit.MINUTES);
        time = LocalTime.now();
        System.out.println(time.getSecond());
    }
}

