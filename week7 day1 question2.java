import java.util.Scanner;

public class WordOccurrence {
    public static void main(String[] args) {
        Scanner st = new Scanner(System.in);
        String paragraph = st.nextLine().toLowerCase();
        String word = st.next().toLowerCase();
        int n = st.nextInt();

        if (n <= 0) {
            System.out.println("Incorrect Input");
            return;
        }
        int count = 0;
        int index = -1;
        int lastOccurrenceIndex = -1;

        while (true) {
            index = paragraph.indexOf(word, index + 1);
            if (index == -1) {
                break; 
            }
            count++;
            if (count == n) {
                System.out.println(index);
                return;
            }
            lastOccurrenceIndex = index;
        }
        if (count == 0) {
            System.out.println("Not Present");
            return;
        }
        System.out.println(lastOccurrenceIndex);
    }
}
