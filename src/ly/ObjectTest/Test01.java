package ly.ObjectTest;

import ly.ObjectTest.ObjectExtends.ManagerForEmployee;
import ly.ObjectTest.ObjectExtends.TeacherForEmployee;

public class Test01 {
    public static void main(String[] args) {
        TeacherForEmployee teacher = new TeacherForEmployee();
        teacher.name = "张三";
        teacher.age = 18;
        teacher.work();
        System.out.println(teacher.toString());
        System.out.println("=====================");

        ManagerForEmployee manager = new ManagerForEmployee();
        manager.name = "李四";
        manager.age = 18;
        manager.work();
        System.out.println(manager.toString());

    }
}
