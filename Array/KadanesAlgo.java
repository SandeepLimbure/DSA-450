package Array_450;

public class KadanesAlgo {
    public static int max(int[]arr){
        int s = Integer.MIN_VALUE;
        int a = 0;
        for(int i = 0;i< arr.length;i++){
            a += arr[i];
            s = Math.max(s,a);
            if(a<0){
                a=0;
            }
        }
        return s;
    }
}
