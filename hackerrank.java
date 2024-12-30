import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.*;

/**
 * hackerrank
 */
public class hackerrank {
 public static int maxPresentations(List<Integer> scheduleStart, List<Integer> scheduleEnd) {
    int n = scheduleStart.size();
    List<int[]> presentations = new ArrayList<>();
    for (int i = 0; i < n; i++) {
        presentations.add(new int[]{scheduleStart.get(i), scheduleEnd.get(i)});
    }
    presentations.sort(Comparator.comparingInt(a -> a[1]));
    int count = 0;
    int lastEndTime = 0;
    for (int[] presentation : presentations) {
        if (presentation[0] >= lastEndTime) {
            count++;
            lastEndTime = presentation[1];
        }
    }
    return count;
    }
    public static void main(String[] args) {
        List<Integer> ls1 = new ArrayList<>();
        List<Integer> ls2 = new ArrayList<>();
        ls1.add(1);
        ls1.add(1);

        ls1.add(2);
        ls1.add(3);
       
        ls2.add(2);
        ls2.add(3);
        ls2.add(3);
        ls2.add(4);
        System.out.println(maxPresentations(ls1, ls2));
    }
}