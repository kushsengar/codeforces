import java.util.Scanner;

public class B_New_Bakery {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt(); 
        while (t-- > 0) {
            long n = scn.nextLong();
            long a = scn.nextLong();
            long b = scn.nextLong();
            long ans = -1;
            if (b<a) {
                ans = n*a;
                System.out.println(ans);
            }else{
          long x=Math.min(n, b - a);
          long y = n-x;
            long c=b-x;
            ans = y*a+(b*(b+1)/2)-(c*(c+1)/2);

                System.out.println(ans);
            }
            
        }
    }
}