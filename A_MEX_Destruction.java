import java.util.Scanner;

public class A_MEX_Destruction {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            int count =0;
            for(int i=0;i<n;i++){
              arr[i] = sc.nextInt();
              if (arr[i]==0) {
                count++;
              }
            }
            if (count==n) {
                System.out.println(0);
            }else if(count==0){
                System.out.println(1);
            }else if(count==1 && (arr[0]==0 || arr[n-1]==0)){
                System.out.println(1);
            }else if(count==2 && arr[0]==0 && arr[n-1]==0){
                System.out.println(1);
            }else{
                System.out.println(2);
            }
            
        }
    }
}