import java.util.Scanner;

public class B_Not_Dividing {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i =0;i<n ;i++){
                a[i] = sc.nextInt();
                if (a[i]==1) {
                    a[i]++;
                   }
            }
            for(int i =0;i<n-1;i++){
               
               if (a[i+1] % a[i]==0) {
                   a[i+1]++;
               }
            }
            for(int i=0;i<n;i++){
                System.out.print(a[i]+" ");
            }System.out.println();
        }
    }
}