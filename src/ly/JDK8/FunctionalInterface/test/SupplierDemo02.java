package ly.JDK8.FunctionalInterface.test;

import java.util.function.Supplier;

public class SupplierDemo02 {
    public static void main(String[] args) {
        method(new Supplier<Integer>() {
            @Override
            public Integer get() {
                int[] arr = {5,7,1,4,6,2,1};
                int max = 0;
                for (int i = 0; i < arr.length; i++) {
                    if(arr[i]<arr[i+1]){
                        max = arr[i+1];
                        return max;
                    }
                }
                return 0;
            }
        });
        System.out.println("=====Lambda=======");
        method(() ->{
                int[] arr = {5,7,1,4,6,2,1};
                int max = 0;
                for (int i = 0; i < arr.length; i++) {
                    if(arr[i]<arr[i+1]){
                        max = arr[i+1];
                        return max;
                    }
                }
                return 0;
            });
    }
    public static void method(Supplier<Integer> supplier){
        Integer max = supplier.get();//返回一个数的最大值
        System.out.println("max = " + max);
    }
}
