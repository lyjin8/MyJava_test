package ly.innerclass.innerclassTest;

import ly.innerclass.innerclassObject.Usb;

public class UsbTest {
    public static void main(String[] args) {
        //匿名内部类--------->每次只能实现一个方法
        new Usb(){

            @Override
            public void open() {
                System.out.println("usb开启");
            }

            @Override
            public void close() {

            }
        }.open();
        System.out.println("----------");
        //标准接口模式
        Usb usb = new Usb() {
            @Override
            public void open() {
                System.out.println("usb开启");
            }

            @Override
            public void close() {
                System.out.println("usb关闭");
            }
        };

        usb.open();
        usb.close();
    }
}
