package ly.IO.file;

import java.io.File;

public class FileDemo02 {
    public static void main(String[] args) {
        /*
        File(String parent, String child) 根据所填写的路径创建File对象
        parent:父路径
        child:子路径
         */
        System.out.println(
                new File("..\\ImgFile", "1.jpg"));
        /*
        File(File parent, String child)  根据所填写的路径创建File对象
        parent:父路径,是一个File对象
        child:子路径
         */
        File file = new File("..\\ImgFile");
        System.out.println(new File(file, "1.jpg"));
        /*
        File(String pathname)  根据所填写的路径创建File对象
        pathname:直接指定路径
         */
        System.out.println(new File("..\\ImgFile\\1.jpg"));
        //在创建File对象的时候，传递的路径可是是不存在的，但是传递不存在的路径无意义
    }
}
