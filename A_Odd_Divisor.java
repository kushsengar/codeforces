import java.util.Scanner;

public class A_Odd_Divisor{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            long n = sc.nextLong();
            if ((n&1)==1) {
                System.out.println("YES");
            }else{
                if ((n&(n-1))==0) {
                    System.out.println("NO");
                }else{
                    System.out.println("YES");
                }
            }
        }
    }
}