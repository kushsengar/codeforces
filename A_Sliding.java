import java.util.*;

public class A_Sliding {
   
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            long baseValue = 1L;
            int testCases = scanner.nextInt();
            
            while (testCases-- > 0) {
                int rows = scanner.nextInt();
                int columns = scanner.nextInt();
                int currentRow = scanner.nextInt() - 1;
                int currentColumn = scanner.nextInt() - 1;
                
                long totalDistance = 
                    (baseValue) * (rows - 1 - currentRow) * (columns - 1) * 1 + 
                    (baseValue) * (rows - 1 - currentRow) * 1 * (1 + (columns - 1)) + 
                    (baseValue) * (columns - 1 - currentColumn) * 1;
    
                System.out.println(totalDistance);
            }
            scanner.close();
    }
}