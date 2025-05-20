package ly.JDK8.FunctionalInterface.test;

import ly.JDK8.FunctionalInterface.object.Usb;

public class FunctionalDemo01 {
    public static void main(String[] args) {
        method(new Usb() {
            @Override
            public void open(String s) {
                System.out.println("打开"+s);
            }
        });
        System.out.println("========Lambda==========");
        method((s)->{System.out.println("打开"+s);});

        System.out.println("========Lambda简化版==========");
        method(s->System.out.println("打开"+s));

    }
    public static void method(Usb usb){
        usb.open("鼠标");
    }
}
