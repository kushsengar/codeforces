import java.util.*;

public class A_Make_it_Beautiful {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
          if (arr[0]==arr[n-1]) {
            System.out.println("NO");
          }else{
            System.out.println("YES");
            System.out.print(arr[n-1]+" "+arr[0]+" ");
            for(int i=1;i<n-1;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
          
           
           }
            
            
        }
    }
}