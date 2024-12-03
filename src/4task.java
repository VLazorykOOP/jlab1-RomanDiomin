import java.util.ArrayList;
import java.util.Scanner;

public class LexicographicWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть текст:");
        String text = scanner.nextLine();

        String[] words = text.split("[\\s.,!?;:]+");

        ArrayList<String> lexicographicWords = new ArrayList<>();
        for (String word : words) {
            if (isLexicographicallyOrdered(word)) {
                lexicographicWords.add(word);
            }
        }

        if (lexicographicWords.isEmpty()) {
            System.out.println("У тексті немає слів з літерами в лексикографічному порядку.");
        } else {
            System.out.println("Слова з літерами в лексикографічному порядку:");
            for (String word : lexicographicWords) {
                System.out.println(word);
            }
        }

        scanner.close();
    }

    public static boolean isLexicographicallyOrdered(String word) {
        for (int i = 1; i < word.length(); i++) {
            if (word.charAt(i) < word.charAt(i - 1)) {
                return false;
            }
        }
        return true;
    }
}
