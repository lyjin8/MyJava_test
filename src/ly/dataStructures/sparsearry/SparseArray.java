package ly.dataStructures.sparsearry;

public class SparseArray {
    public static void main(String[] args) {
        //创建一个11*11的二维数组
        //0：空棋子 1：黑子 2：蓝子
        int [][] chessArray1 = new int [11][11];
        //放子
        chessArray1[1][2] = 1;
        chessArray1[2][3] = 2;
        //打印原二维棋盘，用foreach
        for (int[]row : chessArray1){
            for (int item : row){
                System.out.printf("%d\t", item);
            }
            //控制换行
            System.out.println();
        }
        StreamIOController streamIOController = new StreamIOController();


        //将二维数组转换成稀疏数组
        //1.遍历数组，先查找非零值的个数 sum
        int sum = 0;
        for (int[] row : chessArray1) {
            for (int item : row) {
                if (item != 0) {
                    sum++;
                }
            }
        }
        //2.创建对于的稀疏数组
        int[][] sparseArray = new int[sum+1][3];
        //给稀疏数组赋值
        sparseArray[0][0] = 11;
        sparseArray[0][1] = 11;
        sparseArray[0][2] = sum;

        //遍历二维数组将非零数据放到sparseArray中
        int count = 0; //用来记录是第几个非零数据
        for (int i = 0; i < chessArray1.length; i++) {
            for (int j = 0; j < chessArray1[i].length; j++) {
                if (chessArray1[i][j] != 0) {
                    count++;
                    sparseArray[count][0] = i; //非零值所在行
                    sparseArray[count][1] = j; //非零值所在列
                    sparseArray[count][2] = chessArray1[i][j];//非零数据的值
                }
            }
        }
        System.out.println();
        System.out.println("转化后的稀疏数组为：\n");
        for (int[] row : sparseArray) {
            System.out.printf("%d\t%d\t%d\t\n", row[0], row[1], row[2]);
        }
        streamIOController.saveSparseArrayToFile(sparseArray,"map.data");
        System.out.println("\n文件已存储到文件中");
        int[][] readSparseArray = streamIOController.loadSparseArrayFromFile("map.data");
        System.out.println("\n从文件中读取的稀疏数组");
        for (int[] row : readSparseArray) {
            System.out.printf("%d\t%d\t%d\t\n", row[0], row[1], row[2]);
        }

        //将稀疏数组转换成二维数组
        //1.先读取稀疏数组的第一行，根据第一行来创建二维数组
        int[][] chessArray2 = new int[readSparseArray[0][0]][readSparseArray[0][1]];
        //2.从稀疏数组的第二行开始读取，并赋值给二维数组
        for (int i = 1; i <readSparseArray.length ; i++) {
            chessArray2[readSparseArray[i][0]][readSparseArray[i][1]] = readSparseArray[i][2];
        }
        System.out.println();
        System.out.println("恢复后的二维数组:");
        for (int[] row : chessArray2) {
            for (int item : row) {
                System.out.printf("%d\t", item);
            }
            System.out.println();
        }
        
    }
}
