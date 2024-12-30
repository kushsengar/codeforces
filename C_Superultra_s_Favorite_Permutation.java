import java.util.*;

public class C_Superultra_s_Favorite_Permutation {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
         if (n%2!=0) {
                System.out.println(-1);
            } else {
                List<Integer> odd = new ArrayList<>();
                List<Integer> even = new ArrayList<>();
             for (int i = 1; i <= n; i++) {
                    if (i % 2 == 1) {
                        odd.add(i);
                    } else {
                        even.add(i);
                    }
                }
                if (odd.contains(5)) {
                    odd.remove(Integer.valueOf(5));
                    odd.add(5);
                }
                if (even.contains(4)) {
                    even.remove(Integer.valueOf(4));
                    even.add(0, 4);
                }
                odd.addAll(even);
                for (int num : odd) {
                    System.out.print(num + " ");
                }
                System.out.println();
            }
        }
    }
}
