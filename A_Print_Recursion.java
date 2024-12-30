import java.util.Scanner;

public class A_Print_Recursion {
     public static void printRec(int n){
        if (n==0) {
            return;
        }
        System.out.println("I love Recursion");
        printRec(n-1);
     }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printRec(n);
    }
}