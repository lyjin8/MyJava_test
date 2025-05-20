package ly.thread.Thread_Wait_notifu;

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
            synchronized (bz){
                //当返回true的时候表示当前有包子，生产线程等待
                if (bz.isFlag()==true){
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                //如果结果为false，代表没有包子开始生产
                bz.setCount();
                //生产完了，返回true表示有包子
                bz.setFlag(true);
                //唤醒正在等待的线程
                bz.notify();
            }
        }

    }
}
