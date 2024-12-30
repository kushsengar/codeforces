import java.util.Scanner;

public class MirrorMaze {
    static int[][][] visited;
    static int maxLoopSize = 0;
    static int m, n;
    static char[][] grid;

    static int[][] directions = {
        {-1, 0}, {1, 0}, {0, -1}, {0, 1}  // Up, Down, Left, Right
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        m = scanner.nextInt();
        n = scanner.nextInt();
        scanner.nextLine(); // Consume remaining newline 

        grid = new char[m][n];
        for (int i = 0; i < m; i++) {
            grid[i] = scanner.nextLine().replaceAll(" ", "").toCharArray();
        }

        visited = new int[m][n][4];  // Initialize the visited 3D array
        for (int[][] layer : visited) {
            for (int[] row : layer) {
                java.util.Arrays.fill(row, 0);  // Fill with zeros
            }
        }

        // Traverse each cell in the grid
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] != '0') {  // If the cell is not a wall ('0')
                    for (int d = 0; d < 4; d++) {
                        if (visited[i][j][d] == 0) {  // If not yet visited
                            int loopSize = traverse(i, j, d);
                            maxLoopSize = Math.max(maxLoopSize, loopSize);
                        }
                    }
                }
            }
        }

        System.out.println(maxLoopSize);  // Output the maximum loop size
        scanner.close();
    }

    static int traverse(int row, int col, int dir) {
        int startRow = row, startCol = col, startDir = dir;
        int loopSize = 0;

        while (true) {
            // Check for boundary conditions and return 0 if out of bounds or wall
            if (row < 0 || row >= m || col < 0 || col >= n || grid[row][col] == '0') {
                return 0;
            }

            if (visited[row][col][dir] == 1) {
                if (row == startRow && col == startCol && dir == startDir) {
                    return loopSize;  // We have completed a loop
                }
                return 0;  // We encountered a revisited cell not part of the current loop
            }

            visited[row][col][dir] = 1;  // Mark the cell as visited in the current direction
            loopSize++;

            row += directions[dir][0];  // Move to the next cell
            col += directions[dir][1];

            if (grid[row][col] == '/') {
                dir = reflectSlash(dir);  // Reflect direction for '/'
            } else if (grid[row][col] == '\\') {
                dir = reflectBackslash(dir);  // Reflect direction for '\\'
            }
        }
    }

    static int reflectSlash(int dir) {
        // Reflects directions based on '/'
        return switch (dir) {
            case 0 -> 3;  // Up -> Right
            case 1 -> 2;  // Down -> Left
            case 2 -> 1;  // Left -> Down
            case 3 -> 0;  // Right -> Up
            default -> dir;
        };
    }

    static int reflectBackslash(int dir) {
        // Reflects directions based on '\\'
        return switch (dir) {
            case 0 -> 2;  // Up -> Left
            case 1 -> 3;  // Down -> Right
            case 2 -> 0;  // Left -> Up
            case 3 -> 1;  // Right -> Down
            default -> dir;
        };
    }
}
// 5 5

// / / 0 0 \

// 0 0 0 / 0

// 0 \ 0 0 /

// \ / \ / 0

// 0 0 \ \ \
