import java.util.Scanner;

public class B_Make_AP {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Number of test cases
        
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            
          boolean flag = false;
          if((2*b-c)%a==0) {
            if ((2*b-c)/a>0) {
                flag = true;
            }
          }

          if ((c+a)%(2*b)==0) {
            flag = true;
          }

          if ((2*b-a)%c==0) {
            if ((2*b-a)/c>0) {
                flag = true;
            }
          }
          System.out.println(flag==true? "YES" : "NO");
    }
}
}