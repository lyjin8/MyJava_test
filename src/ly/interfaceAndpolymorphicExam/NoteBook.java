package ly.interfaceAndpolymorphicExam;

public class NoteBook {
    public void start()
    {
        System.out.println("开机");
    }
    //调Usb
    public void useUsb(Usb usb)
    {
        if (usb instanceof Mouse)
        {
            Mouse mouse = (Mouse)usb;
            mouse.open();
            mouse.click();
            mouse.close();
        }else if (usb instanceof KeyBoard){
            KeyBoard keyBoard = (KeyBoard)usb;
            keyBoard.open();
            keyBoard.knock();
            keyBoard.close();
        }
    }
    public void stop()
    {
        System.out.println("关机");
    }
}
