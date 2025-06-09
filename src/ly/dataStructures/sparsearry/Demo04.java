package ly.dataStructures.sparsearry;

public class Demo04 {
    //斐波那契数列
    public static int  method(int a){
        if (a<=2){
            return 1;
        }
        return method(a-1) + method(a-2);
    }

    public static void main(String[] args) {
        System.out.println(method(12));
    }
}
