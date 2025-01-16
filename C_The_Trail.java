import java.util.Scanner;

public class C_The_Trail {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  // Number of test cases
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            long[][] magicalRoad = new long[n + 1][m + 1];
            long[] roadRow = new long[n + 1];
            long[] roadColumn = new long[m + 1];
            String s = sc.next().strip();  // Path steps (R or D)

            // Read the grid and calculate row and column sums
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= m; j++) {
                    magicalRoad[i][j] = sc.nextInt();
                    roadRow[i] += magicalRoad[i][j];
                    roadColumn[j] += magicalRoad[i][j];
                }
            }

            // Process the path to restore the grid
            int leftP = 1, rightP = 1;
            for (char step : s.toCharArray()) {
                if (step == 'R') {
                    // Calculate value for the right step
                    long helper = -roadColumn[rightP];
                    magicalRoad[leftP][rightP] = helper;
                    roadColumn[rightP] = helper + magicalRoad[leftP][rightP];
                    roadRow[leftP] += helper;
                    rightP++;
                } else {  // 'D' step
                    // Calculate value for the down step
                    long helper = -roadRow[leftP];
                    magicalRoad[leftP][rightP] = helper;
                    roadRow[leftP] = helper + magicalRoad[leftP][rightP];
                    roadColumn[rightP] += helper;
                    leftP++;
                }
            }

            // Adjust the final cell (bottom-right corner)
            magicalRoad[n][m] = -roadColumn[m];

            // Output the restored grid
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= m; j++) {
                    System.out.print(magicalRoad[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
