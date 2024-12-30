/**
 * G_Pyramid
 */
import java.text.NumberFormat.Style;
import java.util.*;
public class G_Pyramid {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<(2*i+1);j++){
                   System.out.print("* ");
            }
            System.out.println();
        }
    }
}