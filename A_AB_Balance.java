import java.util.*;
public class A_AB_Balance {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
          String s = sc.next();
          if (s.charAt(0)==s.charAt(s.length()-1)) {
            System.out.println(s);
          }else{
            if (s.charAt(0)=='a') {
                System.out.println('b' + s.substring(1, s.length() ));
            }else{
                System.out.println('a' + s.substring(1, s.length() ));
            }
          }











        //   int c1 = 0;
        //   int c2 = 0;
        //   for(int i = 0 ; i < s.length()-1 ; i++){
        //       if (s.charAt(i)=='a' && s.charAt(i+1)=='b') {
        //         c1++;
        //       }else if(s.charAt(i)=='b' && s.charAt(i+1)=='a'){
        //         c2++;
        //       }
        //   }  
        //   if (c1==c2) {
        //     System.out.println(s);
        //   }else{
        //     for(int i =0;i<s.length();i++){
        //         if (c1>c2) {
        //             if (c1!=c2 && s.charAt(i)=='a' && s.charAt(i+1)=='b') {
        //                 System.out.print('b');
        //                 c1--;
        //             }else{
        //                 System.out.print(s.charAt(i));
        //             }
        //         }else{
        //             if (c1!=c2 && s.charAt(i)=='b' && s.charAt(i+1)=='a') {
        //                 System.out.print('a');
        //                 c2--;
        //             }else{
        //                 System.out.print(s.charAt(i));
        //             }
        //         }
        //     }
        //     System.out.println();
        //   }
        }
    }
}