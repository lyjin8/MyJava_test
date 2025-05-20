package ly.ObjectTest.ObjectExtends;

import ly.ObjectTest.ObjectPackage.Employee;

public class ManagerForEmployee extends Employee {

    //重新父类中的work()方法，检验重写方法的param参数为@Override
    @Override
    public void work(){
        System.out.println("班主任不仅要给学生上课，还要管理学生");
    }


    public ManagerForEmployee(){
        super();
        System.out.println("我是子类中的无参构造");
    }
    public ManagerForEmployee(int a){
        super(a);
        System.out.println("我是子类中的有参构造");
    }
    public void method(){
        super.method();
        System.out.println("我是子类的method方法");
    }
}
