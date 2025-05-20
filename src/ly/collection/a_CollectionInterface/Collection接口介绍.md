# collection接口介绍

```java
1.概述:单列集合的顶级接口
2.使用:
  a.创建:
    Collection<E> 对象名 = new 实现类对象<E>()
  b.<E>:泛型,决定了集合中能存储什么类型的数据,可以统一元素类型
        泛型中只能写引用数据类型,如果不写,默认Object类型,此时什么类型的数据都可以存储了
        <int> 不行
        <Integer> 行
        <Person> 行
      
  c.泛型细节:
    我们等号前面的泛型必须写,等号后面的泛型可以不写,jvm会根据前面的泛型推导出后面的泛型是啥
      
3.常用方法:
  boolean add(E e) : 将给定的元素添加到当前集合中(我们一般调add时,不用boolean接收,因为add一定会成功)
  boolean addAll(Collection<? extends E> c) :将另一个集合元素添加到当前集合中 (集合合并)
  void clear():清除集合中所有的元素
  boolean contains(Object o)  :判断当前集合中是否包含指定的元素
  boolean isEmpty() : 判断当前集合中是否有元素->判断集合是否为空
  boolean remove(Object o):将指定的元素从集合中删除
  int size() :返回集合中的元素个数。
  Object[] toArray(): 把集合中的元素,存储到数组中
```