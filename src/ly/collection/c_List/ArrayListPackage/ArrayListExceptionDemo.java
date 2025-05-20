package ly.collection.c_List.ArrayListPackage;

import java.util.ArrayList;

public class ArrayListExceptionDemo {
    public static void main(String[] args) {
        //如果使用remove删除指定元素的时候 集合中存储的是整形，那么会出现索引越界异常
        //remove(int index) -> 删除指定索引位置上的元素,返回的是被删除的那个元素
        //remove(Object o) -> 删除指定元素,返回的是被删除的那个元素
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        try {
            list.remove(2);
        } catch (Exception e) {
            throw new RuntimeException("索引越界异常");
        }finally {
            //解决办法是使用Interge 包装类的valueOf方法
            list.remove(Integer.valueOf(2));
            System.out.println("list = " + list);
        }

    }
}
