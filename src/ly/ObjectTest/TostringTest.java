package ly.ObjectTest;

import ly.ObjectTest.ObjectPackage.Person;

import java.util.ArrayList;
import java.util.List;

public class TostringTest {
    public static void main(String[] args) {
        Person person = new Person("张三", 10);
        System.out.println(person);//ly.ObjectTest.ObjectPackage.Person@23fc625e
        System.out.println(person.toString());//ly.ObjectTest.ObjectPackage.Person@23fc625e
        System.out.println("================");

        ArrayList<String> list = new ArrayList<>();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        System.out.println(list);//[张三, 李四, 王五]
        System.out.println(list.toString());//[张三, 李四, 王五]
    }
}
