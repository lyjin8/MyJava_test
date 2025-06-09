package ly.dataStructures.sparsearry;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * 用于控制IO的类
 */
public class StreamIOController {
    //将稀疏数组保存到文件中
    public void saveSparseArrayToFile(int[][] SparseArray, String fileName) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
            for (int[] row : SparseArray) {
                writer.write(row[0] + " "+ row[1] + " "+row[2]);
                writer.newLine();
            }
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    //将稀疏数组从文件中读取
    public int[][] loadSparseArrayFromFile(String fileName) {
        List<int[]> list = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line  = reader.readLine()) != null) {
                String[] split = line.split(" ");
                int[] row = new int[split.length];
                for (int i = 0; i < row.length; i++) {
                    row[i] = Integer.parseInt(split[i]);
                }
                list.add(row);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        // 将List转换为二维数组
        int[][] sparseArray = new int[list.size()][3];
        for (int i = 0; i < list.size(); i++) {
            sparseArray[i] = list.get(i);
        }
        return sparseArray;
    }
}
