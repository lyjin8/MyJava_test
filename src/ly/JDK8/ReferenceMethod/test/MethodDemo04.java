package ly.JDK8.ReferenceMethod.test;

import ly.JDK8.ReferenceMethod.object.Person;

import java.util.function.Function;

public class MethodDemo04 {
    public static void main(String[] args) {
       method(s -> new Person(s),"张三");
        System.out.println("=============================");
        method(Person::new,"张三");
    }
    public static void method(Function<String, Person> function,String s)
    {
        Person person = function.apply(s);
        System.out.println("person = " + person);
    }
}
