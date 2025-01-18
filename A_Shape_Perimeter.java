import java.util.*;

public class A_Shape_Perimeter {
    
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);     
     int t = sc.nextInt();    
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt(); 
            int[] x = new int[n];
            int[] y = new int[n];
            for (int i = 0; i < n; i++) {
                x[i] = sc.nextInt();
                y[i] = sc.nextInt();
            }
                 long collisoin = 0;     
            for (int i = 1; i < n; i++) {
                collisoin += 4 * m - 2 * (x[i] + y[i]);
            }
              
            System.out.println(4L * m * n - collisoin);
        }
    }
}
