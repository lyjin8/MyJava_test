package ly.IO.file;

import java.io.File;
import java.io.IOException;

public class FileDemo03 {
    public static void main(String[] args) {
        //String getAbsolutePath() -> 获取File的绝对路径->带盘符的路径
        System.out.println(new File("1.jpg").getAbsolutePath());
        //String getPath() ->获取的是封装路径->new File对象的时候写的啥路径,获取的就是啥路径
        System.out.println(new File("ImgFile\\1.jpg").getPath());
        //String getName()  -> 获取的是文件或者文件夹名称
        System.out.println(new File("ImgFile\\1.jpg").getName());
        //long length() -> 获取的是文件的长度 -> 文件的字节数
        System.out.println(new File("D:\\java数据结构与算法\\codeDate\\DataStructures\\src\\ly\\IO\\ImgFile\\1.jpg").length());

        /*
        boolean createNewFile()  -> 创建文件
        如果要创建的文件之前有,创建失败,返回false
        如果要创建的文件之前没有,创建成功,返回true

        boolean mkdirs() -> 创建文件夹(目录)既可以创建多级文件夹,还可以创建单级文件夹
        如果要创建的文件夹之前有,创建失败,返回false
        如果要创建的文件夹之前没有,创建成功,返回true
         */

        File file = new File("D:\\java数据结构与算法\\codeDate\\DataStructures\\src\\ly\\IO\\ImgFile\\1.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            System.out.println("创建文件成功");
        }

        File file1 = new File("D:\\java数据结构与算法\\codeDate\\DataStructures\\src\\ly\\IO\\ImgFile\\1\\2\\3");
        System.out.println(file1.mkdirs());

        /*
            boolean isDirectory() -> 判断是否为文件夹
            boolean isFile()  -> 判断是否为文件
            boolean exists()  -> 判断文件或者文件夹是否存在
         */
        System.out.println(file.isDirectory());
        System.out.println(file.isFile());
        System.out.println(file.exists());

        /*
        boolean delete()->删除文件或者文件夹

        注意:
          1.如果删除文件,不走回收站
          2.如果删除文件夹,必须是空文件夹,而且也不走回收站
         */
        if (file.exists()){
            System.out.println(file.delete());
        } else if (file1.exists()) {
            System.out.println(file1.delete());
        }

        /*
        String[] list() -> 遍历指定的文件夹,返回的是String数组
        File[] listFiles()-> 遍历指定的文件夹,返回的是File数组 ->这个推荐使用
        细节:listFiles方法底层还是list方法
             调用list方法,遍历文件夹,返回一个Stirng数组,遍历数组,将数组中的内容一个一个封装到File对象中,然后再将File对象放到File数组中
         */
        String[] list = new File("D:\\java数据结构与算法\\codeDate\\DataStructures\\src\\ly\\IO\\ImgFile").list();
        for (String s : list) {
            System.out.println("s = " + s);
        }
        File[] files = new File("D:\\java数据结构与算法\\codeDate\\DataStructures\\src\\ly\\IO\\ImgFile").listFiles();
        for (File file2 : files) {
            System.out.println("file2 = " + file2);
        }
    }
}
