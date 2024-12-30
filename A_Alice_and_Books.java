import java.util.Arrays;
import java.util.Scanner;

public class A_Alice_and_Books {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int t = sc.nextInt();
         while (t-->0) {
           int n = sc.nextInt();
           int[] arr = new int[n];
           for (int i = 0; i < arr.length; i++) {
              arr[i] = sc.nextInt();
           } 
           int max = Integer.MIN_VALUE;
           for(int i=0;i<n-1;i++){
              max = Math.max(max , arr[i]);
           }
           System.out.println(max + arr[n-1]);
         }
    }
}