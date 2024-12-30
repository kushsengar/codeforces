import java.util.*;
public class A_Extremely_Round {
     public static int rounder(int n){
        // int result = 0;
        // if (n<10) {
        //     return n ;
        // }else if(n>=10 && n < 100){
        //      return 9 + n/10;
        // }else if(n>=100 && n<1000){
        //     return 9 + 9 + n/100;
        // }else if (n>=1000 && n<10000) {
        //     return 9 + 9 + 9 + n/1000;
        // }else if (n>=10000 && n< 100000) {
        //     return 4*9 + n/10000;
        // }
        // return 5*9 + n/100000;
        //or // alternate method short and sweet & I Love You Sweetie\~~/
        int len = String.valueOf(n).length();
        return (len - 1) * 9 + n / (int) Math.pow(10, len - 1);
     }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
           int n = sc.nextInt();
          System.out.println(rounder(n));
        }
    }
}