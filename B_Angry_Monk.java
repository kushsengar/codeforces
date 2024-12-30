/**
 * B_Angry_Monk
 */
import java.util.*;
public class B_Angry_Monk {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n  = sc.nextInt();
            int k = sc.nextInt();
           ArrayList<Integer> arr = new ArrayList<>();
            for(int i=0;i<k;i++){
                arr.add(sc.nextInt());
            }
              Collections.sort(arr);

                 while (arr.size()!=1) {
                    if (arr.get(0)==1) {
                        arr.set(n-1, arr.get(0)+arr.get(n-1));
                        }
                        else {
                            arr.set(i+1, arr.get(i)-1);
                            arr.set(i,1);
                        }
                 }
                
                //Collections.sort(arr);
              }


        }
        

        
            }
        }
      