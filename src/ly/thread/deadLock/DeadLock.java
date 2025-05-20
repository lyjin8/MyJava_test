package ly.thread.deadLock;

public class DeadLock implements Runnable{
    /**
     * 死锁：当线程A想访问线程B的资源，而线程B想访问线程A的资源时，
     * 线程A要访问B就得等B释放资源后才能让A访问，但此时B要访问A，也要等A释放资源后才能访问，
     * 线程A和线程B就会互相等待，造成死锁。
     *
     * 但是在这种情况下，也会不出现死锁，原因在于一个线程先与另一个线程释放资源，这和cpu调度有关，当然几率很低
     */

    private boolean flag;

    public DeadLock(boolean flag) {
        this.flag = flag;
    }

    @Override
    public void run() {
        if (flag){
            synchronized (LockA.lockA){
                System.out.println("if...lockA");
                synchronized (LockB.lockB){
                    System.out.println("if...lockB");
                }
            }

        }else {
            synchronized (LockB.lockB){
                System.out.println("else...lockB");
                synchronized (LockA.lockA){
                    System.out.println("else...lockA");
                }
            }

        }

    }
}
