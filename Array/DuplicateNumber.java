package Array_450;

import java.util.HashSet;

public class DuplicateNumber {
    public static int Duplicate(int []arr){
        HashSet<Integer> res = new HashSet<>();
        for(int num : arr){
            if(res.contains(num)){
                return num;
            }
            res.add(num);
        }
        return -1;
    }
}
