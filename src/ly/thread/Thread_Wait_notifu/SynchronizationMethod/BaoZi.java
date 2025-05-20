package ly.thread.Thread_Wait_notifu.SynchronizationMethod;

public class BaoZi {
    //代表包子的count
    private int count;

    //代表是否有包子
    private boolean flag;

    public BaoZi() {
    }

    public BaoZi(int count, boolean flag) {
        this.count = count;
        this.flag = flag;
    }

    public synchronized void getCount() {
        //当返回true的时候表示当前有包子，生产线程等待
        if (this.isFlag()==true){
            try {
                this.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        //如果结果为false，代表没有包子开始生产
        System.out.println("消费了第"+count+"个包子");
        //生产完了，返回true表示有包子
        this.flag=true;
        //唤醒正在等待的线程
        this.notify();
    }

    public synchronized void setCount() {
        //判断是否有包子，如果结构为false代表没有包子，消费线程需等待
        if (this.isFlag()==false){
            try {
                this.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        //如果结果为true，代表有包子开始消费
        count++;
        System.out.println("生产了第"+count+"个包子");
        //消费了返回false代表没有包子
        this.flag=false;
        //唤醒正在等待的线程
        this.notify();
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}
