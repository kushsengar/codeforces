import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * C_Numeric_String_Template
 */
public class C_Numeric_String_Template {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            int m = sc.nextInt();
            for (int i = 0; i < m; i++) {
                String str = sc.next();
                if (str.length() != n) {
                    System.out.println("NO");
                } else {
                    HashMap<Character, Integer> map = new HashMap<>();
                    boolean flag = true;
                    for (int j = 0; j < n; j++) {
                        if (map.containsKey(str.charAt(j))) {
                            if (map.get(str.charAt(j)) != a[j]) {
                                flag = false;
                                break;
                            }
                        } else {
                            if (map.containsValue(a[j])) {
                                flag = false;
                                break;
                            }
                            map.put(str.charAt(j), a[j]);
                        }
                    }
                    System.out.println(flag ? "YES" : "NO");
                }
            }
        }
    }
}