package ly.thread.threadTest;

import ly.thread.threadObject.Mythread;

public class Test {
    public static void main(String[] args) {
        Mythread mythread = new Mythread();
        mythread.setName("线程1");
        mythread.start();

        //currentThread当前线程的线程名
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() +"....." + i);
        }
    }
}
