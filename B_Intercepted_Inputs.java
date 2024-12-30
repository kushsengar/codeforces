import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class B_Intercepted_Inputs {
    public static boolean binarySearch(int[] a, int target) {
        int left = 0, right = a.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (a[mid] == target) {
                return true;
            }
            if (a[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
            while (t-->0) {
            int k =sc.nextInt();

            int[] a= new int[k];
            for (int i = 0; i < k; i++) {
                a[i] = sc.nextInt();
            }

            int s = k - 2;
            List<int[]> divisors = new ArrayList<>();

            for (int d = 1; d * d <= s; d++) {
                if (s % d == 0) {
                    divisors.add(new int[]{d, s / d});
                    if (d != s / d) divisors.add(new int[]{s / d, d});
                }
            }Arrays.sort(a);
            boolean found = false;
            for (int[] pair : divisors) {
                int n = pair[0];
                int m = pair[1];
                
                if (binarySearch(a, n) && binarySearch(a, m)) {
                    System.out.println(n + " " + m);
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("1 1");
            }
        }
        
    }
}