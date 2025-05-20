package ly.collection.b_iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorDemo02 {
    public static void main(String[] args) {
        //需求:定义一个集合,存储 唐僧,孙悟空,猪八戒,沙僧,遍历集合,如果遍历到猪八戒,往集合中添加一个白龙马
        ArrayList<String> collection = new ArrayList<>();
        collection.add("唐僧");
        collection.add("孙悟空");
        collection.add("猪八戒");
        collection.add("沙僧");
        Iterator<String> iterator = collection.iterator();
        try {
            while (iterator.hasNext()) {
                String next = iterator.next();
                //并发修改异常ConcurrentModificationException
                //当实际操作次数与预期操作次数不相等的时候就会出现并发修改异常
                if ("猪八戒".equals(next)){
                    collection.add("白龙马");
                }
            }
        }catch (Exception e)
        {
            System.out.println("并发修改异常");
        }

        ListIterator<String> listIterator = collection.listIterator();
        while (listIterator.hasNext()) {
            String next = listIterator.next();
            if ("猪八戒".equals(next))
            {
                listIterator.add("白龙马");
            }
            System.out.println(next);
        }
    }
}
