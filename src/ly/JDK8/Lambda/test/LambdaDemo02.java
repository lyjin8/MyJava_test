package ly.JDK8.Lambda.test;

import ly.JDK8.Lambda.object.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaDemo02 {
    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person("张三", 20));
        list.add(new Person("李四", 18));
        list.add(new Person("王五", 19));
//        Collections.sort(list, new Comparator<Person>() {
//            @Override
//            public int compare(Person o1, Person o2) {
//                return o1.getAge()-o2.getAge();
//            }
//        });

//        System.out.println("=========Lambda=========");
//        Collections.sort(list, (o1,o2)->{return o1.getAge()-o2.getAge();});

        System.out.println("========Lambda简化版=========");
        Collections.sort(list, (o1,o2)->o1.getAge()-o2.getAge());
        for(Person p : list)
        {
            System.out.println(p);
        }
    }
}
