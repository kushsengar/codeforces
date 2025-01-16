import java.util.Scanner;

public class B_Crafting {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
            while (t-- > 0) {
                int n = sc.nextInt();
                long a[] = new long[n];
                long b[] = new long[n];
                long counter = 0;
                int diffcount = 0;
                for (int i = 0; i < n; i++){
                     a[i] = sc.nextLong();
                } 
                for (int j = 0; j < n; j++){
                    b[j] = sc.nextLong();
                } 
              
                for (int i = 0; i < n; i++) {
                    if (a[i] < b[i] && Math.abs(a[i] - b[i]) >= counter) {
                        diffcount = i;
                        counter = Math.abs(a[i] - b[i]);
                    }
                }
                boolean flag = false;
                for (int i = 0; i < n; i++) {
                    if (i != diffcount && a[i] - counter < b[i]) {
                        flag = true;
                        break;
                    }
                }
                if (flag) {
                    System.out.println("NO");
                }else{
                    System.out.println("YES");
            }
            
        }
    }
}