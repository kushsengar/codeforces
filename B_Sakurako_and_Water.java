import java.util.Scanner;

/**
 * B_Sakurako_and_Water
 */
public class B_Sakurako_and_Water {
     public static long magic(int[][] heights , int n){
        long magic = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (heights[i][j] < 0) {
                   long needed= Math.abs(heights[i][j]);
                    magic+=needed;
                    for (int k = 0; k+i<n && k+j < n; k++) {
                        heights[i+k][j+k] +=needed;
                    }
                }
            }
        }
        return magic;
     }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); 
        
        while (t-- > 0) {
            int n = scanner.nextInt(); 
            int[][] heights = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    heights[i][j] = scanner.nextInt();
                }
            }
             
            System.out.println(magic(heights, n));
        }
        
       
       
    }
}