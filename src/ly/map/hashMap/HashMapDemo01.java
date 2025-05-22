package ly.map.hashMap;

import java.util.HashMap;

/**
 * 1.概述:HashMap是Map的实现类
 * 2.特点:
 *   a.key唯一,value可重复 -> 如果key重复了,会发生value覆盖
 *   b.无序
 *   c.无索引
 *   d.线程不安全
 *   e.可以存null键null值
 * 3.数据结构:
 *   哈希表
 */
public class HashMapDemo01 {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        //V put(K key, V value)  -> 添加元素,返回的是被覆盖的value
        hashMap.put("秦始皇","嬴政");
        hashMap.put("汉高祖","刘邦");
        hashMap.put("汉武帝","刘彻");
        hashMap.put("隋文帝","刘彻");
        System.out.println("hashMap = " + hashMap);
        //V remove(Object key)  ->根据key删除键值对,返回的是被删除的value
        String remove = hashMap.remove("隋文帝");
        System.out.println("remove = " + remove);
        System.out.println("hashMap = " + hashMap);
        //V get(Object key) -> 根据key获取value
        System.out.println(hashMap.get("秦始皇"));
        //boolean containsKey(Object key)  -> 判断集合中是否包含指定的key
        System.out.println(hashMap.containsKey("秦始皇"));
        //Collection<V> values() -> 获取集合中所有的value,转存到Collection集合中
        System.out.println(hashMap.values());

    }
}
