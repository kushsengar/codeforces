import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class almostEqual {
      public static int countPairs(int[] nums) {
        String[] numbers = new String[nums.length];
        for(int i=0; i<nums.length ; i++){
            numbers[i] = String.valueOf(nums[i]);
        }
        int cnt = 0;
        for(int i=0 ; i<numbers.length ; i++){
            for(int j=i+1 ; j<numbers.length ; j++){
                if(swapPossible(numbers[i],numbers[j])) cnt++;
            }
        }
        return cnt;
    }

    public static boolean swapPossible(String s , String t){
        if (s.length() < t.length()) {
            s = "0".repeat(t.length() - s.length()) + s;
        } else if (t.length() < s.length()) {
            t = "0".repeat(s.length() - t.length()) + t;
        }
         List<Integer> differences = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != t.charAt(i)) {
                differences.add(i);
            }
        }
        if (differences.size() == 0) return true;
        else if (differences.size() == 2) {
            int i = differences.get(0), j = differences.get(1);
            return s.charAt(i) == t.charAt(j) && s.charAt(j) == t.charAt(i);
        } else return false;
    }
public static void main(String[] args) {
        int[] nums1 = {3, 12, 30, 17, 21};
        System.out.println(countPairs(nums1)); // Output: 2

        int[] nums2 = {1, 1, 1, 1, 1};
        System.out.println(countPairs(nums2)); // Output: 10

        int[] nums3 = {123, 231};
        System.out.println(countPairs(nums3)); // Output: 0
    }
}
