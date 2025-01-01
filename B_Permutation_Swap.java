import java.util.Scanner;

public class B_Permutation_Swap {
     public static int gcd(int a , int b){
        if(b==0) return a ;
        return gcd(b , a%b);
     }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            int[] a = new int[n+1];
            for (int i = 1; i <=n; i++) {
                a[i] = sc.nextInt();
            }
            int s =0;
            for(int i=1 ;i<=n ; i++){
                s = gcd(s, Math.abs(a[i]-i));
            }
           System.out.println(s);
        }
    }
}