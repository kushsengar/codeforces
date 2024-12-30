import java.util.Scanner;

public class B_Normal_Problem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            String s = sc.next();
            StringBuilder sb = new StringBuilder();
            for(int i=s.length()-1;i>=0;i--){
                if (s.charAt(i)=='p') {
                    sb.append('q');
                }else if(s.charAt(i)=='q'){
                    sb.append('p');
                }else{
                    sb.append('w');
                }
            }
            System.out.println(sb.toString());
        }
    }
}