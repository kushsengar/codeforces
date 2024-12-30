import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JustifyWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        sc.nextLine();
        List<String> words = new ArrayList<>();
        for (int i = 0; i < K; i++) {
            words.add(sc.nextLine());
        }
        int N = sc.nextInt();
        int M = sc.nextInt();
        System.out.println(maxWordsInLines(words, N, M));
        sc.close();
    }

    private static int maxWordsInLines(List<String> words, int N, int M) {
        int count = 0;
        int linesUsed = 0;
        int currentLineLength = 0;
        int wordsInCurrentLine = 0;

        for (String word : words) {
            if (currentLineLength + word.length() + (wordsInCurrentLine > 0 ? 1 : 0) <= M) {
                currentLineLength += word.length();
                wordsInCurrentLine++;
            } else {
                linesUsed++;
                currentLineLength = word.length();
                wordsInCurrentLine = 1;
            }
            if (linesUsed >= N) break;
        }
        if (linesUsed < N) linesUsed++;
        count = wordsInCurrentLine + (linesUsed - 1) * N;
        return count;
    }
}
