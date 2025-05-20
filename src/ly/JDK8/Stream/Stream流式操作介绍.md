# Stream流式操作介绍

## 流
**Stream“流”中的流不是特指“IO流”，它是一种流式编程（编程方式），通俗来讲就是流水线操作，从上往下的进行**

## 1.Stream的获取

```java
1.针对集合:Collection中的方法
    Stream<E> stream()  
    
2.针对数组:Stream接口中的静态方法:
    static <T> Stream<T> of(T... values)  
```

```java
public class Demo02Stream {
    public static void main(String[] args) {
        //1.针对集合:Collection中的方法
        //Stream<E> stream()
        ArrayList<String> list = new ArrayList<>();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        Stream<String> stream = list.stream();
        System.out.println(stream);

        //2.针对数组:Stream接口中的静态方法:
        //static <T> Stream<T> of(T... values)
        Stream<String> stream1 = Stream.of("金莲", "三上", "松下");
        System.out.println(stream1);
    }
}
```

## 2.Stream的方法

### 2.1.Stream中的forEach方法:void forEach(Consumer<? super T> action);

```java
forEach : 逐一处理->遍历
void forEach(Consumer<? super T> action);

注意:forEach方法是一个[终结方法],使用完之后,Stream流不能用了
```

```java
 /**
     * 逐一处理,可以用来遍历
     */
    private static void foreach() {
        Stream<String> stream1 = Stream.of("金莲", "三上", "松下");
       /* stream1.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });*/
        System.out.println("==============");

        stream1.forEach(s-> System.out.println(s));
    }
```

### 2.2.Stream中的long count()方法

```java
1.作用:统计元素个数
2.注意:count也是一个终结方法
```

```java
    /**
     * 统计元素个数
     */
    private static void count() {
        Stream<String> stream1 = Stream.of("金莲", "三上", "松下","柳岩");
        long count = stream1.count();
        System.out.println("count = " + count);
    }
```

### 2.3.Stream中的Stream<T> filter(Predicate<? super T> predicate)方法

```java
1.方法:Stream<T> filter(Predicate<? super T> predicate)方法,返回一个新的Stream流对象
2.作用:根据某个条件进行元素过滤
```

```java
    private static void filter() {
        Stream<String> stream1 = Stream.of("金莲", "三上", "松下","柳岩","张无忌");
        /*stream1.filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.length() == 2;
            }
        }).forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });*/

        System.out.println("============");

        stream1.filter(s -> s.length()==2).forEach(s -> System.out.println(s));


    }
```

### 2.4.Stream<T> limit(long maxSize):获取Stream流对象中的前n个元素,返回一个新的Stream流对象

```java
1.Stream<T> limit(long maxSize):获取Stream流对象中的前n个元素,返回一个新的Stream流对象
```

```java
    /**
     * 获取前几个元素
     */
    private static void limit() {
        Stream<String> stream1 = Stream.of("金莲", "三上", "松下","柳岩","张无忌");
        stream1.limit(3).forEach(s -> System.out.println(s));
    }
```

### 2.5.Stream<T> skip(long n): 跳过Stream流对象中的前n个元素,返回一个新的Stream流对象

```java
Stream<T> skip(long n): 跳过Stream流对象中的前n个元素,返回一个新的Stream流对象
```

```java
    /**
     * 跳过前n个元素
     */
    private static void skip() {
        Stream<String> stream1 = Stream.of("金莲", "三上", "松下","柳岩","张无忌");
        stream1.skip(2).forEach(s -> System.out.println(s));
    }

```

### 2.6.static <T> Stream<T> concat(Stream<? extends T> a, Stream<? extends T> b):两个流合成一个流

```java
1.方法:static <T> Stream<T> concat(Stream<? extends T> a, Stream<? extends T> b):两个流合成一个流
```

```java
    /**
     *  流合并,是一个静态方法
     */
    private static void concat() {
        Stream<String> stream1 = Stream.of("金莲", "三上", "松下","柳岩","张无忌");
        Stream<String> stream2 = Stream.of("涛哥", "涛哥1", "涛哥2","涛哥3");

        Stream.concat(stream1, stream2).forEach(s -> System.out.println(s));

    }

```

### 2.7.将Stream流变成集合

```java
从Stream流对象转成集合对象，使用Stream接口方法collect()
```

```java
    /**
     * 流转集合
     */
    private static void collect() {
        Stream<String> stream1 = Stream.of("金莲", "三上", "松下","柳岩","张无忌");
        List<String> list = stream1.collect(Collectors.toList());
        System.out.println(list);
    }
```

### 2.8.dinstinct方法

```
Stream<T> distinct()
元素去重复,依赖hashCode和equals方法
```

```java
    /**
     * 去重复元素
     * 被去重的元素底层需要重写hashCode和equals方法
     */
    private static void distinct() {
        //Stream<String> stream1 = Stream.of("金莲", "三上", "松下","柳岩","张无忌","张无忌");
        //stream1.distinct().forEach(s -> System.out.println(s));

        Stream<Person> stream = Stream.of(new Person("张三", 10), new Person("李四", 12), new Person("张三", 10));
        stream.distinct().forEach(person -> System.out.println(person));
    }
```

### 2.9.转换流中的类型

```java
Stream<R> map(Function<T,R> mapper)-> 转换流中的数据类型
```

```java
    /**
     * 转换流中的类型
     */
    private static void map() {
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6);
        stream.map(new Function<Integer, String>() {
            @Override
            public String apply(Integer integer) {
                return integer+"";
            }
        }).forEach(s -> System.out.println(s+1));
    }
```
