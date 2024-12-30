import java.util.Arrays;
import java.util.Scanner;

/**
 * Make_Permutation
 */
public class Make_Permutation {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

       
        int t = sc.nextInt();

        for (int ti = 0; ti < t; ti++) {
            
            int n = sc.nextInt();

           
            int[] A1 = new int[n];
            for (int i = 0; i < n; i++) {
                A1[i] = sc.nextInt();
            }
        
            System.out.println(isPoss(A1) ? "NO" : "YES");
           
            
        }

       
 }
 public static boolean isPoss(int[] arr){
    Arrays.sort(arr);

            boolean flag = false;

            
            for (int i = 1; i <= arr.length; i++) {
                if (arr[i - 1] > i) {
                    flag = true;
                    break;
                }
            }
             return flag;
 }
     
    }
