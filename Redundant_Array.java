import java.util.*;
public class Redundant_Array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int a = sc.nextInt();
            
            long ans = Long.MAX_VALUE;
            int[] v = new int[a];
            Map<Integer, Integer> mp = new HashMap<>();
            
            for (int i = 0; i < a; i++) {
                v[i] = sc.nextInt();
                mp.put(v[i], mp.getOrDefault(v[i], 0) + 1);
            }
            
            for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
                int r = a - entry.getValue();
                int l = entry.getKey();
                l *= r;
                ans = Math.min(ans, l);
            }
            
            ans = Math.min(ans, a);
            System.out.println(ans);
        }
        
        sc.close();
    }
}
