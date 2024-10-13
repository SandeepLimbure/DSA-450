package Array_450;

import java.util.PriorityQueue;

public class KthSmallest {
    public static int kthSmallest(int[] arr, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int i =0;i<arr.length;i++){
            minHeap.add(arr[i]);
        }
        for(int i =1;i<k;i++){
            minHeap.poll();
        }
        return minHeap.peek();
    }
}
