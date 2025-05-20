package ly.exceptionTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

public class ExceptionDemo01 {
    public static void main(String[] args) throws Exception{
        //Error错误演示：栈溢出 ---> StackOverflowError
//        method();
        //索引溢出 ---> ArrayIndexOutOfBoundsException
//        int [] arr = new int[3];
//        System.out.println(arr[4]);
        /*
        编译时期异常错误
        编译时期异常并不是代码写错了，而是底层给我们抛出了一个异常
         */

        /*
        异常的两种抛出方式：throws try...catch
        throws是层层往上抛出异常，直到程序终止
        try...catch是捕获异常，自己处理异常，自己处理完之后，继续往下执行
         */
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY-MM-dd HH-mm:ss");
        String date = "2025-05-08 15-16-32";
        Date parse = null;
        try {
            parse = simpleDateFormat.parse(date);
        } catch (ParseException e) {
            System.out.println("异常");
        }finally {
            System.out.println("我执行了");
        }
        System.out.println(parse);//一定会执行先于catch，如果在方法之间调用
    }
//    public static void method()
//    {
//        method();
//    }
}
