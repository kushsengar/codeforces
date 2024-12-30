/**
 * Independence_Day_101
 */
import java.util.*;
public class Independence_Day_101 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int total = a+b+c;
        int max = a;
       if (b>max) {
        max = b;
       }
       if (c> max ) {
        max =c;
       }
       int min = a;
       if (b<min) {
        min = b;
    }
    if (c<min) {
       min =c; 
    }
    if (max> total-max+1) {
        System.out.println("NO");
    }else{
        System.out.println("YES");
    }
    }
}
}