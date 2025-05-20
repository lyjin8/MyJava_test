package ly.set.hash.test;

import ly.set.hash.object.Person;

/**
 * hash值测试
 */
public class HashDemo01 {
    public static void main(String[] args) {
        Person person1 = new Person(10, "张三");
        Person person2 = new Person(10, "张三");
        //获取地址值
        System.out.println("person2 = " + person2);//ly.set.hash.object.Person@23fc625e
        System.out.println("person1 = " + person1);//ly.set.hash.object.Person@3f99bd52
        //获取hash值
        System.out.println("person2.hashCode() = " + person2.hashCode());//603742814
        System.out.println("person1.hashCode() = " + person1.hashCode());//1067040082
        //将hash值转化成十六进制
        System.out.println("Person1:"+Integer.toHexString(1067040082));//3f99bd52
        System.out.println("Person2:"+Integer.toHexString(603742814));//23fc625e
        //发现地址值就是通过类的hash值转换成十六进制之后通过字符串拼接形成的
        System.out.println("=============");
        String s1 = "abc";
        String s2 = new String("abc");
        System.out.println(s1.hashCode());//96354
        System.out.println(s2.hashCode());//96354
        /*
        当输出上述结果之后会发现，s1.hashCode()和s2.hashCode()的值相同，
        这是由于String重写了hashCode方法，导致对比的是值的hashcode而不是地址的hashcode
         */

        /*
        总结：
        不重写hashcode()，默认计算对象的哈希值
        重新hashcode(),计算的是对象内容的哈希值
         */
    }
}
