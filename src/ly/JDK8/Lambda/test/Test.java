package ly.JDK8.Lambda.test;

public class Test {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("我执行了");
            }
        }).start();

        new Thread(()->{
            System.out.println("我执行了");
        }).start();
    }
}
