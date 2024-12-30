import java.util.Scanner;

public class A_Penchick_and_Modern_Monument {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
           int n = sc.nextInt();
           int[] arr = new int[n];
           for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
           } 
           
           int max = Integer.MIN_VALUE;
           for(int i=0;i<n;i++){
            int c =0;
            for(int j=i;j<n;j++){
                if (arr[i]==arr[j]) {
                    c++;
                }
            }
            max = Math.max(max, c);
           }
           System.out.println(n-max);
        }
    }
}