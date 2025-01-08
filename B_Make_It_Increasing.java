import java.util.Scanner;

public class B_Make_It_Increasing {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            int count = 0;
            boolean possible = true;
            for (int i = n - 1; i > 0; i--) {
                if (a[i] == 0) {
                   possible = false;
                 System.out.println(-1);
                    break;
                }
                while (a[i - 1] >= a[i] && a[i - 1] > 0) {
                    a[i - 1] /= 2;
                    count++;
                }
            }
            if (possible) {
                System.out.println(count);
            }
        }
    }
}
