package ly.JDK8.ReferenceMethod.test;

import java.util.function.Supplier;

public class MethodDemo02 {
    public static void main(String[] args) {
        method(new Supplier<String>() {
            @Override
            public String get() {
                return "  a b c  ".trim() ;
            }
        });
        System.out.println("==================");
        method(() -> "  a b c  ".trim());
        System.out.println("==================");
        method("  a b c  "::trim);
    }
    public static void method(Supplier<String> supplier){
        System.out.println(supplier.get());
    }
}
