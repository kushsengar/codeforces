import java.util.Scanner;

public class A_Unit_Array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int f1 = 0;
            int f2 = 0;
            for(int i = 0 ; i < n ; i++){
                 a[i] = sc.nextInt();
                
                 if(a[i]<0){
                   f1++;
                 }
            }
            f2 = n-f1;
            if (f1 <= f2) {
                if (f1 % 2 != 0) {
                    System.out.println(1);
                }else{
                    System.out.println(0);
                }
            }else{
                int ans = f1-(n/2);
                if ((f1-ans)%2==0) {
                    System.out.println(ans);
                }else{
                    System.out.println(ans+1);
                }
            }
            
        }
    }
}