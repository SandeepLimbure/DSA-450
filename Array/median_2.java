package Array_450;

import java.util.Arrays;

public class median_2 {
    public static void main(String[] args) {
       int []arr1 =  {-5, 3, 6, 12, 15};
       int []arr2 =   {-12, -10, -6, -3, 4, 10};
       int res = median(arr1,arr2);
        System.out.println(res);
    }
    public static int median(int []arr1,int []arr2){
        int []arr3 = sort(arr1,arr2);
        int n = arr3.length;
        Arrays.sort(arr3);
        if(n%2!=0){
            return (arr3[n/2]);
        }else{
            return ((arr3[n/2]+arr3[n/2-1])/2);
        }
    }
    public static int[] sort(int []arr1,int []arr2){
        int []arr3 = new int[arr1.length+arr2.length];
        System.arraycopy(arr1,0,arr3,0,arr1.length);
        System.arraycopy(arr2,0,arr3,arr1.length,arr2.length);
        Arrays.sort(arr3);
        return arr3;
    }
}
