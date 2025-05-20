package ly.InterfaceTest.InterfacePackage;

public interface Animal {
    public void eat();
    public void sleep();

    /**
     * jdk8新特性 接口中可以实现默认方法和静态方法
     * 默认方法：可继承，可不继承（可重新）
     * 静态方法：只能继承
     */

    //默认方法
    public default void run(){
        System.out.println("动物能够跑");
    }

    public static void say(){
        System.out.println("动物都能发出声音");
    }

    public static final int age = 2;
    int age2 = 3;
}
