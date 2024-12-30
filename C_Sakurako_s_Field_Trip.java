import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * C_Sakurako_s_Field_Trip
 */
public class C_Sakurako_s_Field_Trip {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] topics = new int[n];
            for (int i = 0; i < n; i++) {
                topics[i] = scanner.nextInt();
            }
            System.out.println(minDisturbance(topics, n));
        }
        scanner.close();
    }

    public static int minDisturbance(int[] topics, int n) {
        int initialDisturbance = 0;
        for (int i = 1; i < n; i++) {
            if (topics[i] == topics[i - 1]) initialDisturbance++;
        }
        Map<Integer, Integer> firstHalfCount = new HashMap<>();
        Map<Integer, Integer> secondHalfCount = new HashMap<>();
        for (int i = 0; i < n / 2; i++) {
            firstHalfCount.put(topics[i], firstHalfCount.getOrDefault(topics[i], 0) + 1);
            secondHalfCount.put(topics[n - i - 1], secondHalfCount.getOrDefault(topics[n - i - 1], 0) + 1);
        }
        int maxPairs = 0;
        for (Map.Entry<Integer, Integer> entry : firstHalfCount.entrySet()) {
            int countInFirstHalf = entry.getValue();
            int countInSecondHalf = secondHalfCount.getOrDefault(entry.getKey(), 0);
            maxPairs += Math.min(countInFirstHalf, countInSecondHalf);
        }
        return initialDisturbance - maxPairs;
    }
}