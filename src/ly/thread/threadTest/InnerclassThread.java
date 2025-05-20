package ly.thread.threadTest;

public class InnerclassThread {
    public static void main(String[] args) {
        //匿名内部类创建多线程
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName()+"..."+i);
                }
            }
        }).start();
    }
}
