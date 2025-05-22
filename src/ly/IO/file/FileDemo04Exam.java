package ly.IO.file;

import java.io.File;

public class FileDemo04Exam {
    public static void main(String[] args) {
        //创建文件夹

        method(new File("D:\\java数据结构与算法\\codeDate\\DataStructures\\src\\ly\\IO\\ImgFile"));
    }

    private static void method(File file) {
        //查询文件夹下所有的.jpg文件,如果是文件就打印出来,如果是文件夹就继续查询
        File[] files = file.listFiles();
        for (File file1 : files) {
            if (file1.isFile()){
                String name = file1.getName();
                if (name.endsWith(".jpg")) {
                    System.out.println("file1 = " + file1.getName());
                }
            }else {
                method(file1);
            }
        }
    }

}
