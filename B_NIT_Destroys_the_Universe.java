import java.util.Scanner;

public class B_NIT_Destroys_the_Universe {

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int l=-1,r=-1;
        for(int i=0;i<n;i++){
            if (a[i]!=0) {
                if(l==-1 && r==-1){
                    l=r=i;
                }else{
                    r=i;
                }
            }
        }
        if (l==-1 && r==-1) {
            System.out.println(0);
        }else{
            boolean flag = false;
            for(int i = l ;i<=r ;i++){
                if (a[i]==0) {
                    flag = true;
                }
            }
            if (flag) {
                System.out.println(2);
            }else{
                System.out.println(1);
            }
        }
    }
}
    }

              