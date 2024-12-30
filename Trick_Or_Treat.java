import java.util.*;

/**
 * Trick_Or_Treat
 */
public class Trick_Or_Treat {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
             int m = sc.nextInt();
             int[] a = new int[n];
             int[] b = new int[n];
             
             Map<Integer,Integer> m1 = new HashMap<>();
             Map<Integer,Integer> m2 = new HashMap<>();
             for(int i=0;i<n;i++){
                a[i] = sc.nextInt();
                m1.put(a[i], a[i]%m);
             }
             for(int i=0;i<n;i++){
                b[i] = sc.nextInt();
                m2.put(b[i], b[i]%m);
             }
             int ans = 0;
             for(int i=0;i<n;i++){
                if (m2.containsValue(a[i]%m)) {
                    ans++;
                }
             }
             System.out.println(ans);
        }
    }
}