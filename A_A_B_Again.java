import java.util.Scanner;

/**
 * A_A_B_Again
 */
public class A_A_B_Again {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            int o = n%10;
            int h = n/10;
            System.out.println(o+h);
        }
    }
}