import java.util.Scanner;

public class B_Sum_of_Medians {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] a = new int[n*k];
            for (int i = 0; i < n*k; i++) {
                a[i] = sc.nextInt();
               
            }
           int i = n*k;
           long sum = 0;
           while (k-->0) {
                i -= (n/2 + 1);
                sum += a[i];
           }
            System.out.println(sum);
        }
    }
}