import java.util.Scanner;

public class Gun_Master {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            int d = sc.nextInt();
            int[] arr = new int[n];
            int count=0;
            boolean close = true ; 
            boolean far = false;
            for(int i=0;i<n;i++){
                arr[i]= sc.nextInt();
            }
            for(int i=0;i<n;i++){
                if (arr[i]>d && close) {
                    count++;
                    close = false;
                    far = true;
                }
                if (arr[i]<=d && far) {
                    count++;
                    far = false;
                    close = true;
                }
            }
            System.out.println(count);
        }
    }
}