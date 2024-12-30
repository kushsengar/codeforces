import java.util.Scanner;

public class Nearly_Equal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            String a = sc.next();
            String b = sc.next();
            int res = m;
            for(int i=0;i<=n-m;i++){
                int c=0;
                for(int j=0;j<m;j++){
                    if (a.charAt(i+j)!=b.charAt(j)) {
                        c++;
                    }
                }
                if(c<res){
                    res = c;
                  }
            }
        System.out.println(res);
        }
    }
}