package ly.IO.file;

import java.io.File;

public class FileDemo01 {
    public static void main(String[] args) {
        file01();
    }

    private static void file01() {
        //static String pathSeparator:与系统有关的路径分隔符，为了方便，它被表示为一个字符串。
        System.out.println(File.pathSeparator);
        //static String separator:与系统有关的默认名称分隔符，为了方便，它被表示为一个字符串。
        System.out.println(File.separator);

        String path01 = "D:\\Idea\\IO";
        System.out.println("path01 = " + path01);

        String path02 = "D:"+File.separator+"Idea"+File.separator+"IO";
        System.out.println("path02 = " + path02);
    }
}
