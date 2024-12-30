import java.util.Arrays;
import java.util.Scanner;

public class D_Counting_Pairs {

   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); 
        
        while (t-- > 0) {
            int n = scanner.nextInt();
            long x = scanner.nextLong();
            long y = scanner.nextLong();
            long[] a = new long[n];
            long sum = 0;
            
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextLong();
                sum += a[i];
            }
            
            long L = sum - y; 
            long R = sum - x;
            
            Arrays.sort(a); 
            
            long count = 0;
            for (int i = 0; i < n; i++) {
                long target = L - a[i];
                int low = binLow(a, target, i + 1, n);
                
                target = R - a[i];
                int high = binHigh(a, target, i + 1, n);
                count += (high - low);
            }
            
            System.out.println(count);
        }
    }

    private static int binLow(long[] a, long target, int start, int end) {
        while (start < end) {
            int mid = (start + end) / 2;
            if (a[mid] < target) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }
    private static int binHigh(long[] a, long target, int start, int end) {
        while (start < end) {
            int mid = (start + end) / 2;
            if (a[mid] <= target) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }
}