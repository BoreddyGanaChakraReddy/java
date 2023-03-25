import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Map<Character, Integer> charFreqMap = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!isValid(c)) {
                System.out.println("Error");
                return;
            }
            charFreqMap.put(c, charFreqMap.getOrDefault(c, 0) + 1);
        }
        char maxChar = '\0';
        int maxFreq = 0;
        for (Map.Entry<Character, Integer> entry : charFreqMap.entrySet()) {
            if (entry.getValue() > maxFreq) {
                maxChar = entry.getKey();
                maxFreq = entry.getValue();
            }
        }
        System.out.println("Maximum occurring character is: " + maxChar);
    }
    public static boolean isValid(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9');
    }
}
