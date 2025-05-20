package ly.collection.d_CollectionsUtills;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionsDemo {

    //创建Person静态类
    public static class Person{
        private String name;
        private int age;

        public Person() {
        }

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }

    //创建学生类实现Comparable接口
    public static class Student implements Comparable<Student>{
        private String name;
        private Integer score;

        public Student() {
        }

        public Student(String name, Integer score) {
            this.name = name;
            this.score = score;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getScore() {
            return score;
        }

        public void setScore(Integer score) {
            this.score = score;
        }
        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", score=" + score +
                    '}';
        }

        @Override
        public int compareTo(Student o) {
            return this.getScore()-o.getScore();
        }
    }
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
//        static <T> boolean addAll(Collection<? super T> c, T... elements)->批量添加元素
        Collections.addAll(list,"张三","李四","王五","赵六","小七");
        System.out.println("list = " + list);
//        static void shuffle(List<?> list) ->将集合中的元素顺序打乱
        Collections.shuffle(list);
        System.out.println("list = " + list);
//        static <T> void sort(List<T> list) ->将集合中的元素按照默认规则排序-> ASCII码排序
        ArrayList<String> list1 = new ArrayList<>();
        Collections.addAll(list1,"b.疑是地上霜","d.低头思故乡","a.床前明月光","c.举头望明月");
        System.out.println("list1 = " + list1);
//        static <T> void sort(List<T> list, Comparator<? super T> c)->将集合中的元素按照指定规则排序
        //创建一个对象集合
        //在主类中实现Comparator接口
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("张三", 18));
        people.add(new Person("李四", 19));
        people.add(new Person("王五", 20));
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                //o1 - o2 升序
                //o2 - o1 降序
                return o2.getAge()-o1.getAge();
            }
        });
        System.out.println("people = " + people);
        //在对象中实现Comparable接口
        //方法 int Comparable.compareTo(T o) ->this - o 升序  o-this 降序
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("张三", 100));
        students.add(new Student("李四", 90));
        students.add(new Student("王五", 80));
        Collections.sort(students);//此时由于对象中指定了怎样排序，所有此时不会报运行错误
        System.out.println("students = " + students);
    }
}
