package ly.thread.ThreadPool;

import java.util.concurrent.*;

public class CallableTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService es2 = Executors.newFixedThreadPool(2);
        Future<Integer> future = es2.submit(new MyCallable());
        System.out.println(future.get());
        es2.shutdown();
    }
}
