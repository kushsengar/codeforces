import java.util.Scanner;

public class A_One_and_Two{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int [] arr = new int[n];
            int count =0;
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
                if (arr[i]==2) {
                    count++;
                }
            }
            int x = count;
            if ((count & 1) !=0) {
                System.out.println(-1);
                continue;
            }else if(count==0){
                System.out.println(1);
            }else{
                for(int i=0;i<n;i++){
                    if (count*2 > x) {
                        if (arr[i]==2) {
                            count--;
                        }
                    }else{
                        System.out.println(i);
                        break;
                    }
                }
            }
        }
    }
}