package ly.sparsearry;

public class ArryDemo05 {

    //二分查找
    public static int Binary(int[] arr ,int data)
    {
        int min = 0;
        int max = arr.length - 1;
        int mid = 0;
        while (min <= max)
        {
            mid = (min + max) / 2;
            if (data>arr[mid]){
                min = mid + 1;
            } else if (data<arr[mid]) {
                max = mid -1;
            }else {
                return mid;
            }
        }
        return -1;
    }

    //数组倒装
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9};
        for (int min = 0 ,max = a.length-1;min <= max;min++,max--)
        {
            int temp = a[min];
            a[min] = a[max];
            a[max] = temp;
        }
        for (int i : a)
        {
            System.out.printf("%d\t",i);
        }
        //冒泡排序
        for (int j = 0; j < a.length-1; j++) {
            for (int i =1;i<a.length;i++)
            {
                if (a[i-1]>a[i])
                {
                    int temp = a[i-1];
                    a[i-1] = a[i];
                    a[i] = temp;
                }
            }

        }
        System.out.println();
        for (int i : a)
        {
            System.out.printf("%d\t",i);
        }
        System.out.println();
        System.out.println(Binary(a, 7));
    }
}
