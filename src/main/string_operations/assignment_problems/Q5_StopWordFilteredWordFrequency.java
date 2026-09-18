package string_operations_performance.assignment_problems;

import java.util.HashMap;
import java.util.Map;

public class Q5_StopWordFilteredWordFrequency {
    static void printFilteredWordFrequency(String feedback) {
        String[] stopWords = {"the", "was", "and", "a", "is", "of", "in"};

        feedback = feedback.toLowerCase();
        feedback = feedback.replace(".", "")
                           .replace(",", "")
                           .replace("!", "")
                           .replace("?", "");

        String[] words = feedback.split("\\s+");

        HashMap<String, Integer> frequency = new HashMap<>();

        for (String word : words) {
            boolean stopWord = false;

            for (String stop : stopWords) {
                if (word.equals(stop)) {
                    stopWord = true;
                    break;
                }
            }

            if (!stopWord && !word.isEmpty()) {
                frequency.put(word, frequency.getOrDefault(word, 0) + 1);
            }
        }

        while (!frequency.isEmpty()) {
            String highestWord = null;
            int highestCount = -1;

            for (Map.Entry<String, Integer> entry : frequency.entrySet()) {
                if (entry.getValue() > highestCount) {
                    highestCount = entry.getValue();
                    highestWord = entry.getKey();
                }
            }

            System.out.println(highestWord + ": " + highestCount);
            frequency.remove(highestWord);
        }
    }

    public static void main(String[] args) {
        printFilteredWordFrequency("The movie was good and the movie was fun.");
    }
}
