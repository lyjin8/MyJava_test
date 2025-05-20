package ly.ObjectEquals;

public class Test {
    public static void main(String[] args) {
        /*
        如果没有重新重写equals方法，则默认调用Object类中的equals方法，比较两个对象的地址
        如果有重新重写equals方法，则调用重写后的equals方法，比较两个对象的内容
         */
        Person person = new Person("张三", 18);
        Person person1 = new Person("张三", 18);
        System.out.println(person.equals(person1));
        System.out.println(person == person1);
        System.out.println("========================");

        String s1 = new String("abc");
        String s2 = new String("abc");
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);
    }
}
