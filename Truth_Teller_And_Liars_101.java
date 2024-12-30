/**
 * Truth_Teller_And_Liars_101
 */
import java.util.*;
public class Truth_Teller_And_Liars_101 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            boolean flag = false;
            int i=m+1;
            while(i<=n+m){
                if(i>2*m){
                    System.out.println(i);
                    flag = true;
                    break;
                     }
                     i++;
                     
               }
            if (!flag) {
               System.out.println(-1); 
            }
        }
    }
}