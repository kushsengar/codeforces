import java.util.Scanner;

public class C_Target_Practice {
    // public static int score(int i, int j) {
    //     if (i == 0 || j == 0 || i == 9 || j == 9) {
    //         return 1;
    //     } else if (i == 1 || j == 1 || i == 8 || j == 8) {
    //         return 2;
    //     } else if (i == 2 || j == 2 || i == 7 || j == 7) {
    //         return 3;
    //     } else if (i == 3 || j == 3 || i == 6 || j == 6) {
    //         return 4;
    //     }
    //     return 5;
    // }

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int t = sc.nextInt();
    //     while (t-- > 0) {
    //         int n = 10;
    //         char[][] grid = new char[n][n];
    //         for (int i = 0; i < n; i++) {
    //             String row = sc.next(); // Read one row of the grid as a string
    //             for (int j = 0; j < n; j++) {
    //                 grid[i][j] = row.charAt(j); // Fill the grid with characters
    //             }
    //         }

    //         int ans = 0;
    //         for (int i = 0; i < n; i++) {
    //             for (int j = 0; j < n; j++) {
    //                 if (grid[i][j] == 'X') {
    //                     ans += score(i, j);
    //                 }
    //             }
    //         }
    //         System.out.println(ans);
    //     }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            int ans = 0;
            char[][] mat = new char[10][10];
            for (int i = 0; i < 10; i++) {
                String row = sc.next(); 
                for (int j = 0; j < 10; j++) {
                    mat[i][j] = row.charAt(j); // Extract individual characters
                }
            }
            ans = targetSum(mat);
            System.out.println(ans);
            t--;
        }
    }

    private static int targetSum(char[][] matrix) {
        int startRow=0, startCol=0, endRow=9, endCol=9;
        int score = 1, ans = 0;
        while(startRow<=endRow && startCol<=endCol){
            //top
            for(int j=startCol;j<=endCol;j++){
                if(matrix[startRow][j] == 'X')ans+=score;
            }
            //right
            for(int i=startRow+1;i<=endRow;i++){
                if(matrix[i][endCol] == 'X')ans+=score;
            }
            //bottom
            for(int j=endCol-1;j>=startCol;j--){
                if(startRow==endRow)
                    break;
                if(matrix[endRow][j] == 'X')ans+=score;
            }
            //left
            for(int i=endRow-1;i>=startRow+1;i--){
                if (startCol==endCol)
                    break;
                if(matrix[i][startCol] == 'X')ans+=score;
            }
            startRow++;
            startCol++;
            endRow--;
            endCol--;
            score++;
        }
        return ans;
     }

    
}
