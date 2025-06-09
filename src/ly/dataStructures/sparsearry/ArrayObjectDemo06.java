package ly.dataStructures.sparsearry;

public class ArrayObjectDemo06 {
    //对象数组
    //先创建一个对象Person,包含name、age
    public static void main(String[] args) {
        Person[] person = new Person[3];
        Person person1 = new Person("张三", 18);
        Person person2 = new Person("李四", 19);
        Person person3 = new Person("王五", 20);

        person[0] = person1;
        person[1] = person2;
        person[2] = person3;
        for (Person p : person) {
            System.out.println(p.getName()+" "+p.getAge());
        }
    }
}
