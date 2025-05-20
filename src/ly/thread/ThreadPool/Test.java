package ly.thread.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(2);
        //创建线程池对象
        es.submit(new MyRunnable());
        es.submit(new MyRunnable());
        es.submit(new MyRunnable());
        es.shutdown();//关闭线程池对象
    }
}
