import java.util.Scanner;

public class A_Line_Trip {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            int last =0;
            int ans = Integer.MIN_VALUE;
            for (int i = 0; i < arr.length; i++) {
                ans = Math.max(ans, arr[i]-last);
                last = arr[i];
            }
            ans = Math.max(2*(x-last), ans);
            System.out.println(ans);
        }
    }
    
}