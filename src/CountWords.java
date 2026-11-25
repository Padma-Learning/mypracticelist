import java.util.Scanner;

public class CountWords {

    static void main() {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine().trim();
        if (text.isEmpty()) {
            System.out.println(0);
        } else {
            //\\s means represents any whitespace character and + means matches one or more occurrences
            String[] words = text.split("\\s+");
            for (String word : words) {
                System.out.println(word);
            }
            System.out.println(words.length);

        }
    }
}
