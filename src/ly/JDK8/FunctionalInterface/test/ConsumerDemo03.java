package ly.JDK8.FunctionalInterface.test;

import java.util.function.Consumer;

public class ConsumerDemo03 {
    public static void main(String[] args) {
        method(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s.length());
            }
        },"definable");

        System.out.println("=======lambda==========");
        method(s -> System.out.println(s.length()),"definable");
    }
    public static void method(Consumer<String> consumer,String s){
        consumer.accept(s);
    }
}
