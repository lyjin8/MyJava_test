package ly.JDK8.Stream.test;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * Stream体验流式操作
 */
public class StreamDemo01 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("张三丰");
        list.add("张大彪");
        list.add("吕不韦");
        list.add("张三");
        list.add("赵姬");
        list.add("张翠山");
        list.add("嫪毐");

        //1、筛选出姓张的人
        ArrayList<String> listZhang = new ArrayList<>();
        for (String s : list) {
            if (s.startsWith("张")) {
                listZhang.add(s);
            }
        }
        System.out.println(listZhang);
        //2、筛选出姓张且长度为3的人
        ArrayList<String> listThree = new ArrayList<>();
        for (String s : listZhang) {
            if (s.length()==3) {
                listThree.add(s);
            }
        }
        System.out.println(listThree);
        //3、遍历输出姓张并且是三个字的名字
        for (String s : listThree) {
            System.out.println(s);
        }
        //上面的就是流式操作，每一步都用到了前面的方法，因此可以使用Stream流式操作
        System.out.println("=======流式操作==========");
        Stream<String> stream = list.stream();
        stream.filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.startsWith("张");
            }
        }).filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.length()==3;
            }
        }).forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        System.out.println("============lambda表达式操作结果=========");
        list.stream().filter(s -> s.startsWith("张"))
                .filter(s->s.length()==3)
                .forEach(System.out::println);
    }
}
