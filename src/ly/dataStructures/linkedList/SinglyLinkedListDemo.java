package ly.dataStructures.linkedList;

import java.util.stream.Stream;

/**
 * 单链表
 * 找朋友：把每个朋友都遍历出来，每个朋友都有编号
 * 1、不安顺序遍历
 * 2、按编号顺序遍历
 */
public class SinglyLinkedListDemo {
    public static void main(String[] args) {
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.add(new PersonNode(1,"张三","男"));
        singleLinkedList.add(new PersonNode(2,"李四","女"));
        singleLinkedList.add(new PersonNode(3,"王五","女"));
        singleLinkedList.add(new PersonNode(4,"马六","男"));
        singleLinkedList.list();
    }

}
//定义SingleLinkedList单链表用于管理PersonNode
class SingleLinkedList{
    //初始头节点
    private PersonNode head = new PersonNode(0,"","");

    //添加节点
    /*
    当不考虑no的时候，找到当前链表的最后节点，将最后的节点的next指向新的节点
    当下一个节点为null时，该节点是最后节点
     */
    public void add(PersonNode personNode){
        PersonNode temp = head;
        //找到链表最后并跳出
        while (temp.next != null) {
            //如果没找到就将temp后移
            temp = temp.next;
        }
        //跳出循环的时候就是链表的最后
        temp.next = personNode;
    }
    public void list(){
        //判断链表是否为空
        if (head.next == null){
            System.out.println("链表为空");
            return;
        }
        PersonNode temp = head;//头节点无法随意更改，所以创建中间变量
        while (temp.next != null)
        {
            System.out.println(temp);
            //temp后移
            temp = temp.next;
        }
    }
}
//定义PersonNode，每个PersonNode对象就是一个节点
class PersonNode{
    private int no;
    private String name;
    private String gender;
    public PersonNode next;//指向下一个节点

    public PersonNode(int no, String name, String gender) {
        this.no = no;
        this.name = name;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "PersonNode{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                '}';
    }
}
