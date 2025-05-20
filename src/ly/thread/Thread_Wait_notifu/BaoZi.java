package ly.thread.Thread_Wait_notifu;

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

    public void getCount() {
        System.out.println("消费了第"+count+"个包子");
    }

    public void setCount() {
        count++;
        System.out.println("生产了第"+count+"个包子");
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}
