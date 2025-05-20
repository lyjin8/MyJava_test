package ly.polymorphicTest.polymorphicObject;

public class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("狗啃骨头");
    }

    //特有方法
    public void lookDoor()
    {
        System.out.println("狗能看门");
    }

}
