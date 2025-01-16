import java.util.Scanner;

public class A_Two_Frogs {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {   
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int p = Math.abs(a-b) - 1;
            if (p==0 || p%2==0) {
                System.out.println("NO");
            }else{
                System.out.println("YES");
            }
        }
    }
}