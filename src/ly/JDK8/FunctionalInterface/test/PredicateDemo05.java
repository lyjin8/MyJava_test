package ly.JDK8.FunctionalInterface.test;

import java.util.function.Predicate;

public class PredicateDemo05 {
    public static void main(String[] args) {
        method(s -> s.length()==9,"definable");
    }
    public static void method(Predicate<String> predicate,String s){
        boolean test = predicate.test(s);
        System.out.println("test = " + test);
    }
}
