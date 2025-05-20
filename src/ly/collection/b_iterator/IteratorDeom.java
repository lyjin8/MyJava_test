package ly.collection.b_iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDeom {
    public static void main(String[] args) {
        //迭代器
        Collection<String> collection = new ArrayList<>();
        collection.add("张三");
        collection.add("李四");
        collection.add("王五");
        Iterator<String> iterator = collection.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);
        }
    }
}
