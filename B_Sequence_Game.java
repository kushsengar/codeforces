import java.util.ArrayList;
import java.util.Scanner;

public class B_Sequence_Game {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            int [] b = new int[n];
            for(int i=0;i<n;i++){
                b[i] = sc.nextInt();
            }
            ArrayList<Integer> arr = new ArrayList<>();
            arr.add(b[0]);
            for(int i=1;i<n;i++){
                if(b[i]>=b[i-1]){
                    arr.add(b[i]);
                }else {
                    arr.add(b[i]);
                    arr.add(b[i]);
                }
            }
            System.out.println(arr.size());
            for(int i=0;i<arr.size();i++){
                System.out.print(arr.get(i)+" ");
            }
            System.out.println();
        }
    }
}