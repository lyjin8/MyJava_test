package ly.thread.ThreadSafe;

public class Myticket implements Runnable{

    int ticket = 100;
    @Override
    public void run() {
        while (true)
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
