import java.util.Scanner;

public class Yoga_Class {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--> 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
           
            System.out.println(maxE(n,x,y));
           
        }
    }
    public static int maxE(int N, int X, int Y) {
        int[] dp = new int[N + 1];
        if (N >= 1) dp[1] = X;
        if (N >= 2) dp[2] = Math.max(2 * X, Y);
         for (int i = 3; i <= N; i++) {
            dp[i] = Math.max(X + dp[i - 1], Y + dp[i - 2]);
        }
        return dp[N];

    }}