import java.util.Scanner;

public class A_Cover_in_Water {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int ans=0;
            int n = sc.nextInt();
            String str = sc.next();
            for(int i=0;i<n;i++)
            {
                int count=0;
                while (n>i && str.charAt(i)=='.') {
                    count++;
                    i++;
                }
                if(count>2)
                {
                    ans=2;
                    break;
                }
                else
                {
                    ans+=count;
                }
            }
            System.out.println(ans);
        }

    }
}