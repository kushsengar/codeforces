import java.util.Scanner;

public class A_Ambitious_Kid {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] arr = new int[n];
            int min = Integer.MAX_VALUE;
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
                if(Math.abs(arr[i])<min){
                    min = Math.abs(arr[i]);
                }
            }
            System.out.println(min);
        
    }
}