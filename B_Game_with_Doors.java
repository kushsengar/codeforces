import java.util.Scanner;

/**
 * B_Game_with_Doors
 */
public class B_Game_with_Doors {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        while (T-- > 0) {
            int l = scanner.nextInt();
            int r = scanner.nextInt();
            int L = scanner.nextInt();
            int R = scanner.nextInt();
            if (r < L) {
                // Alice's segment is entirely before Bob's segment
                System.out.println(L - r);
            } else if (R < l) {
                // Bob's segment is entirely before Alice's segment
                System.out.println(l - R);
            } else {
                // Their segments overlap or touch
                System.out.println(0);
            }
        }
    }
}