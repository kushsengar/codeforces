import java.util.Scanner;

public class B_Comparison_String {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            int maxLength = 1; // Tracks the maximum length of consecutive '<' or '>'
            int currentLength = 1; // Tracks the current sequence length
            
            for (int i = 1; i < n; i++) {
                if (s.charAt(i) == s.charAt(i - 1)) {
                    currentLength++;
                } else {
                    maxLength = Math.max(maxLength, currentLength);
                    currentLength = 1;
                }
            }
            // Check the last sequence
            maxLength = Math.max(maxLength, currentLength);
            System.out.println(maxLength + 1);
        }
    }
}