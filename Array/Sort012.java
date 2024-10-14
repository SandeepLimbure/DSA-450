package Array_450;

public class Sort012 {
    public void sort012(int[] arr) {
        int left = 0;
        int mid = 0;
        int right = arr.length-1;
        while(mid<=right){
            if(arr[mid]==0){
                swap(arr,left,mid);
                left++;
                mid++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else{
                swap(arr,mid,right);
                right--;
            }
        }
    }
    public void swap(int []arr,int left,int right){
        int temp = arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
    }
}
