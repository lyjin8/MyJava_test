package ly.thread.lock;

public class TicketTest {
    public static void main(String[] args) {
        //学习Lock锁的使用
        MyTicket myticket = new MyTicket();
        new Thread(myticket, "张三").start();
        new Thread(myticket, "李四").start();
        new Thread(myticket, "王五").start();

    }
}
