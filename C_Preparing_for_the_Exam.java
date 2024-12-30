import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class C_Preparing_for_the_Exam {

   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt(), m = sc.nextInt(), k = sc.nextInt();
            int[] q = new int[m];
            for (int i = 0; i < m; i++) {
                q[i] = sc.nextInt();
            }
            char[] r = new char[m];
            Arrays.fill(r, '0');
            Set<Integer> hs = new HashSet<>();
            for (int i = 0; i < k; i++) {
                hs.add(sc.nextInt());
            }
            if (k==n) {
                Arrays.fill(r,'1');
            } else if (k==n-1) {
                int mQ=0;
                for (int i=1; i <= n; i++) {
                    if (!hs.contains(i)) {
                        mQ = i;
                        break;
                    }
                }
                for (int i=0;i<m;i++) {
                    if (q[i]==mQ) {
                        r[i] = '1';
                    }
                }
            }System.out.println(new String(r));
        }
    }
}