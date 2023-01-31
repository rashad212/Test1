package Test.ThreadTest;

public class CountMain {
    public static void main(String[] args) throws InterruptedException {

        for(int i = 0; i < 5; i++){
            ThreadCount myCnt = new ThreadCount(i);     // 5 Thread is working
            Thread myThread = new Thread(myCnt);
            myThread.start();
            myThread.join();
        }

//    --------------------------------------------------------------------------
//        ThreadCount myCnt = new ThreadCount();      //Thread 1
//        ThreadCount myCnt2 = new ThreadCount();     //Thread 2
//
//        myCnt.start();
//        myCnt2.start();
    }
}
