package ly.polymorphicTest.polymorphicPackage;

import ly.polymorphicTest.polymorphicObject.*;

public class Test01 {
    public static void main(String[] args) {
        //原始方法
        Cat cat = new Cat();
        cat.eat();//重写
        cat.catchMouse();//特有

        Dog dog = new Dog();
        dog.eat();//重写
        dog.lookDoor();//特有

        System.out.println("====================");

        //多态

//        Animal animal = new Cat();
//        animal.eat();
        //多态形式下不能直接调用子类特有成员
        //想要调用就需要用到向下转型

//        Animal animal1 = new Dog();
//        animal1.eat();

        //在了解向下转型之前需要明白向上和向下转型的两个概念
        /**
         * 向上转型就好比是小类型往大类型的转换 如：double b = 1;输出的结果为：1.0
         * 向下转型就好比是大类型往小类型转换这里需要用到强转 如int a = (int) b;
         * 代入多态的情况下就是
         *      向上：Animal animal = new Cat();
         *      向下：Cat cat = (Cat) animal;
         */
        Animal animal = new Cat();
        animal.eat();
        Cat cat1 = (Cat) animal;
        cat1.catchMouse();
        method(cat);
    }
    public static void method(Animal animal)
    {
        animal.eat();
        /**
         * 转型会出现的问题：当调用method方法的时候，传入的是Cat而转型的是Dog就会出现类型转换异常(classCastException)
         *         Dog dog = (Dog) animal;
         *         dog.lookDoor();
         * 而解决上述问题就需要用到instanceof类型判断
         * 使用方法：对象 instanceof 类型 ---> 判断对象是否符合关键字，符合返回true，不符合返回false;
         */
        if (animal instanceof Dog)
        {
            Dog dog = (Dog) animal;
            dog.lookDoor();
        } else if (animal instanceof Cat) {
            Cat cat = (Cat) animal;
            cat.catchMouse();
        }
    }
}
