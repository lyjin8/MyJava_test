package ly.thread.Thread_Wait_notifu.waitMore_awakenMore;

public class Consumer implements Runnable{

    private BaoZi bz;

    public Consumer(BaoZi bz) {
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
            bz.getCount();
        }

    }
}
