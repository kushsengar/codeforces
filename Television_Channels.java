import java.util.Scanner;

public class Television_Channels {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (x%2!=0) {
            System.out.println((x/2)+1);
        }else{
            System.out.println(x/2);
        }
    }
}