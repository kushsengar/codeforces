import java.util.Scanner;

public class A_We_Need_the_Zero {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            int ans  = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                ans = arr[i] ^ ans ;
            }
            if (n%2==0) {
                if (ans==0) {
                    System.out.println(ans);
                }else{
                    System.out.println(-1);
                }
            }else{
                System.out.println(ans);
            }
        }
    }
}