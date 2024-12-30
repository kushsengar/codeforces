import java.util.Scanner;

public class A_Walking_Master {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            int moves = 0;
            if (a==c && b==d) {
                System.out.println(0);
            }else if(b>d){
                System.out.println(-1);
            }else{
               moves += d-b;
               a += moves;
               b += moves;
               if (c>a) {
                System.out.println(-1);
               }else{
                System.out.println(moves + (a-c));
               }
            }
        }
    }
}