import java.util.Scanner;

/**
 * A_Profitable_Interest_Rate
 */
public class A_Profitable_Interest_Rate {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a>=b) {
                System.out.println(a);
            }else if (a<b && 2*a>b) {
                System.out.println(2*a-b);
        }else{
            System.out.println(0);
        }
    }
}
}