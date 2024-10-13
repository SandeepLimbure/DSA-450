package Array_450;

import java.util.Arrays;

public class NegativeElements {
    public static void main(String[] args) {
        int []arr = {-1,2,-3,4,5,6,-7,8,9};
        move2(arr);
        print(arr);
        int []arr1 = move1(arr);
        print(arr1);

    }
    public static int[] move1(int []arr){
        Arrays.sort(arr);
        return arr;
    }
    public static void move2(int []arr){
        int j = 0,temp;
        for(int i = 0;i<arr.length;i++){
             if(arr[i]<0){
                 if(i!=j){
                     temp = arr[i];
                     arr[i]=arr[j];
                     arr[j]=temp;
                 }
                 j++;
             }

        }
    }
    public static void print(int []arr){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
