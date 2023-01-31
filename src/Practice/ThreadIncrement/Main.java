package Practice.ThreadIncrement;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        ThreadEx myEx = new ThreadEx();

        ThreadRable runnable = new ThreadRable();
        Thread myRun = new Thread(runnable);

        myEx.start();
        myRun.start();
        myRun.join();


    }
}
