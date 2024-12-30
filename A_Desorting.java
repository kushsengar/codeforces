import java.util.*;
public class A_Desorting {
    public static boolean isSorted(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                return false; // Found an element that is less than the previous one
            }
        }
        return true; // The array is sorted
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i=0;i<n;i++){
                a[i] = sc.nextInt();
            }
           if (!isSorted(a)) {
            System.out.println(0);
            continue;
           }
           ArrayList<Integer> minD = new ArrayList<>();
           for(int i=1;i<n;i++){
            minD.add(a[i]-a[i-1]);
           }
           int min = Integer.MAX_VALUE;
           int id = -1;
           for(int i=0;i<minD.size();i++){
            if(minD.get(i)<min){
                min = minD.get(i);
                id = i;
            }
           }
           if (a[id]==a[id+1]) {
            System.out.println(1);
           }else{
            int ans = (a[id]+ a[id+1])/2;
            ans = ans - a[id] + 1; 
            System.out.println(ans);
           }
        }

    }
}