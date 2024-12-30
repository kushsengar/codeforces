import java.util.Scanner;

public class C_Print_from_N_to_1 {

    public static void PrintNto1(int n){
    if(n==0 || n==1){
      System.out.println(n);
        return ;
    }
    System.out.print(n+" ");
    PrintNto1(n-1);
    
  }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       PrintNto1(n);
}
}