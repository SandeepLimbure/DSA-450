package Array_450;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Merge2SortedArray {
    public static void main(String[] args) {
        int []arr1 = {1,2,3,4,5};
        int []arr2 = {5,6,7,8,9};
        int []res = merge(arr1,arr2);
        System.out.println(Arrays.toString(res));
    }
    public static int[] merge(int []arr1, int []arr2){
        Set<Integer> res = new TreeSet<>();
        for(int i : arr1){
             res.add(i);
        }
        for(int j : arr2){
            res.add(j);
        }
        int[] resultArray = new int[res.size()];
        int index = 0;
        for (int num : res) {
            resultArray[index++] = num;
        }
        return resultArray;
    }
}
