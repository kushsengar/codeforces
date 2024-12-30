import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.*;

public class MinimumVariance {

    public static int findMinimumVariance(int[] height) {
        int n = height.length;
        int minVariance = Integer.MAX_VALUE;
        HashMap<Integer, Integer> lastIndex = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int currentHeight = height[i];
            if (lastIndex.containsKey(currentHeight)) {
                int startIndex = lastIndex.get(currentHeight);
                int groupSize = i - startIndex + 1;
                int occurrences = 0;
                for (int j = startIndex; j <= i; j++) {
                    if (height[j] == currentHeight) {
                        occurrences++;
                    }
                }
                int variance = groupSize - occurrences;
                minVariance = Math.min(minVariance, variance);
            }
            lastIndex.put(currentHeight, i);
        }

        return minVariance;
    }
    public static int binS(int[][] items , int price ){
        int kush = 0 ;
        int low =0;
        int high = items.length - 1;
        while (low<=high) {
            int mid = low + (high-low)/2;
            if (items[mid][0]<= price) {
                kush = Math.max(kush , items[mid][0]);
                low = mid + 1;
            }else {
                high = mid - 1;
            }
        }
     return kush ;
    }
    public static int findNext(int n){
        return ((n+9)/10)*10;
    }
    public static int smallestNumber(int n, int t) {
        String ns = String.valueOf(n);
        int prod = 1;
        for(int i=0;i<ns.length();i++){
            prod = prod * (ns.charAt(i)-'0');
        }
        return prod % t == 0 ? n : Math.min((t- (prod % t)), findNext(n));
        
    }
    public static int[] maximumBeauty(int[][] items, int[] queries) {
       int n = items.length;
       Arrays.sort(items , Comparator.comparingInt(a -> a[0]));
       for(int i=1;i<n;i++){
        items[i][1] = Math.max(items[i-1][1] , items[i][1]);
       }
       int[] ans = new int[queries.length];
       for(int i=0;i<queries.length;i++){
        int khushi = binS(items , queries[i]);
        ans[i] = khushi;
       }
       return ans;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] height = new int[n];
        for (int i = 0; i < n; i++) {
            height[i] = sc.nextInt();
        }
        int result = findMinimumVariance(height);
        System.out.println(result);
    }
}
