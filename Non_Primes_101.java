/**
 * Non_Primes_101
 */
import java.util.*;
public class Non_Primes_101 {
    public static boolean[] sieveOfEratosthenes(int limit) {
        boolean[] isPrime = new boolean[limit + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;

        for (int p = 2; p * p <= limit; p++) {
            if (isPrime[p]) {
                for (int i = p * p; i <= limit; i += p) {
                    isPrime[i] = false;
                }
            }
        }
        return isPrime;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        
        int maxLimit = 2 * 1000000; 
        boolean[] isPrime = sieveOfEratosthenes(maxLimit);

        for (int t = 0; t < T; t++) {
            int N = scanner.nextInt();
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = scanner.nextInt();
            }

            boolean found = false;
            for (int i = N - 1; i >= 0; i--) {
                for (int j = i - 1; j >= 0; j--) {
                    int sum = A[i] + A[j];
                    if (!isPrime[sum]) {
                        System.out.println((i + 1) + " " + (j + 1));
                        found = true;
                        break;
                    }
                }
                if (found) {
                    break;
                }
            }

            if (!found) {
                System.out.println(-1);
            }
        }
    }
}