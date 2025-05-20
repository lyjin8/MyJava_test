package ly.thread.ThreadSafeSynchronized.SynchronizedMethod;

public class TicketTest {
    public static void main(String[] args) {

        //cpu在多个线程之间进行高速切换导致线程不安全
        /**
         * 解决线程安全问题就引出了----->同步代码块
         * 其格式为：
         *          synchronized(任意对象[锁对象]){
         *              线程中可能出现的不安全的代码块
         *          }
         * 当一个对象拿到锁对象之后，其他线程就只能等待，直到拿到锁对象之后才能继续执行代码块
         * 及当前代码块执行完毕之后，下一个线程才能继续执行代码块
         */
        MyTicket myticket = new MyTicket();
        Thread t1 = new Thread(myticket, "张三");
        Thread t2 = new Thread(myticket, "李四");
        Thread t3 = new Thread(myticket, "王五");

        t1.start();
        t2.start();
        t3.start();
    }
}
