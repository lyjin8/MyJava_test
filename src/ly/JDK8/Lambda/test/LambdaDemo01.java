package ly.JDK8.Lambda.test;

import ly.JDK8.Lambda.object.Usb;

/**
 *   a.观察是否是函数式接口做方法参数传递
 *   b.如果是,考虑使用Lambda表达式
 *   c.调用方法,以匿名内部类的形式传递实参
 *   d.从new接口开始到重写方法的方法名结束,选中,删除,别忘记再删除一个右半个大括号
 *   e.在重写方法的参数后面,方法体的大括号前面加上 ->
 */

public class LambdaDemo01 {
    public static void main(String[] args) {
         method(new Usb() {
            @Override
            public void open() {
                System.out.println("我打开了");
            }
        });
        System.out.println("========Lambda==========");
        method(() -> {System.out.println("我打开了");});

        /**
         *   a.重写方法的参数类型可以干掉
         *   b.如果重写方法只有一个参数,所在的小括号可以干掉
         *   c.如果方法体中只有一句话,那么所在的大括号以及分号可以干掉
         *   d.如果方法体中只有一句话并且带return的,那么所在的大括号,分号以及return 可以干掉
         */
        System.out.println("========Lambda再省略==========");
        method(() -> System.out.println("我打开了"));
    }
    public static void method(Usb usb){
        usb.open();
    }

}

