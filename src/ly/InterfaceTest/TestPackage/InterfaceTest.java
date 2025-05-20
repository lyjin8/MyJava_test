package ly.InterfaceTest.TestPackage;

import ly.InterfaceTest.ImplementPackage.Cat;
import ly.InterfaceTest.ImplementPackage.Dog;

public class InterfaceTest {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        cat.eat();
        dog.eat();
        cat.sleep();
        dog.sleep();

        cat.run();

    }
}
