import java.util.Scanner;

public class A_Preparing_for_the_Olympiad {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            for (int i = 0; i < n; i++) {
                b[i] = sc.nextInt();
            }
            int sum = 0;
            for(int i=0;i<n-1;i++){
                if(a[i]>b[i+1]){
                   sum += a[i] - b[i+1];
                }
            }
            sum+= a[n-1];
            System.out.println(sum);
        }
    }
}