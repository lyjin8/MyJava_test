package ly.thread.callabeForCreateTheads;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> {
    @Override
    public String call() throws Exception {
        return "亻尔女子";
    }
}
