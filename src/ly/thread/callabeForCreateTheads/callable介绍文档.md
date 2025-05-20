# callable 介绍文档
### 概念：
```java
1.概述:Callable<V>是一个接口,类似于Runnable
2.方法:
  V call()  -> 设置线程任务的,类似于run方法
3.call方法和run方法的区别:
  a.相同点:都是设置线程任务的
  b.不同点:
    call方法有返回值,而且有异常可以throws
    run方法没有返回值,而且有异常不可以throws
        
4.<V> 
  a.<V>叫做泛型
  b.泛型:用于指定我们操作什么类型的数据,<>中只能写引用数据类型,如果泛型不写,默认是Object类型数据
  c.实现Callable接口时,指定泛型是什么类型的,重写的call方法返回值就是什么类型的
      
5.获取call方法返回值: FutureTask<V>
  a. FutureTask<V> 实现了一个接口: Future <V>
  b. FutureTask<V>中有一个方法:
     V get() -> 获取call方法的返回值
```