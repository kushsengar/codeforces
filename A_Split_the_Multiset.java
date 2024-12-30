import java.util.*;
/**
 * A_Split_the_Multiset
 */
public class A_Split_the_Multiset {
    public static List<List<Integer>> splitIntoKSubsets(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> currentPartition = new ArrayList<>();
        splitHelper(n, k, 1, currentPartition, result);
        return result;
    }

    private static void splitHelper(int remainingSum, int remainingPartitions,
                                    int start, List<Integer> currentPartition,
                                    List<List<Integer>> result) {
        if (remainingSum == 0 && remainingPartitions == 0) {
            result.add(new ArrayList<>(currentPartition));
            return;
        }

        for (int i = start; i <= remainingSum; i++) {
            currentPartition.add(i);
            splitHelper(remainingSum - i, remainingPartitions - 1, i, currentPartition, result);
            currentPartition.remove(currentPartition.size() - 1);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Number of test cases

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            List<List<Integer>> partitions = splitIntoKSubsets(n, k);
            System.out.println("Partitions: " + partitions);
        }
    }

 }
