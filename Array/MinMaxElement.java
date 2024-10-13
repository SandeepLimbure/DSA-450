package Array_450;

public class MinMaxElement {
    public static int min(int []arr){
        int min = 0;
        for(int i = 1;i< arr.length;i++){
            min = Math.min(arr[i-1],arr[i]);
        }
        return min;
    }
    public static int max(int []arr){
        int max = 0;
        for(int i = 1;i< arr.length;i++){
            max = Math.max(arr[i-1],arr[i]);
        }
        return max;
    }

    public static void main(String[] args) {
        int []arr = {3,5,4,1,9};
        int min = min(arr);
        int max = max(arr);
        System.out.println("the min element :- "+min);
        System.out.println("the max element :- "+max);
    }
}
