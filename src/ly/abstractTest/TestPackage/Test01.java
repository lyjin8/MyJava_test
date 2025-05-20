package ly.abstractTest.TestPackage;

import ly.abstractTest.ObjectPackage.Cat;
import ly.abstractTest.ObjectPackage.Dog;

public class Test01 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.eat();
        new Dog().eat();
    }
}
