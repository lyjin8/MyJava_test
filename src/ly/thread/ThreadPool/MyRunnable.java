package ly.thread.ThreadPool;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"...执行了");
    }
}
