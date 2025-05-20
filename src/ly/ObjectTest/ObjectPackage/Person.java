package ly.ObjectTest.ObjectPackage;

public class Person {
    public String name;
    public int age;

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

    int num = 10;

    public Person(){
//        this(10);
        System.out.println("我是Person的无参构造");
    }
    public Person(int num){
        this();

        System.out.println("我是Person的有参构造");
    }
    public void method(){
        System.out.println("我是Person的method方法");
        this.method1();
    }
    public void method1(){
        int num = 20;
        System.out.println("num = " + num);
        System.out.println("num = " + this.num);
        System.out.println("我是Person的method1方法");
    }
}
