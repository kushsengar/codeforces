import java.util.Scanner;

/**
 * B_Card_Game
 */
public class B_Card_Game {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a1 = sc.nextInt();
            int a2 = sc.nextInt();
            int b1 = sc.nextInt();
            int b2 = sc.nextInt();
            int win = 0;
            if (a1 > b1){
                win += (a2 > b2 ? 1 : 0) + (a2 == b2 ? 1 : 0);
            }
            if (a1 > b2){
                win += (a2 > b1 ? 1 : 0) + (a2 == b1 ? 1 : 0);
            }
               
            if (a2 > b1){
                 win += (a1 > b2 ? 1 : 0) + (a1 == b2 ? 1 : 0);
                }
             if (a2 > b2){
                win += (a1 > b1 ? 1 : 0) + (a1 == b1 ? 1 : 0);
             }
            if (a1 == b1)
                win += (a2 > b2 ? 1 : 0);
            if (a1 == b2)
                win += (a2 > b1 ? 1 : 0);
            if (a2 == b1)
                win += (a1 > b2 ? 1 : 0);
            if (a2 == b2)
                win += (a1 > b1 ? 1 : 0);

            System.out.println(win);
        }
        }
    
    }