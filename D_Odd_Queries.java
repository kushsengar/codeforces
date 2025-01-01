import java.util.*;
public class D_Odd_Queries {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Number of test cases
        while (t-- > 0) {
            int n = sc.nextInt(); // Array size
            int q = sc.nextInt(); // Number of queries
            int[] arr = new int[n];
            int sum = 0;

            // Read array and calculate its sum
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                sum += arr[i];
            }
            int[] prefixSum = new int[n+1];
            for(int i=1;i<=n;i++){
                prefixSum[i] = prefixSum[i-1] + arr[i-1];
            }
            // Process each query
            for (int query = 0; query < q; query++) {
                int l = sc.nextInt();
                int r = sc.nextInt();
                int k = sc.nextInt();

              int x = prefixSum[r] - prefixSum[l-1] ;
              int y = sum - x + (r-l+1)*k;
              if (y % 2 !=0 ) {
                System.out.println("YES");
              }else{
                System.out.println("NO");
              }
            }
        }
    }
}