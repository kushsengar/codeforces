import java.util.*;
public class ConsecutiveNumbersSum {
    public static int min(int[] arr){
        // int min = arr[0];
        // for(int i=1;i<arr.length;i++){
        //     if (arr[i]<min) {
        //         min = arr[i];
        //     }
        // }
        // return min;
        Arrays.sort(arr);
        return arr[0];
    }
   public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        // int N = scanner.nextInt();
        // scanner.close();

        // List<List<Integer>> result = new ArrayList<>();
        // int count = 0;

        // // Start with the first number in the series
        // for (int start = 1; start < N; start++) {
        //     int sum = 0;
        //     List<Integer> currentSet = new ArrayList<>();

        //     // Calculate the sum of consecutive numbers starting from 'start'
        //     for (int j = start; sum < N; j++) {
        //         sum += j;
        //         currentSet.add(j);

        //         // If we reach the required sum, add this sequence to result
        //         if (sum == N) {
        //             result.add(new ArrayList<>(currentSet));
        //             count++;
        //             break;
        //         }
        //     }
        // }

        // // Print each set of numbers
        // for (List<Integer> set : result) {
        //     for (int num : set) {
        //         System.out.print(num + " ");
        //     }
        //     System.out.println();
        // }

        // // Print the count of sets found
        // System.out.println(count);
        // int[] arr = { 10 ,45 , 6};
        // System.out.println(min(arr));
        int[] test = new int[15];
        for(int i=0;i<test.length;i++){
            System.out.println(test[i]);
        }
    }
}
