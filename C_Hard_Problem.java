import java.util.Scanner;

public class C_Hard_Problem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int m = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int ans = 0;
            int r1 = Math.min(m, a);
            int r2 = Math.min(m, b);

            int rr1 = m - r1 ;
            int rr2 = m - r2;
            ans = r1 + r2 + Math.min(c, rr1 + rr2);
            System.out.println(ans);
        }
    }
}