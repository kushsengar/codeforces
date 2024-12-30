import java.util.Scanner;

/**
 * FightBots
 */
public class FightBots {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int t = 0; t < T; t++) {
            int N = scanner.nextInt();
            int X = scanner.nextInt();
            int Y = scanner.nextInt();
            String S = scanner.next();

            int aliceX = 0, aliceY = 0;
            
            boolean bobWins = false;

           
            for (int i = 0; i < N; i++) {
                char c = S.charAt(i);
                if (c == 'L') aliceX--;
                if (c == 'R') aliceX++;
                if (c == 'U') aliceY++;
                if (c == 'D') aliceY--;
                int d = Math.abs(X-aliceX)+ Math.abs(aliceY-Y);
                if (d<=i+1 && (d%2==(i+1)%2)) {
                   bobWins=true;
                   break;
                }
               
            }
           System.out.println(bobWins?"Yes":"No");
           
        }
    }
}