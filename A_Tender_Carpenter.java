import java.util.Arrays;
import java.util.Scanner;

public class A_Tender_Carpenter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Number of test cases

        while (t-- > 0) {
            int n = scanner.nextInt(); // Length of the array
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }

            // Check if we can partition into two different ways
            if (canPartition(a, n)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        scanner.close();
    }

    private static boolean canPartition(int[] a, int n) {
        Arrays.sort(a);

        // Case 1: Check if we can split the array into two parts with the first part containing one element
        if (a[0] + a[1] > a[n - 1]) {
            return true;
        }

        // Case 2: Check if there are at least two distinct partitions
        for (int i = 1; i < n; i++) {
            if (a[i] != a[i - 1]) {
                return true;
            }
        }

        return false;
    }
}