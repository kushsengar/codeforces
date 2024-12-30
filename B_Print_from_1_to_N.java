import java.util.Scanner;

public class B_Print_from_1_to_N {
  public static void Print1toN(int n){
    if(n==0 || n==1){
      System.out.println(n);
        return ;
    }
    Print1toN(n-1);
    System.out.println(n);
  }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       Print1toN(n);
}
}