/**
 * E_Base_Converssion
 */
import java.util.*;
public class E_Base_Converssion {
  public static void BaseConv(int n){
    if (n/2==0) {
        System.out.print(n);
        return;
    }
    BaseConv(n/2);
    System.out.print(n%2);
  }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int t = sc.nextInt();
         while (t-->0) {
            int n = sc.nextInt();
              BaseConv(n);
              System.out.println();
         }
    }
}