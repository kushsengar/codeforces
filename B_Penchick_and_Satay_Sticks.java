import java.util.Scanner;

public class B_Penchick_and_Satay_Sticks {
    public static boolean isSorted(int[] nums){
        boolean flag = true;
        for(int j=0;j<nums.length-1;j++){
            if(nums[j]>nums[j+1]){
                flag = false;
                break;
            }
        }
        return flag;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            for(int i=0;i<n-1;i++){
                if (arr[i]-arr[i+1]==1) {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1]= temp;
                }
            }
           System.out.println(isSorted(arr)?"YES" : "NO");
            }

        }
    }
