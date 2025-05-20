package ly.thread.Thread_Wait_notifu;

public class Test {
    public static void main(String[] args) {
        BaoZi bz = new BaoZi();
        Product product = new Product(bz);
        Consumer consumer = new Consumer(bz);
        new Thread(product).start();
        new Thread(consumer).start();
    }
}
