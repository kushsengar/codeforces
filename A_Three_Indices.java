import java.util.Scanner;

public class A_Three_Indices {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            int [] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            boolean flag = false;
            for(int i =1 ;i<n-1;i++){
                if(a[i]>a[i-1] && a[i]>a[i+1]){
                    flag = true;
                    System.out.println("YES");
                    System.out.println((i)+" "+(i+1)+" "+(i+2));
                    break;
                }
            }
            if(!flag){
                System.out.println("NO");
            }
        }
    }
}