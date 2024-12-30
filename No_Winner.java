import java.util.Scanner;

/**
 * No_Winner
 */
public class No_Winner {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int m = sc.nextInt();
            if (a == b || b == c || a==c) {
                System.out.println("YES");
                continue;
             }
            if (Math.abs(b-a)<=m || Math.abs(c-b)<=m || Math.abs(c-a)<=m) {
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
    }
}
}