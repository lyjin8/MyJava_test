package ly.interfaceAndpolymorphicExam;

public class Mouse implements Usb{
    @Override
    public void open() {
        System.out.println("鼠标开启");
    }

    @Override
    public void close() {
        System.out.println("鼠标关闭");
    }
    public void click(){
        System.out.println("点鼠标映射");
    }
}
