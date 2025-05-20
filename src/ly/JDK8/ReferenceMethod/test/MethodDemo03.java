package ly.JDK8.ReferenceMethod.test;

import java.util.function.Supplier;

public class MethodDemo03 {
    public static void main(String[] args) {
        method(()->Math.random());
        System.out.println("==================");
        method(Math::random);
    }
    public static void method(Supplier<Double> supplier){
        Double aDouble = supplier.get();
        System.out.println("aDouble = " + aDouble);
    }
}
