import java.util.Scanner;

public class A_Strange_Partition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Number of test cases

        while (t-- > 0) {
            int n = sc.nextInt(); // Size of the array
            int x = sc.nextInt(); // Divider value
            int[] a = new int[n];

            long totalSum = 0; // Sum of all elements in the array
            long maxBeauty = 0; // Maximum beauty

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                totalSum += a[i];
                maxBeauty += Math.ceilDiv(a[i], x); // Add ceil(a[i]/x) for each element
            }

            long minBeauty = Math.ceilDiv(totalSum, x); // Merge all elements and take ceil(sum/x)

            System.out.println(minBeauty + " " + maxBeauty);
        }
    }
}
