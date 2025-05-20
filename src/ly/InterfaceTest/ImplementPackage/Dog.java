package ly.InterfaceTest.ImplementPackage;

import ly.InterfaceTest.InterfacePackage.Animal;

public class Dog implements Animal {
    @Override
    public void eat() {
        System.out.println("狗啃骨头");
    }

    @Override
    public void sleep() {
        System.out.println("狗晚上睡觉");
    }
    @Override
    public void run(){
        System.out.println("小狗在跑");
    }

}
