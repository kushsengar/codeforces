import java.util.Scanner;

public class Distribute_Cookies {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            int m= sc.nextInt();
            int r = m%n;
            if (n>m) {
                System.out.println(n-m);
            }else{System.out.println(Math.min(n-r,r));
            }
            
        }
    }
}