/**
 * A_Primary_Task
 */
import java.util.*;
public class A_Primary_Task {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int a = sc.nextInt();
            if (a>=1 && a<=100) {
                System.out.println("NO");
            }
            else if (a>101 && a<110) {
                if (a%10>=2) {
                    System.out.println("YES");
                }
            }
           else if (a>=1010 && a <1100) {
                if (a%100>=2) {
                    System.out.println("YES");
                }
            }
           else{
            System.out.println("NO");
           }
        }
    }
}