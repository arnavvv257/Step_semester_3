import java.util.LinkedHashMap;
import java.util.Map;

public class UniqueLetterHunt {

    public static char findFirstNonRepeatingChar(String text) {
        Map<Character, Integer> frequencyMap = new LinkedHashMap<>();
        
        // Compute frequency of every character
        for (char c : text.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }
        
        // Find the first character with frequency 1
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        
        // Return null character if none found
        return '\0'; 
    }

    public static void main(String[] args) {
        String[] testCases = {"swiss", "aabbcc"};
        
        for (String text : testCases) {
            char result = findFirstNonRepeatingChar(text);
            System.out.printf("Input: \"%s\"\n", text);
            if (result != '\0') {
                System.out.println("Output: First Non-Repeating Character: '" + result + "'\n");
            } else {
                System.out.println("Output: No Non-Repeating Character Found\n");
            }
        }
    }
}