import java.util.Scanner;

/**
 * A_Quintomania
 */
public class A_Quintomania {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
    }
    boolean flag = false;
    for(int i=0;i<n-1;i++){
        if (Math.abs(a[i+1]-a[i])!=7 && Math.abs(a[i+1]-a[i])!= 5) {
            System.out.println("NO");
            flag = false;
            break;
        }else {
            flag = true;
        }
    }
     if (flag) {
        System.out.println("YES");
     }
}
    }
}