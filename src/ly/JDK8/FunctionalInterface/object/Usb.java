package ly.JDK8.FunctionalInterface.object;

@FunctionalInterface
public interface Usb {
    void open(String s);
    static void close(){}
}
