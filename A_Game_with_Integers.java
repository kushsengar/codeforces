import java.util.Scanner;

/**
 * A_Game_with_Integers
 */
public class A_Game_with_Integers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            // if ((n+1)%3==0 || (n-1)%3==0) {
            //     System.out.println("First");
            // }else{
            //     System.out.println("Second");
            // }
            if (n%3==0) {
                System.out.println("Second");
            }else{
                System.out.println("First");
            }
        }
    }
}