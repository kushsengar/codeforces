import java.util.Scanner;

public class Sum_of_N {
   
     public static int f(long x) {
            for (long i = (long) Math.sqrt(x); i > 1; i--) {
                if (x % i == 0) {
                    return (int) (x / i);
                }
            }
            return 1;
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        long[] results = new long[T];

        for (int t = 0; t < T; t++) {
            int K = sc.nextInt();
            long sum = 0;

            // We start from m = 2 because m = 1 makes N = K which doesn't satisfy f(N) = K
            for (int m = 2; m * K <= 1_000_000_000; m++) {
                if (f(m * K) == K) {
                    sum += m * K;
                }
            }

            results[t] = sum;
        }

        for (long res : results) {
            System.out.println(res);
        }

    }
}