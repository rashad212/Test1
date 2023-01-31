package Test.ThreadTest;

import java.util.stream.IntStream;

public class ThreadExample {
//
//    int counter = 0;
//
//    private static void increment(ThreadExample threadExample) {
//        for (int i = 0; i < 100; i++)
//            threadExample.counter++;
//        System.out.println(Thread.currentThread().getName() + " counter : " + threadExample.counter);
//    }
//
//    public static void main(String[] args) throws InterruptedException {
//        ThreadExample threadExample = new ThreadExample();
//        Thread thread1 = new Thread(() -> {
//            increment(threadExample);
//        });
//
//        Thread thread2 = new Thread(() -> {
//            increment(threadExample);
//        });
//
//        thread1.start();
//        thread2.start();
//        thread1.join();
//        thread2.join();

// ---------------------------------------------------------------------------------------

//    static int i, j;
//
//    public static void main(String[] args) {
//
//        Thread t1 = new Thread() {
//            public void run() {
//                for (i = 0; i <= 50; i++) {
//                    System.out.print("Thread 1- ");
//                }
//            }
//        };
//        Thread t2 = new Thread() {
//            public void run() {
//                for (j = 0; j <= 50; j++) {
//                    System.out.print("Thread 2- ");
//                }
//            }
//        };
//
//        t1.start();
//        t2.start();
//    }

    public static void main(String[] args) throws InterruptedException {

        for( int i = 5; i>0; i--){
            Thread.sleep(1000);
            System.out.println(i);
        }
        System.out.println("you are done!");
    }
}