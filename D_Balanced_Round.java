import java.util.Arrays;
import java.util.Scanner;

public class D_Balanced_Round {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int [] a = new int[n];
            for(int i =0 ;i < n ;i++){
                a[i] = sc.nextInt();
            }
            Arrays.sort(a);
            int count = 0;
            int max = Integer.MIN_VALUE;
            if (n==1) {
                System.out.println(0);
                continue;
            }
            for(int i=0;i<n-1;i++){
                if (a[i+1]-a[i]<=k) {
                    count++;
                }else{
                    count = 0;
                }
                max = Math.max(max, count);
            }
            System.out.println((n-1)-max);
        }
    }
}