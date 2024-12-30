import java.util.*;

public class B_Buying_Lemonade {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] cans = new int[n];
            
            for (int i = 0; i < n; i++) {
                cans[i] = sc.nextInt();
            }
            
            // Sort the slots based on the number of cans (ascending)
            Arrays.sort(cans);
            
            int answer = 0; // Total number of presses
            int collected = 0; // Total cans collected
            
            // Iterate from the largest slot backward
            for (int i = n - 1; i >= 0; i--) {
                // Number of presses we can do on this slot
                int presses = Math.min(k - collected, cans[i]);
                answer += presses;
                collected += presses;
                
                // If we have collected enough cans, we can stop
                if (collected >= k) {
                    break;
                }
            }
            
            System.out.println(answer);
        }
    }
}
