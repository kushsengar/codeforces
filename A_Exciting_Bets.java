import java.util.Scanner;

public class A_Exciting_Bets {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
           long a = sc.nextLong();
           long b = sc.nextLong();
           if (a==b) {
            System.out.println(0+" "+0);
           }else{
            long diff = Math.abs(a-b);
            if (diff==1) {
                System.out.println(1+" "+0);
            }else{
                long rem = a % diff;
                if(Math.abs(diff-rem)<rem){
                    System.out.println(diff+" "+Math.abs(diff-rem));
                }else{
                    System.out.println(diff+" "+rem);
                }
            }
           }

        }
    }
}