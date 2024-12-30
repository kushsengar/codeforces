import java.util.Scanner;

public class C_Prepend_and_Append {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String str = sc.next();
            int l =0;
            int h = n-1;
            int ans = n;
            while (l <= h) {
                if (str.charAt(l)!=str.charAt(h)) {
                    ans -= 2;
                    l++;
                    h--;
                }else{
                    break;
                }
            }
            System.out.println(ans);
        }
    }
}