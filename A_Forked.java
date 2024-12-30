import java.util.HashSet;
import java.util.Scanner;

public class A_Forked {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Number of test cases

        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int xK = sc.nextInt();
            int yK = sc.nextInt();
            int xQ = sc.nextInt();
            int yQ = sc.nextInt();

            // Generate possible knight moves relative to king and queen
            int[][] moves = {
                {a, b}, {a, -b}, {-a, b}, {-a, -b},
                {b, a}, {b, -a}, {-b, a}, {-b, -a}
            };

            HashSet<String> kingMoves = new HashSet<>();
            HashSet<String> queenMoves = new HashSet<>();

            for (int[] move : moves) {
                kingMoves.add((xK + move[0]) + "," + (yK + move[1]));
                queenMoves.add((xQ + move[0]) + "," + (yQ + move[1]));
            }

            // Count common positions
            int count = 0;
            for (String pos : kingMoves) {
                if (queenMoves.contains(pos)) {
                    count++;
                }
            }

            System.out.println(count);
        }
}
}