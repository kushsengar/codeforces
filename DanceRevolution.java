import java.util.*;

public class DanceRevolution {
    private static int getTileIndex(String instruction) {
        return Arrays.asList("up", "down", "left", "right").indexOf(instruction);
    }

    private static List<List<List<Integer>>> initializeDP(int n) {
        int INF = Integer.MAX_VALUE / 2;
        List<List<List<Integer>>> dp = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            List<List<Integer>> row = new ArrayList<>();
            for (int j = 0; j < 4; j++) {
                row.add(new ArrayList<>(Collections.nCopies(4, INF)));
            }
            dp.add(row);
        }
        return dp;
    }

    private static void updateDP(List<List<List<Integer>>> dp, int i, int tile) {
        for (int l1 = 0; l1 < 4; l1++) {
            for (int l2 = 0; l2 < 4; l2++) {
                dp.get(i).get(tile).set(l2, Math.min(dp.get(i).get(tile).get(l2), dp.get(i - 1).get(l1).get(l2) + (l1 == tile ? 0 : 1)));
                dp.get(i).get(l1).set(tile, Math.min(dp.get(i).get(l1).get(tile), dp.get(i - 1).get(l1).get(l2) + (l2 == tile ? 0 : 1)));
            }
        }
    }

    private static int getMinimumMoves(List<List<List<Integer>>> dp, int n) {
        int minMoves = Integer.MAX_VALUE / 2;
        for (int l1 = 0; l1 < 4; l1++) {
            for (int l2 = 0; l2 < 4; l2++) {
                minMoves = Math.min(minMoves, dp.get(n).get(l1).get(l2));
            }
        }
        return minMoves;
    }

    public static int getMinimumMoves(int n, String[] instructions) {
        int[] tileMap = {0, 1, 2, 3};
        List<List<List<Integer>>> dp = initializeDP(n);
        for (int l1 = 0; l1 < 4; l1++) {
            for (int l2 = 0; l2 < 4; l2++) {
                dp.get(0).get(l1).set(l2, 0);
            }
        }
        for (int i = 1; i <= n; i++) {
            int tile = tileMap[getTileIndex(instructions[i - 1])];
            updateDP(dp, i, tile);
        }
        return getMinimumMoves(dp, n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] instructions = new String[n];
        for (int i = 0; i < n; i++) {
            instructions[i] = sc.nextLine();
        }
        System.out.println(getMinimumMoves(n, instructions));
    }
}
