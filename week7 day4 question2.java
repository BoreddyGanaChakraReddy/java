import java.util.Scanner;

public class ReverseWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String inputString = sc.nextLine();
        sc.close();

        if (inputString == null || inputString.matches(".*\\d.*")) {
            System.out.println("Invalid input");
            return;
        }

        String[] words = inputString.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            StringBuilder reverseWord = new StringBuilder(word.toLowerCase());
            reverseWord.reverse();
            result.append(reverseWord).append(" ");
        }

        System.out.println(result.toString().trim()); 
    }
}
