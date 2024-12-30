import java.util.Scanner;

/**
 * A_Don_t_Try_to_Count
 */
public class A_Don_t_Try_to_Count {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            String x = sc.next();
            String s = sc.next();
             boolean flag = false;
            for(int op =0;op<=5;op++){
                if (x.contains(s)) {
                    System.out.println(op);
                    flag=true;
                    break;
                }
                x+=x;
            }
            if (!flag) {
                System.out.println(-1);
            }
        }
    }
}