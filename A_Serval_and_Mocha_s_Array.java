import java.util.Scanner;

public class A_Serval_and_Mocha_s_Array {
    public static int gcd(int a , int b){
        if(b==0) return a ;

        return gcd(b , a % b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            boolean flag = false;
            for(int i=0;i<n;i++){
                for(int j = i ;j<n ;j++){
                    if(gcd(arr[i], arr[j])<=2){
                        flag = true;
                    }
                }
            }
            System.out.println( (flag) ? "Yes" : "No");
        }
    }
}