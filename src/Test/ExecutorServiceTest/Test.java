package Test.ExecutorServiceTest;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Test {
    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(4);

        for (int i = 1; i <= 9; i++) {
            executorService.submit(new FirstThread(i));
        }
        executorService.shutdown();

        System.out.println("Butun Threadler elave olundu !");

        try {
            executorService.awaitTermination(1, TimeUnit.DAYS);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Butun Threadler tamamlandi !");
    }
}