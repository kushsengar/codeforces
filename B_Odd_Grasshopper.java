import java.util.Scanner;

public class B_Odd_Grasshopper {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long x = sc.nextLong();
            long n = sc.nextLong();
            int rem = (int)(n % 4);

            if (rem == 0) {
                System.out.println(x);
            } else if (rem == 1) {
                System.out.println(x % 2 == 0 ? x - n : x + n);
            } else if (rem == 2) {
                System.out.println(x % 2 == 0 ? x + 1 : x - 1);
            } else { // rem == 3
                long i = n-2;
                while (i<=n) {
                    if (x%2==0) {
                        x-=i;
                    }else{
                        x+=i;
                    }
                    i++;
                }
                System.out.println(x);
        }

    }
}
}
