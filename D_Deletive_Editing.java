import java.util.*;
public class D_Deletive_Editing{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-->0) {
            String s = sc.next();
            String p = sc.next();
            int [] freq1 = new int[26];
            int [] freq2 = new int[26];
            for (int i = 0; i < s.length(); i++) {
                freq1[s.charAt(i) - 'A']++;
            }
            for(int i =0;i<p.length();i++){
                freq2[p.charAt(i) - 'A']++;
            }
            
             int i = 0, j =0;
             while (i<s.length() && j<p.length()) {
                if (s.charAt(i)==p.charAt(j)) {
                    if (freq1[s.charAt(i)-'A'] < freq2[p.charAt(j)-'A']) {
                        break;
                    }
                    if (freq1[s.charAt(i)-'A'] == freq2[p.charAt(j)-'A']) {
                        freq2[p.charAt(j)-'A']--;
                        j++;
                    }
                }
                freq1[s.charAt(i)-'A']--;
                i++;
             }
             if(j==p.length()){
                System.out.println("YES");
             }else{
                System.out.println("NO");
             }
        }
    }
}