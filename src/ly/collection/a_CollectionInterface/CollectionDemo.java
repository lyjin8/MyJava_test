package ly.collection.a_CollectionInterface;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        //boolean add(E e) : 将给定的元素添加到当前集合中(我们一般调add时,不用boolean接收,因为add一定会成功)
        collection.add("张三");
        collection.add("李四");
        collection.add("王五");
        collection.add("马六");
        System.out.println("collection = " + collection);
        //boolean addAll(Collection<? extends E> c) :将另一个集合元素添加到当前集合中 (集合合并)
        Collection<String> collection1 = new ArrayList<>();
        collection1.add("赵六");
        collection1.add("钱七");
        collection1.add("孙八");
        collection.addAll(collection1);
        System.out.println("collection = " + collection);
        //void clear() :清空集合中的元素
        collection.clear();
        System.out.println("collection = " + collection);
        //boolean contains(Object o) :判断当前集合中是否存在给定的元素
        boolean  b = collection.contains("张三");
        System.out.println("b = " + b);
        //boolean isEmpty() : 判断当前集合是否为空
        System.out.println(collection.isEmpty());
        //boolean remove(Object o) : 从当前集合中移除给定的元素
        collection1.remove("赵六");
        System.out.println(collection1);
    }
}
