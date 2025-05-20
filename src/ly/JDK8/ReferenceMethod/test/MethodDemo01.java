package ly.JDK8.ReferenceMethod.test;

import java.util.function.Consumer;

public class MethodDemo01 {
    public static void main(String[] args) {
        test(s -> System.out.println(s),"亻尔女子");
        System.out.println("================");
        test(System.out::println,"亻尔女子");
    }

    private static void test(Consumer<String> consumer,String s) {
        consumer.accept(s);
    }
}
