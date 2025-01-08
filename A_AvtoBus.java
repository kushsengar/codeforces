import java.util.*;
public class A_AvtoBus{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
           long n = sc.nextLong();
        if (n%2!=0 || n==2) {
            System.out.println(-1+" ");
        }else if(n%2==0){
            long x = n/2;
            if (x%3==0) {
                System.out.print(x/3+" ");
            }else if(n%3==1 || n%3==2){
                System.out.print((x/3) + 1+" ");
            }
            System.out.println(n/4);
        }

        }

    }
}