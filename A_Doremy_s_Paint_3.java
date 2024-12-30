import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class A_Doremy_s_Paint_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            boolean flag = true;
        HashMap<Integer , Integer> hm = new HashMap<>();
        for(int i=0;i<n;i++){
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
            if (hm.size()>2) {
                flag= false;
                break;
            }
        }
         if (hm.size()==2) {
            int f1 = hm.entrySet().iterator().next().getValue();
            if (f1!=n/2 && f1!= (n+1)/2) {
                flag = false;
            }
         }   
           if (flag) {
            System.out.println("Yes");
           } else{
            System.out.println("No");
           }
            
        }
}
}