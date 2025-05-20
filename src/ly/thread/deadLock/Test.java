package ly.thread.deadLock;

public class Test {
    public static void main(String[] args) {
        DeadLock d1 = new DeadLock(true);
        DeadLock d2 = new DeadLock(false);

        new Thread(d1,"LockA").start();
        new Thread(d2,"LockB").start();
    }
}
