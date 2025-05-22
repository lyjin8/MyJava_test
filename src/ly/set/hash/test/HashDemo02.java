package ly.set.hash.test;

import ly.set.hash.object.Person;

import java.util.HashSet;

/**
 * 1.先计算元素的哈希值(重写hashCode方法),再比较内容(重写equals方法)
 * 2.先比较哈希值,如果哈希值不一样,存
 * 3.如果哈希值一样,再比较内容
 *   a.如果哈希值一样,内容不一样,存
 *   b.如果哈希值一样,内容也一样,去重复
 */
public class HashDemo02 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("张三");
        set.add("张三丰");
        set.add("张无忌");
        set.add("张三");
        System.out.println("set = " + set);

        //当person重新了hashcode()和equals()方法后,就有了去重复的效果
        HashSet<Person> set1 = new HashSet<>();
        set1.add(new Person(18, "张三"));
        set1.add(new Person(19, "李四"));
        set1.add(new Person(18, "张三"));
        System.out.println("set1 = " + set1);
    }

}
