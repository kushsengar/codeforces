import java.util.Arrays;
import java.util.Scanner;

public class B_Array_Cloning_Technique {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            int count = 0;
            int max = -1;
            for(int i =0;i<n-1;i++){
                if (arr[i]==arr[i+1]) {
                    count++;
                }else{
                 count = 0;
                }
                max = Math.max(count+1 , max);
            }
            

            if (max==-1) {
                System.out.println(0);
            }else{
                int ops =0 ;
                while (max<n) {
                    ops++;
                    if (n-max >= max) {
                        ops+= max;
                        max *= 2;
                    }else{
                        ops+= n-max;
                        max = n;
                    }
                }
                System.out.println(ops);
            }
            
         }
    }
}