package ly.thread.ThreadSafeSynchronized.SynchronizedCodeBlock;

public class MyTicket implements Runnable{

    int ticket = 100;

    //创建任意对象
    final Object obj = new Object();
    //注：锁对象必须是同一把锁，当出现多把锁的时候，还是会出现线程安全问题
    @Override
    public void run() {
        while (true)
        {
            try {
                Thread.sleep(100L);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            synchronized (obj)
            {
                if(ticket>0){
                    System.out.println(Thread.currentThread().getName()+"正在卖票，票号为："+ticket);
                    ticket--;
                }
                else{
                    break;
                }
            }
        }
    }
}
