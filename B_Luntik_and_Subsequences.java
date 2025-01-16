import java.util.Scanner;

public class B_Luntik_and_Subsequences {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            int [] a = new int[n];
            int z =0;
            int o = 0;
            for(int i = 0 ;i < n ;i++){
                 a[i] = sc.nextInt();
                 if (a[i]==0) {
                    z++;
                 }else if(a[i]==1){
                    o++;
                 }
            }
            long ans = (long)(o * Math.pow(2, z));
            System.out.println(ans);
        }
    }
}