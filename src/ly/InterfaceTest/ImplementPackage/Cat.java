package ly.InterfaceTest.ImplementPackage;

import ly.InterfaceTest.InterfacePackage.Animal;

public class Cat implements Animal {
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    @Override
    public void sleep() {
        System.out.println("猫白天睡觉");
    }
    @Override
    public void run(){
        System.out.println("小猫在跑");
    }
}
