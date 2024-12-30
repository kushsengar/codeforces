import java.util.Scanner;

public class Transfusion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {   
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            boolean flag = true;
            for(int i=0;i<n-1;i++){
                if (arr[i]==arr[i+1]) {
                    flag = false;
                }
            }
            if (arr[0] == arr[n-1] || !(flag)) {
                System.out.println("NO");
            }else{
                System.out.println("YES");
            }
        }
    }
}