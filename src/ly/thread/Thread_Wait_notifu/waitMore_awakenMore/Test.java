package ly.thread.Thread_Wait_notifu.waitMore_awakenMore;

public class Test {
    //多等待多唤醒
    public static void main(String[] args) {
        BaoZi bz = new BaoZi();
        Product product = new Product(bz);
        Consumer consumer = new Consumer(bz);
        //六条线程运行时会出现一个消费或生产线程连续抢锁，就会导致一生产多消费或者多生产一消费的情况，最主要的是会出现死锁
        //解决此问题要用到notifyAll()将所有的线程都唤醒
        //但是有会出现新的问题，就是当一个线程被唤醒之后，会重新判断条件，如果条件满足，就会继续执行，但是线程被唤醒之后，可能其他线程已经抢到锁，就会导致线程安全问题
        //因此这里可以将if判断语句换成循环判断While，这样当线程被唤醒之后，就会重新判断条件，如果条件满足，就会继续执行，如果条件不满足，就会重新等待
        new Thread(product).start();
        new Thread(product).start();
        new Thread(product).start();
        new Thread(consumer).start();
        new Thread(consumer).start();
        new Thread(consumer).start();
    }
}
