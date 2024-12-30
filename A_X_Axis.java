
import java.util.*;

public class A_X_Axis {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int x1=sc.nextInt();
            int x2=sc.nextInt();
            int x3=sc.nextInt();
            int nums[]={x1,x2,x3};
         int sum=Integer.MAX_VALUE;
            for(int i:nums){
                int x=Math.abs(i-x1);
                int y=Math.abs(i-x2);
                int z=Math.abs(i-x3);
                int ans=x+y+z;
            if(sum>ans){
                sum=x;        }
            }
            System.out.println(sum);
    }
    
      }

    }
