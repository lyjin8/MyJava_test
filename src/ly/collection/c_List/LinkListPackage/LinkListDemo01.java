package ly.collection.c_List.LinkListPackage;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkListDemo01 {
    public static void main(String[] args) {
        /*
           public void addFirst(E e):将指定元素插入此列表的开头。
           public void addLast(E e):将指定元素添加到此列表的结尾。
           public E getFirst():返回此列表的第一个元素。
           public E getLast():返回此列表的最后一个元素。
           public E removeFirst():移除并返回此列表的第一个元素。
           public E removeLast():移除并返回此列表的最后一个元素。
           public E pop():从此列表所表示的堆栈处弹出一个元素。
           public void push(E e):将元素推入此列表所表示的堆栈。
           public boolean isEmpty()：如果列表没有元素，则返回true。
         */
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("吕布");
        linkedList.add("刘备");
        linkedList.add("关羽");
        linkedList.add("张飞");
        linkedList.add("貂蝉");
        System.out.println(linkedList);

        linkedList.addFirst("孙尚香");
        System.out.println(linkedList);

        linkedList.addLast("董卓");
        System.out.println(linkedList);

        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());

        linkedList.removeFirst();
        System.out.println(linkedList);

        linkedList.removeLast();
        System.out.println(linkedList);

        System.out.println("======================");

        Iterator<String> iterator = linkedList.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("=======================");
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
        }
    }

}
