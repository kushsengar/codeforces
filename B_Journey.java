import java.util.Scanner;

public class B_Journey {

      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
      
        while (t-- > 0) {
            long n = sc.nextLong();
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();

            long cycleSum = a + b + c;
            long fullCycles = n / cycleSum;
            long remainingDistance = n % cycleSum;

    
            long days = fullCycles * 3;
            if (remainingDistance > 0) {
                days++; 
                remainingDistance -= a;
            }
            if (remainingDistance > 0) {
                days++; 
                remainingDistance -= b;
            }
            if (remainingDistance > 0) {
                days++; 
            }

           System.out.println(days);
        }

       
    }
}