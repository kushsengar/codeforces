/**
 * F_Print_Even_Indices
 */
import java.util.*;
public class F_Print_Even_Indices {
  public static void PrintEven(int[] arr , int i){
    if (i==arr.length-1) {
        if (i%2==0) {
            System.out.print(arr[i]+" ");
        }
        return;
    }
    PrintEven(arr, i+1);
    if (i%2==0) {
    System.out.print(arr[i]+" ");
    }
    
  }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            PrintEven(arr, 0);
        
    }
}