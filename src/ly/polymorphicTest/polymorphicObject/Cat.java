package ly.polymorphicTest.polymorphicObject;

public class Cat extends Animal{
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    //特有方法
    public void catchMouse()
    {
        System.out.println("猫能抓老鼠");
    }
}
