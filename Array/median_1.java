package Array_450;

import java.util.Arrays;

public class median_1 {
    public static void main(String[] args) {
        int [] v = {90,100,78,89,67};
        System.out.println(median(v));
    }
    public static int median(int []v){
        int n = v.length;
        Arrays.sort(v);
        if(n%2!=0){
            return (int) Math.floor(v[n/2]);
        }else{
            return (int)Math.floor((v[n/2]+v[n/2-1])/2);
        }
    }
}
