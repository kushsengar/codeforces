import java.util.*;

public class Not_TooFarReplacement {

    public static int solveTestCase(int N, int[] A) {
        int last = A[N];
        List<int[]> swappable = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            if (A[i] <= 2 * last && A[i] > last) {
                swappable.add(new int[] { A[i], i });
            }
        }

        swappable.sort((a, b) -> Integer.compare(b[0], a[0]));

        for (int[] pair : swappable) {
            int idx = pair[1];
            int temp = A[idx];
            A[idx] = A[N];
            A[N] = temp;
            last = A[N];
        }

        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += A[i];
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();
            int[] A = new int[N + 1];
            for (int i = 0; i <= N; i++) {
                A[i] = sc.nextInt();
            }

            int result = solveTestCase(N, A);
            System.out.println(result);
        }

        sc.close();
    }
}
