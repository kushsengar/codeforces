import java.util.HashSet;
import java.util.Scanner;

/**
 * Non_matching_Name
 */
public class Non_matching_Name {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int t = sc.nextInt();
         while (t-->0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            sc.nextLine();
            String str1 = sc.nextLine();
            String str2 = sc.nextLine();
       HashSet<Character> hs1 = new HashSet<>();
          for(int i=0;i<n;i++){
            hs1.add(str1.charAt(i));
          }
          for(int i=0;i<m;i++)
          if (!hs1.contains(str2.charAt(i))) {
            hs1.add(str2.charAt(i));
          }
           if (hs1.size()<26) {
            System.out.println("YES");
           }else{
            System.out.println("NO");
           }
           
          }
          
    }
}