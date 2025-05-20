package ly.ObjectTest.ObjectPackage;

public class Employee {
    //员工类
    public String name;
    public int age;

    public void work(){
        System.out.println("老师需要给学生上课");
    }
    private void eat()
    {
        System.out.println("人需要吃饭");
    }

    public Employee(){
        System.out.println("我是父类的无参构造");
    }
    public Employee(int a){
        System.out.println("我是父类的有参构造");
    }
    public void method()
    {
        System.out.println("我是父类中的method方法");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
