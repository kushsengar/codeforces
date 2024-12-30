import java.util.Scanner;

/**
 * A_Sakurako_and_Kosuke
 */
public class A_Sakurako_and_Kosuke {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            if (n%2==0) {
                System.out.println("Sakurako");
            }else{
                System.out.println("Kosuke");
            }
        }
    }
}