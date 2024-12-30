import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class D_Harder_Problem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Number of test cases
        
        while (t-- > 0) {
            int n = sc.nextInt(); // Length of array a
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            
            int[] freq = new int[n + 1]; // Frequency tracker for array b
            int[] b = new int[n];       // Resultant array b
            
            // Calculate min and max frequencies in a
            int[] count = new int[n + 1];
            for (int value : a) {
                count[value]++;
            }
            int minFreq = Arrays.stream(count).filter(x -> x > 0).min().orElse(0);
            int maxFreq = Arrays.stream(count).max().orElse(0);
            int mid = (minFreq + maxFreq) / 2;
            
            // Construct b
            for (int i = 0; i < n; i++) {
                if (freq[a[i]] < mid) {
                    b[i] = a[i];
                    freq[a[i]]++;
                } else {
                    // Set b[i] to the next available value in a
                    for (int j = i + 1; j < n; j++) {
                        if (freq[a[j]] < mid) {
                            b[i] = a[j];
                            freq[a[j]]++;
                            break;
                        }
                    }
                }
            }
            
            // Print the resultant array b
            for (int val : b) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
        sc.close();
        
    }
}