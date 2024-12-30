import java.util.*;

public class B_Startup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] b = new int[k];
            int[] c = new int[k];
            for (int i = 0; i < k; i++) {
                b[i] = sc.nextInt();
                c[i] = sc.nextInt();
            }
            HashMap<Integer, Integer> brandSums = new HashMap<>();
            for (int i = 0; i < k; i++) {
                brandSums.put(b[i], brandSums.getOrDefault(b[i], 0) + c[i]);
            }
            List<Integer> totalCosts = new ArrayList<>(brandSums.values());
            totalCosts.sort(Collections.reverseOrder());
            int Sum = 0;
            for (int i = 0; i < Math.min(n, totalCosts.size()); i++) {
                Sum += totalCosts.get(i);
            }
            System.out.println(Sum);
        }
    }
}
