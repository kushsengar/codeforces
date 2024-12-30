import java.util.Scanner;

public class Uninteresting_Number {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            long n  = sc.nextLong();
            if(n%9==0){
                System.out.println("YES");
                continue;
            }
            int sum =0;
            String s = String.valueOf(n);
            for(int i=0;i<s.length();i++){
                sum += s.charAt(i)-'0';
            }
            if((sum+4-2)%9==0 || (sum+9-3)%9==0){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
           
           }        
    }
}