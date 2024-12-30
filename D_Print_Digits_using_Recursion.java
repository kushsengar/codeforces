import java.util.*;
public class D_Print_Digits_using_Recursion {
  public static void PrintDigits(int n){
    if (n / 10 == 0) {
        System.out.print(n + " ");
        return;
      }
      PrintDigits(n / 10);
      System.out.print(n % 10 + " ");
  }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            PrintDigits(n);
            System.out.println();
        }
    }
}