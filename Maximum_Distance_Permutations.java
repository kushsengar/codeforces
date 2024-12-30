import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Maximum_Distance_Permutations {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int j = 0; j < t; j++) {
            ArrayList<Integer> al1 = new ArrayList<>();
            ArrayList<Integer> al2 = new ArrayList<>();
            int n = sc.nextInt();
           
            for (int i = 1; i <= n; i++) {
                al1.add(i);
            }

            for (int i = 0; i < al1.size(); i++) {
                System.out.print(al1.get(i) + " ");
            }
            System.out.println();
            
           
            for (int i = (al1.size() + 1) / 2; i < al1.size(); i++)
            {
                al2.add(al1.get(i));
            }
            
            for (int i = 0; i < (al1.size() + 1) / 2; i++)
            {
                al2.add(al1.get(i));
            }

            for (int i = 0; i < al2.size(); i++)
            {
                System.out.print(al2.get(i) + " ");
            }
               
            System.out.println();
        }

    }

}