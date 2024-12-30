import java.util.*;
/**
 * D_Kousuke_s_Assignment
 */
public class D_Kousuke_s_Assignment {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int numTestCases = scanner.nextInt();
            while (numTestCases-- > 0) {
                int numSymbols = scanner.nextInt();
                int[] productionRules = new int[numSymbols];
                for (int i = 0; i < numSymbols; i++) productionRules[i] = scanner.nextInt();
                System.out.println(maxBeautifulSegments(productionRules));
            }
        }
        
        static int maxBeautifulSegments(int[] productionRules) {
            int numSymbols = productionRules.length, currentSum = 0, beautifulCount = 0;
            Map<Integer, Integer> cfgPositions = new HashMap<>();
            cfgPositions.put(0, -1);
            for (int i = 0; i < numSymbols; i++) {
                currentSum += productionRules[i];
                if (cfgPositions.containsKey(currentSum)) {
                    beautifulCount++;
                    cfgPositions.clear();
                    cfgPositions.put(0, i);
                    currentSum = 0;
                }
                cfgPositions.putIfAbsent(currentSum, i);
            }
            return beautifulCount;
        }
    }
