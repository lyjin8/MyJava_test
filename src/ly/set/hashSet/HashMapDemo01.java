package ly.set.hashSet;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/**
 * 1.概述:HashSet是Set接口的实现类
 * 2.特点:
 *   a.元素唯一
 *   b.元素无序
 *   c.无索引
 *   d.线程不安全
 * 3.数据结构:哈希表
 *   a.jdk8之前:哈希表 = 数组+链表
 *   b.jdk8之后:哈希表 = 数组+链表+红黑树
 *             加入红黑树目的:查询快
 * 4.方法:和Collection一样
 * 5.遍历:
 *   a.增强for
 *   b.迭代器
 */
public class HashMapDemo01 {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
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
