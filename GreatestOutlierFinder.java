import java.util.ArrayList;
import java.util.List;

public class GreatestOutlierFinder {
    public List<List<Integer>> findAllSubsequences(int[] arr) {
        List<List<Integer>> subsequences = new ArrayList<>();
        int n = arr.length;
        
        // There are 2^n possible subsequences
        int totalSubsequences = 1 << n; // Equivalent to 2^n
        
        for (int i = 0; i < totalSubsequences; i++) {
            List<Integer> subsequence = new ArrayList<>();
            
            for (int j = 0; j < n; j++) {
                // Check if j-th bit in i is set. If set, include arr[j] in the subsequence
                if ((i & (1 << j)) != 0) {
                    subsequence.add(arr[j]);
                }
            }
            
            subsequences.add(subsequence);
        }
        
        return subsequences;
    }

    public static void main(String[] args) {
        GreatestOutlierFinder sol = new GreatestOutlierFinder();
        int[] arr = {1, 2, 3};
        
        List<List<Integer>> subsequences = sol.findAllSubsequences(arr);
        
        // Print all subsequences
        for (List<Integer> subseq : subsequences) {
            System.out.println(subseq);
        }
    }
}
