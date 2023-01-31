package Test.ThreadTest;

public class ThreadCount implements Runnable {

    private int threadNum = 0;

    public ThreadCount(int threadNum) {
        this.threadNum = threadNum;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " from thread " + threadNum);
//            if (threadNum == 2){
//                throw new RuntimeException();                     // exception doesn't stop all thread
//            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
