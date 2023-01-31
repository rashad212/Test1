package Test.ExecutorServiceTest;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class FirstThread implements Runnable {
    private final int id;

    public FirstThread(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        System.out.println("Thread baslayir ..." + id);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Thread bitdi: " + id);
    }
}

