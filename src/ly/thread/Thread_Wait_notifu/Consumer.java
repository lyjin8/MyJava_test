package ly.thread.Thread_Wait_notifu;

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
            synchronized (bz){
                //判断是否有包子，如果结构为false代表没有包子，消费线程需等待
                if (bz.isFlag()==false){
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                //如果结果为true，代表有包子开始消费
                bz.getCount();
                //消费了返回false代表没有包子
                bz.setFlag(false);
                //唤醒正在等待的线程
                bz.notify();
            }
        }

    }
}
