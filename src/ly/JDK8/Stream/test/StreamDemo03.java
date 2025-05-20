package ly.JDK8.Stream.test;
import ly.JDK8.Stream.object.Person;

import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo03 {
    public static void main(String[] args) {
        forEach();
        System.out.println("=====================");
        count();
        System.out.println("=====================");
        filter();
        System.out.println("=====================");
        limit();
        System.out.println("=====================");
        skip();
        System.out.println("=====================");
        concat();
        System.out.println("=====================");
        collect();
        System.out.println("=====================");
        distinct();
        System.out.println("=====================");
        map();
        System.out.println("=====================");

    }

    /**
     * 转换流中的类型
     */
    private static void map() {
        Stream.of(1,2,3,4,5,6,7,8,9)
                .map(integer -> integer+"")
                .forEach(s -> System.out.println(s+1));
    }

    /**
     * 去重
     * 底层需要重新实现hashCode和equals方法
     */
    private static void distinct() {
        Stream.of("金莲", "三上", "松下", "张三","张三","张三丰").distinct().forEach(System.out::println);
        //传对象
        Stream.of(new Person("张三", 18), new Person("李四", 19), new Person("王五", 20), new Person("张三", 18)).distinct().forEach(System.out::println);
    }

    /**
     * 流转集合
     */
    private static void collect() {
        Stream.of("金莲", "三上", "松下",  "张三").collect(Collectors.toList()).forEach(System.out::println);
        Stream.of("张三", "李四", "王五", "马六").toList().forEach(System.out::println);
    }

    /**
     * 流合并
     */
    private static void concat() {
        Stream<String> stream1 = Stream.of("金莲", "三上", "松下", "张三");
        Stream<String> stream2 = Stream.of("张三", "李四", "王五", "马六");
        Stream.concat(stream1,stream2).forEach(System.out::println);
    }

    /**
     * 跳过前几个元素
     */
    private static void skip() {
        Stream.of("金莲", "三上", "松下", "张三").skip(2).forEach(System.out::println);
    }

    /**
     * 获取前几个元素
     */
    private static void limit() {
        Stream.of("金莲", "三上", "松下", "张三").limit(3).forEach(System.out::println);
    }

    /**
     * 过滤元素
     */
    private static void filter() {
        Stream.of("金莲", "三上", "松下", "张三","李四","张三丰").filter(
                s -> s.length()==2
        ).forEach(System.out::println);
    }

    /**
     * 统计元素个数
     */
    private static void count() {
        long count = Stream.of("金莲", "三上", "松下", "张三").count();
        System.out.println("count = " + count);
    }

    /**
     * 逐一处理，可以用来遍历
     */
    private static void forEach() {
        Stream.of("金莲", "三上", "松下").forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
        System.out.println("==================");
        Stream.of("金莲", "三上", "松下").forEach(System.out::println);
    }
}
