import java.util.Scanner;

/**
 * B_Seating_in_a_Bus
 */
public class B_Seating_in_a_Bus {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
 boolean flag = true;
            boolean[] seats = new boolean[n + 2]; 
            seats[a[0]] = true; 
            
            for (int i = 1; i < n; i++) {
                int seat = a[i];
            if (!seats[seat - 1] && !seats[seat + 1]) {
                    flag = false;
                    break;
            }
                seats[seat] = true;
            }
            
            System.out.println(flag ? "YES" : "NO");
        }
        
    }
}