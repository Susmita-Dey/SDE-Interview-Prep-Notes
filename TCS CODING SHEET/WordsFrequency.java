import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordsFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] words = input.split(" ");

        Map<String, Integer> frequency = new HashMap<>();

        for (String word : words) {
            if (word.chars().allMatch(Character::isLetter)) {
                word = Character.toUpperCase(word.charAt(0)) + word.substring(1);
                frequency.put(word, frequency.getOrDefault(word, 0) + 1);
            }
        }

        for (Map.Entry<String, Integer> entry : frequency.entrySet()) {
            System.out.print(entry.getKey() + " " + entry.getValue() + " ");
        }
        sc.close();
    }
}
