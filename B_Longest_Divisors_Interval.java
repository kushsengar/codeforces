import java.util.*;
public class B_Longest_Divisors_Interval{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
             for (int i =1;  ;i++) {
                    if (n % i != 0) {
                        System.out.println(i-1);
                        break;
                    }
                }  }
    }
}