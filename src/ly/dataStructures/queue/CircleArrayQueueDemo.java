package ly.dataStructures.queue;

import java.util.Scanner;
import java.util.stream.Stream;

/**
 * 环形队列
 */
public class CircleArrayQueueDemo {
    public static void main(String[] args) {
        CircleArray arrayQueue = new CircleArray(5);
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
class CircleArray implements IsEmpty{
    private int maxSize; //数组的最大容量
    //指向数组的第一个元素，初始为0
    private int front; //队列头
    //指向队列的最后一个元素的下一个位置，初始为0
    private int rear; //队列尾
    private int[] arr; //模拟队列
    public CircleArray(int arrMaxSize) {
        maxSize = arrMaxSize;
        arr = new int[maxSize];
    }

    //判断队列是否为空
    @Override
    public boolean isEmpty() {
        return rear==front;
    }
    //判断队列是否已满
    public boolean isFull() {
        return (rear+1)%maxSize==front;
    }
    //添加数据到队列
    public void addQueue(int n){
        if (isFull()){
            System.out.println("队列已满");
        }
        arr[rear] = n;
        /*
        环形队列，当rear取到数组的最后一位时，
        此时((maxSize-1)+1)%maxSize=0,就巧妙的将首位联系起来了，
        此时的rear的值为0,如果未出队列，
        那么front=0，此时再想添加队列的时候，会进行isFull判断
         */
        rear = (rear+1)%maxSize;
    }
    //获取队列的数据，出队列
    public int getQueue(){
        if (isEmpty()){
            throw new RuntimeException("队列为空");
        }
        int temp = arr[front];//临时变量,取出数据
        /*
        队列头后移，不能直接front++会出现超出数组异常，这里进行环形操作，
        当front取到数组的最后一位时，
        此时((maxSize-1)+1)%maxSize=0,就巧妙的将首位联系起来了，
        此时front的值为0,如果未出队列，
        那么rear=0，此时再想添加队列的时候，会进行isFull判断
         */
        front = (front+1)%maxSize;
        return temp;
    }
    //显示队列的所有数据
    public void showQueue(){
        if (isEmpty()){
            System.out.println("队列为空");
        }
        //从front开始遍历，遍历多少个元素，就输出多少个元素
        for (int i = front; i < front+size(); i++)
        {
            System.out.printf("arr[%d]=%d\n",i%maxSize,arr[i%maxSize]);
        }
    }
    //获取队列有效数据的个数
    private int size() {
        return (rear + maxSize - front)%maxSize;
    }
    //显示队列的头数据，注意不是取出数据
    public int headQueue(){
        if (isEmpty()){
            throw new RuntimeException("队列为空");
        }
        return arr[front];
    }
}
