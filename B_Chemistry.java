import java.util.HashMap;
import java.util.Scanner;

public class B_Chemistry{
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            String s = sc.next();

            HashMap<Character, Integer> freqMap = new HashMap<>();
            for (char ch : s.toCharArray()) {
                freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
            }

            int odds = 0;
            for (int freq : freqMap.values()) {
                if (freq % 2 != 0) {
                    odds++;
                }
            }

            if (k < odds - 1) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
      
}