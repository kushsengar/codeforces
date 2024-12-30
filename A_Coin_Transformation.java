import java.util.Scanner;

public class A_Coin_Transformation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
         long n = sc.nextLong();
         long count = 0;
        if (n<=3) {
            System.out.println(1);
            continue;
        }else{
            
            while (n > 3) {
                n /= 4; 
                count++; 
            }
        }
        System.out.println(1L << count);
            
         }
        
    }
}