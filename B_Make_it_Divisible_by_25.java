import java.util.Scanner;

public class B_Make_it_Divisible_by_25 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Number of test cases

        while (t-- > 0) {
            String n = sc.next(); // Read number as string
            int len = n.length();
            int minDeletions = Integer.MAX_VALUE;

            // Check all possible valid suffixes for divisibility by 25
            String[] targets = {"75", "25", "50", "00"};

            for (String target : targets) {
                int targetIndex = target.length() - 1;
                int deletions = 0;

                // Traverse number from the back to match the target
                for (int i = len - 1; i >= 0; i--) {
                    if (n.charAt(i) == target.charAt(targetIndex)) {
                        targetIndex--;
                        if (targetIndex < 0) break; // Found the entire target
                    } else {
                        deletions++;
                    }
                }

                // If we successfully matched the target
                if (targetIndex < 0) {
                    minDeletions = Math.min(minDeletions, deletions);
                }
            }

            System.out.println(minDeletions);
        }
    }
}
