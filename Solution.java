import java.util.PriorityQueue;

public class Solution {
    public static int[] getFinalState(int[] nums, int k, int multiplier) {
        int MOD = 1000000007;
        
        // Priority queue to track the minimum elements
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> Integer.compare(a[0], b[0]));
        
        // Initialize the priority queue with the array elements
        for (int i = 0; i < nums.length; i++) {
            pq.offer(new int[]{nums[i], i});
        }
        
        // Perform k operations
        while (k > 0) {
            // Get the minimum element
            int[] minPair = pq.poll();
            int minValue = minPair[0];
            int index = minPair[1];
            
            // Multiply the minimum value by the multiplier
            nums[index] = (int) ((long) minValue * multiplier % MOD);
            
            // Put the updated value back in the priority queue
            pq.offer(new int[]{nums[index], index});
            
            k--;
        }
        
        return nums;
    }
public static void main(String[] args) {
    int [] nums = {2,1,3,5,6};
    getFinalState(nums , 5 , 2);
    for(int i:nums){
        System.out.print(i+" ");
    }
}}