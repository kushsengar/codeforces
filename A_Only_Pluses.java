import java.util.Arrays;
import java.util.Scanner;

/**
 * A_Only_Pluses
 */
public class A_Only_Pluses {

    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
           int a = sc.nextInt();
           int b = sc.nextInt();
           int c = sc.nextInt();
           int[] arr = { a,b ,c};
           Arrays.sort(arr);
           int d = 5;
           for(int i=0;i<d;i++){
            Arrays.sort(arr);
            arr[0]++;
           }
            int bananas = arr[0]*arr[1]* arr[2];
            System.out.println(bananas);
        }
    }
}