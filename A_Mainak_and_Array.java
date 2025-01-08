import java.util.Arrays;
import java.util.Scanner;

public class A_Mainak_and_Array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i =0;i<n;i++){
                a[i] = sc.nextInt();
            }
           int max = 0;
           for(int i=0;i<n-1;i++){
             max = Math.max(max, a[i+1]-a[0]);
           }
           for(int i=0;i<n-1;i++){
            max = Math.max(max, a[n-1]-a[i]);
           }
           for(int i =0;i<n-1;i++){
            max = Math.max(max, a[i]-a[i+1]);
           }
           System.out.println(max);
        }
    }
}