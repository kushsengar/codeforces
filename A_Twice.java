import java.util.Scanner;

public class A_Twice {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int score = 0;
            boolean[] is = new boolean[n];
            for(int i=0;i<n;i++){
                for(int j=i+1;j<n;j++){
                    if (arr[i]==arr[j] && !is[i] && !is[j]) {
                        score++;
                        is[i]=true;
                        is[j]=true;
                    }
                }
            }
            System.out.println(score);
        }
    }
}