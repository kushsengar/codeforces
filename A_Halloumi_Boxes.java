import java.util.Scanner;


public class A_Halloumi_Boxes {

    public static boolean isSorted(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
          if (array[i] > array[i + 1]) {
            return false;
          }
        }
        return true;
      }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-->0) {
        int n = sc.nextInt();
        int k= sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        if (k==1 && isSorted(arr)) {
            System.out.println("YES");
        }else if (k==1 && !isSorted(arr)) {
            System.out.println("NO");
        }else{
            System.out.println("YES");
        }
    }
  }
    
}