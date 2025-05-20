package ly.thread.Thread_Wait_notifu.SynchronizationMethod;

public class Product implements Runnable{

    private BaoZi bz;

    public Product(BaoZi bz) {
        this.bz = bz;
    }

    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(100L);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            bz.setCount();
        }

    }
}
