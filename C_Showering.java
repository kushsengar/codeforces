import java.util.Scanner;

/**
 * C_Showering
 */
public class C_Showering {
    private static boolean canShower(int[] tasks, int s, int m) {
        int prevEnd = 0;
        for (int i = 0; i < tasks.length; i += 2) {
            int start = tasks[i];
            int end = tasks[i + 1];
            if (start - prevEnd >= s) {
                return true;
            }
            prevEnd = end;
        }
        return m - prevEnd >= s;
    }
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int t = sc.nextInt();
     while (t-->0) {
        int n = sc.nextInt();
        int s = sc.nextInt();
        int m = sc.nextInt();
        int[] tasks = new int[n * 2];
        for (int i = 0; i < n; i++) {
            tasks[i * 2] = sc.nextInt();
            tasks[i * 2 + 1] = sc.nextInt();
        }
        boolean canShower = canShower(tasks, s, m);
        System.out.println(canShower ? "YES" : "NO");
    }
}
}