import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class A_United_We_Stand {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            ArrayList<Integer> b = new ArrayList<>();
            ArrayList<Integer> c = new ArrayList<>();
           Arrays.sort(arr);
           b.add(arr[0]);
           for(int i=1;i<n;i++){
            if (arr[i]==b.get(0)) {
                b.add(arr[i]);
            }else{
                c.add(arr[i]);
            }
           }
           if (b.size()<1 || c.size()<1) {
            System.out.println(-1);
            continue;
           }else{
            System.out.println(b.size()+" "+c.size());
           }
           for(int i=0;i<b.size();i++){
            System.out.print(b.get(i)+" ");
           }
           System.out.println();
           for(int i=0;i<c.size();i++){
            System.out.print(c.get(i)+" ");
           }
           System.out.println();
        }
    }
}