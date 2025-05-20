package ly.interfaceAndpolymorphicExam;

public class KeyBoard implements Usb{
    @Override
    public void open() {
        System.out.println("键盘开启");
    }

    @Override
    public void close() {
        System.out.println("键盘关闭");
    }

    public void knock()
    {
        System.out.println("敲键盘映射");
    }
}
