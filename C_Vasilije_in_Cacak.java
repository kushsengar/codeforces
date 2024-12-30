import java.util.*;
public class C_Vasilije_in_Cacak {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong(); // Total numbers
            long k = sc.nextLong(); // Numbers to sum
            long x = sc.nextLong(); // Target sum

            if (k > n) {
                System.out.println("NO");
                continue;
            }

            long minSum = (k * (k + 1)) / 2; // Sum of first k numbers
            long maxSum = (n * (n + 1)) / 2 - ((n - k) * (n - k + 1)) / 2; // Sum of last k numbers

            if (x >= minSum && x <= maxSum) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
