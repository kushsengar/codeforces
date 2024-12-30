import java.util.Scanner;

public class Line_Breaks {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            String[] s = new String[n];
            for(int i=0;i<n;i++){
               s[i] = sc.next();
            }
            int c =0;
            for(int i=0;i<n;i++){
              if(s[i].length()<=m){
                c++;
                m-= s[i].length();
              }else{
                break;
              }
            }
            System.out.println(c);
        }
    }
}