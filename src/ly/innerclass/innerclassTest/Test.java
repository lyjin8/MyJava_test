package ly.innerclass.innerclassTest;

import ly.innerclass.innerclassObject.Human;
import ly.innerclass.innerclassObject.Student;

public class Test {
    public static void main(String[] args) {
        Student.Person person = new Student().new Person();
        person.display("王五");

        Human human = new Human();
        human.eat();
    }
}
