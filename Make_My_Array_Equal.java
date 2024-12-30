import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Make_My_Array_Equal {
     
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        while (t-- > 0) {
            HashMap<Integer, Integer> map = new HashMap<>();
            int n = sc.nextInt(); 
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            for (int num : arr) {
                if (num != 0) {
                    map.put(num, map.getOrDefault(num, 0) + 1);
                }
            }
            System.out.println(map.size() <= 1 ? "YES" : "NO");
        }
    }
}