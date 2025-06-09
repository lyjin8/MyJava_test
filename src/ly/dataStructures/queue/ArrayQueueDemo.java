package ly.dataStructures.queue;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 数组模拟队列
 */
public class ArrayQueueDemo {
    public static void main(String[] args) {
        ArrayQueue arrayQueue = new ArrayQueue(5);
        Scanner scanner = new Scanner(System.in);//接收用户操作
        String input = "";
        boolean flag = true;
        while (flag){
                System.out.println("s(show):显示队列");
                System.out.println("e(exit):退出程序");
                System.out.println("a(add):添加数据到队列");
                System.out.println("g(get):从队列取出数据");
                System.out.println("h(head):查看队列头的数据");
                System.out.println("请输入你的选择");
                input = scanner.next();
                switch (input){
                    case "s":
                        arrayQueue.showQueue();
                        break;
                    case "a":
                        System.out.print("请输入要添加的数：\n");
                        arrayQueue.addQueue(scanner.nextInt());
                        break;
                    case "g":
                        System.out.println(arrayQueue.getQueue());
                        break;
                    case "h":
                        System.out.println(arrayQueue.headQueue());
                        break;
                    case "e":
                        scanner.close();
                        System.out.println("程序退出");
                        flag = false;
                        break;
                    default:
                        System.out.println("输入有误，请重新输入");
                        break;
                }
        }
    }
}

class ArrayQueue implements IsEmpty{
    private final int maxSize; //数组的最大容量
    private int front; //队列头
    private int rear; //队列尾
    private final int[] arr; //模拟队列

    public ArrayQueue(int arrMaxSize){
        try {
            maxSize = arrMaxSize;
            arr = new int[maxSize];
            front = -1; //指向队列头的前一个位置
            rear = -1; //指向队列尾
        }catch (Exception e){
            throw new RuntimeException("数组最大容量设置有误");//防止创建队列时出现异常
        }
    }
    //判断队列是否满
    public boolean isFull(){
        return rear == maxSize - 1;
    }
    //判断队列是否为空
    @Override
    public boolean isEmpty(){
        return rear == front;
    }
    //为空时返回异常
    public void isEmptyException(){
        if (isEmpty()){
            throw new RuntimeException("队列为空");
        }
    }
    //添加数据到队列
    public void addQueue(int n){
        //判断队列是否满
        if (isFull()){
            System.out.println("队列已满");
            return;
        }
        arr[++rear] = n;
    }
    //获取队列的数据，出队列
    public int getQueue(){
        this.isEmptyException();
        return arr[++front];
    }
    //显示队列所有数据
    public void showQueue(){
        if (isEmpty()) {
            System.out.println("队列为空");
        }
        System.out.println(Arrays.toString(arr));
    }
    //显示队列的头数据，不取出
    public int headQueue(){
        this.isEmptyException();
        return arr[front+1];
    }
}
