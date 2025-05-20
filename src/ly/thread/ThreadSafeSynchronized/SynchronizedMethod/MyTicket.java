package ly.thread.ThreadSafeSynchronized.SynchronizedMethod;

public class MyTicket implements Runnable{

    int ticket = 100;
    @Override
    public void run() {
        while (ticket!=0)
        {
            try {
                Thread.sleep(100L);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            method01();
        }
    }
    //同步方法
//    public synchronized void method01(){
//        if(ticket>0){
//            System.out.println(Thread.currentThread().getName()+"正在卖票，票号为："+ticket);
//            ticket--;
//        }
//    }
    //普通方法调用同步代码块实现同步方法
    public void method01(){
        synchronized (this){
            if(ticket>0){
                System.out.println(Thread.currentThread().getName()+"正在卖票，票号为："+ticket);
                ticket--;
            }
        }
    }
}
