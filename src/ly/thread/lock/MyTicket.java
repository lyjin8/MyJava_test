package ly.thread.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyTicket implements Runnable{

    int ticket = 100;

//调用Lock锁
    Lock lock = new ReentrantLock();
    @Override
    public void run() {
        while (true)
        {
            try {
                Thread.sleep(100L);
                //上锁
                lock.lock();
                if(ticket>0){
                    System.out.println(Thread.currentThread().getName()+"正在卖票，票号为："+ticket);
                    ticket--;
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }finally {
                //释放锁,有异常抛出也继续释放锁
                lock.unlock();
            }
        }
    }
}
