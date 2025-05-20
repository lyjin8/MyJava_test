package ly.JDK8.FunctionalInterface.test;

import java.util.function.Function;

public class FunctionDemo04 {
    public static void main(String[] args) {
        method(new Function<Integer, String>() {
            @Override
            public String apply(Integer integer) {
                return integer+"";
            }
        },100);

        System.out.println("======lambda=======");
        method(i-> i+"",100);
    }
    public static void method(Function<Integer,String> function,Integer integer){
        String s = function.apply(integer);
        System.out.println("s=" + (s+1));
    }
}
