package ly.ObjectTest;

import ly.ObjectTest.ObjectExtends.ManagerForEmployee;

public class SuperTest02 {
    public static void main(String[] args) {
        ManagerForEmployee manager = new ManagerForEmployee();
        manager.method();

        System.out.println("================");
        ManagerForEmployee manager1 = new ManagerForEmployee(10);
    }
}
