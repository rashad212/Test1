package Practice.ThreadIncrement;

public class ThreadIncrement extends Thread {
    static int count=0;

    public static void main(String[] args) throws InterruptedException {

        int local = count;

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                ThreadIncrement.count++;
                System.out.println(Thread.currentThread().getName() + " plus : " + ThreadIncrement.count);

            }
        });
        Thread t2 = new Thread(() ->{
            for (int j = 100; j>=0; j--) {
                ThreadIncrement.count--;
                System.out.println(Thread.currentThread().getName() + " minus : " + ThreadIncrement.count);
            }
        });

        t1.start();

        t2.start();

    }
}
