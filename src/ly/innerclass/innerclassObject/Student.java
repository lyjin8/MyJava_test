package ly.innerclass.innerclassObject;

public class Student {
    String name = "张三";
     public class Person{
        String name = "李四";
        public void display(String name)
        {
            System.out.println(name);//内部的局部变量
            System.out.println(this.name);//内部的成员变量
            System.out.println(Student.this.name);//外部类的成员变量
        }
    }
}
