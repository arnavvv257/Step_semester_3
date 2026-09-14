public class TypingAccuracyChecker {

    public static void checkTypingAccuracy(String original, String typed) {
        if (original == null || typed == null || original.length() != typed.length()) {
            System.out.println("Error: Strings must be of equal length and non-null.");
            return;
        }

        int matched = 0;
        int firstMismatchIndex = -1;
        int totalCharacters = original.length();

        for (int i = 0; i < totalCharacters; i++) {
            if (original.charAt(i) == typed.charAt(i)) {
                matched++;
            } else if (firstMismatchIndex == -1) {
                firstMismatchIndex = i; // Record the 0-based index of the first mistake
            }
        }

        double accuracy = ((double) matched / totalCharacters) * 100;

        System.out.printf("Matched: %d/%d | Accuracy: %.2f%%\n", matched, totalCharacters, accuracy);

        if (firstMismatchIndex != -1) {
            char expected = original.charAt(firstMismatchIndex);
            char actual = typed.charAt(firstMismatchIndex);
            // Convert to 1-based position for output
            System.out.printf("First Mismatch at position %d ('%c' vs '%c')\n", (firstMismatchIndex + 1), expected, actual);
        } else {
            System.out.println("No Mismatches");
        }
    }

    public static void main(String[] args) {
        System.out.println("Test Case 1:");
        checkTypingAccuracy("hello world", "hello worlt");

        System.out.println("\nTest Case 2:");
        checkTypingAccuracy("coding", "coding");
    }
}