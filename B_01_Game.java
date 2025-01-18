import java.util.Scanner;

public class B_01_Game {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            String s = sc.next();
           int n = s.length();
            int x = 0;
            int y = 0;
           for(int i =0;i<n;i++){
            if (s.charAt(i)=='1') {
                x++;
            }else{
                y++;
            }
           }
           if (x>y) {
            if ((y&1)==1) {
                System.out.println("DA");
            }else{
                System.out.println("NET");
            }
           }else{
            if ((x&1)==1) {
                System.out.println("DA");
            }else{
                System.out.println("NET");
            }
           }
        }
    }
}