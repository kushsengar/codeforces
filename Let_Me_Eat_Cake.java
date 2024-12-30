import java.util.Scanner;

/**
 * Let_Me_Eat_Cake
 */
public class Let_Me_Eat_Cake {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            int c = 0;
            while (a!=b) {
                if (a>b && a>0) {
                   c+= (a+1)/2;
                   a-=(a+1)/2;
                }else if(b>a && b>0){
                    c+=(b+1)/2;
                    b-=(b+1)/2;
                }
            }
            System.out.println(c);
        }
    }
}