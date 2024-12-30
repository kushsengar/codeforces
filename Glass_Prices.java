import java.util.Scanner;

/**
 * Glass_Prices
 */
public class Glass_Prices {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        if (y<=2*x){
            System.out.println("METAL");
        }else{
            System.out.println("PLASTIC");
        }
    }
}