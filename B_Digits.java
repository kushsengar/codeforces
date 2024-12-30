import java.util.ArrayList;
import java.util.Scanner;

public class B_Digits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Number of test cases

        while (t-- > 0) {
            int n = scanner.nextInt();
            int d = scanner.nextInt();
           ArrayList<Integer> arr = new ArrayList<>();
            arr.add(1);  
            if (n >= 3 || d % 3 == 0) {
                arr.add(3);;
            }
            if (d == 5) {
                arr.add(5);
            }
            if (n >= 3 || d == 7) {
                arr.add(7);
            }
            if (n >= 6 || d % 9 == 0) {
                arr.add(9);
            }
            for(int i=0;i<arr.size();i++){
                System.out.print(arr.get(i)+" ");
            }
            System.out.println();
        }

        
    }

}