package Array_450;

import java.util.HashSet;

public class UnionOf2Arrays {
    public static int doUnion(int arr1[], int arr2[]) {
        HashSet<Integer> res = new HashSet<>();
        for(int i =0;i<arr1.length;i++){
            res.add(arr1[i]);
        }
        for(int i =0;i<arr2.length;i++){
            res.add(arr2[i]);
        }
        return res.size();
    }
}
