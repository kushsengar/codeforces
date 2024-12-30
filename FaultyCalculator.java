import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FaultyCalculator {
    private static final Map<Character, String[]> segmentMap = new HashMap<>();
static {
        segmentMap.put('0', new String[]{" _ ", "| |", "|_|"});
        segmentMap.put('1', new String[]{"   ", "  |", "  |"});
        segmentMap.put('2', new String[]{" _ ", " _|", "|_ "});
        segmentMap.put('3', new String[]{" _ ", " _|", " _|"});
        segmentMap.put('4', new String[]{"   ", "|_|", "  |"});
        segmentMap.put('5', new String[]{" _ ", "|_ ", " _|"});
        segmentMap.put('6', new String[]{" _ ", "|_ ", "|_|"});
        segmentMap.put('7', new String[]{" _ ", "  |", "  |"});
        segmentMap.put('8', new String[]{" _ ", "|_|", "|_|"});
        segmentMap.put('9', new String[]{" _ ", "|_|", " _|"});
        segmentMap.put('+', new String[]{"   ", " | ", " | "});
        segmentMap.put('-', new String[]{"   ", "   ", " | "});
        segmentMap.put('%', new String[]{" _ ", " _|", " _|"});
        segmentMap.put('=', new String[]{"   ", "|_|", "|_|"});
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine(); // Consume the newline
        String[] display = new String[3];
        for (int i = 0; i < 3; i++) {
            display[i] = scanner.nextLine();
        }
        char[] displayedChars = new char[N];
        for (int i = 0; i < N; i++) {
            String[] segment = new String[3];
            segment[0] = display[0].substring(i * 3, i * 3 + 3);
            segment[1] = display[1].substring(i * 3, i * 3 + 3);
            segment[2] = display[2].substring(i * 3, i * 3 + 3);
            displayedChars[i] = identifyCharacter(segment);
        }
        String equation = new String(displayedChars);
        String[] parts = equation.split("=");
        String leftSide = parts[0];
        String rightSide = parts[1];
        int leftResult = evaluateLeftSide(leftSide);
        int rightResult = Integer.parseInt(rightSide);
        for (int i = 0; i < N; i++) {
            char originalChar = displayedChars[i];
            for (char c : segmentMap.keySet()) {
                if (c != originalChar) {
                    displayedChars[i] = c;
                    String newEquation = new String(displayedChars);
                    parts = newEquation.split("=");
                    leftSide = parts[0];
                    leftResult = evaluateLeftSide(leftSide);
                    rightSide = parts[1];
                    rightResult = Integer.parseInt(rightSide);
                    
                    if (leftResult == rightResult) {
                        System.out.println(i + 1); 
                        return;
                    }
                }
            }
            displayedChars[i] = originalChar; 
        }
        
 }
    

    private static char identifyCharacter(String[] segment) {
        for (Map.Entry<Character, String[]> entry : segmentMap.entrySet()) {
            if (entry.getValue()[0].equals(segment[0]) &&
                entry.getValue()[1].equals(segment[1]) &&
                entry.getValue()[2].equals(segment[2])) {
                return entry.getKey();
            }
        }
        return '?'; 
    }

    private static int evaluateLeftSide(String leftSide) {
        String[] tokens = leftSide.split("(?=[-+%*])|(?<=[-+%*])");
        int result = 0;
        int current = 0;
        char operator = '+';

        for (String token : tokens) {
            token = token.trim();
            if (token.isEmpty()) continue;

            if (Character.isDigit(token.charAt(0))) {
                current = Integer.parseInt(token);
            } else {
                operator = token.charAt(0);
                continue;
            }

            switch (operator) {
                case '+':
                    result += current;
                    break;
                case '-':
                    result -= current;
                    break;
                case '%':
                    result %= current;
                    break;
                case '*':
                    result *= current;
                    break;
            }
        }
        return result;
    }
}

