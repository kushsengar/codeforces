import java.util.*;
public class A_Shohag_Loves_Mod {

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int t = sc.nextInt();
    //     while (t-- > 0) {
    //         int n = sc.nextInt();
    //         int[] arr = new int[n];
    //        for(int i=0;i<n;i++){
    //         arr[i] = 2*i+1;
    //        }
    //        for (int i = 0; i < n; i++) {
    //            System.out.print(arr[i] + " ");
    //        }
    //        System.out.println();
    //     }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            find(n, arr);
            for(int i: arr) System.out.print(i+" ");
            System.out.println();
        }
    }

    private static void find(int n, int[] arr) {
        int j=1;
        for(int i=0 ; i<n ; i++){
            arr[i] = j;
            j+=2;
        }
    
    }
}