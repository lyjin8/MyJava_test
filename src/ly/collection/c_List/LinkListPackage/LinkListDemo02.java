package ly.collection.c_List.LinkListPackage;

import java.util.LinkedList;

public class LinkListDemo02 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("吕布");
        linkedList.add("刘备");
        linkedList.add("关羽");
        linkedList.add("张飞");
        linkedList.add("貂蝉");
        linkedList.pop();//相当于linkedList.removeFirst();
        System.out.println(linkedList);
        linkedList.push("关羽");//相当于linkedList.addFirst("关羽");
        System.out.println(linkedList);
    }
}
