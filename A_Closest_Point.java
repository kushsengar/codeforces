import java.util.Arrays;
import java.util.Scanner;

/**
 * A_Closest_Point
 */
public class A_Closest_Point {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] points = new int[n];
            for (int i = 0; i < n; i++) {
                points[i] = sc.nextInt();
            }

            // Sort the array to check adjacent differences
            Arrays.sort(points);

            boolean flag = true;
            for (int i = 0; i < n - 1; i++) {
                // Check if any two consecutive points have a difference of 1
                if (points[i + 1] - points[i] == 1) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}