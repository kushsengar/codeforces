import java.util.Scanner;

/**
 * D_Slavic_s_Exam
 */
public class D_Slavic_s_Exam {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine(); // consume the newline character

        for (int i = 0; i < t; i++) {
            String s = scanner.nextLine();
            String tString = scanner.nextLine();
            int ti = 0;
            StringBuilder sb = new StringBuilder(s);

            for (int j = 0; j < sb.length(); j++) {
                char c = sb.charAt(j);
                if (c == '?' && ti < tString.length()) {
                    sb.setCharAt(j, tString.charAt(ti));
                    ti++;
                } else if (c != '?' && ti < tString.length() && c == tString.charAt(ti)) {
                    ti++;
                }
            }

            if (ti == tString.length()) {
                System.out.println("YES");
                System.out.println(sb.toString());
            } else {
                System.out.println("NO");
            }
        }
    }
}