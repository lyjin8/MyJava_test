package ly.set.linkHashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

/**
 * 1.概述:LinkedHashSet extends HashSet
 * 2.特点:
 *   a.元素唯一
 *   b.元素有序
 *   c.无索引
 *   d.线程不安全
 * 3.数据结构:
 *   哈希表+双向链表
 * 4.使用:和HashSet一样
 */
public class LinkHashSetDemo01 {
    public static void main(String[] args) {
        LinkedHashSet<String> hashSet = new LinkedHashSet<>();
        hashSet.add("张三");
        hashSet.add("张三丰");
        hashSet.add("张无忌");
        hashSet.add("李四");
        hashSet.add("王五");
        hashSet.add("张三");
        System.out.println(hashSet);
        System.out.println("=================");
        for (String s : hashSet) {
            System.out.println(s);
        }
        System.out.println("=================");
        Iterator<String> iterator = hashSet.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

}
