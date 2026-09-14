public class TrafficSignalAnalyzer {

    public static void findLongestStreak(String signalLog) {
        if (signalLog == null || signalLog.isEmpty()) {
            System.out.println("No signals recorded.");
            return;
        }

        int maxStreak = 0;
        char maxChar = signalLog.charAt(0);
        
        int currentStreak = 1;
        char currentChar = signalLog.charAt(0);

        for (int i = 1; i < signalLog.length(); i++) {
            if (signalLog.charAt(i) == currentChar) {
                currentStreak++;
            } else {
                if (currentStreak > maxStreak) {
                    maxStreak = currentStreak;
                    maxChar = currentChar;
                }
                currentChar = signalLog.charAt(i);
                currentStreak = 1;
            }
        }

        // Final check in case the longest streak is at the very end
        if (currentStreak > maxStreak) {
            maxStreak = currentStreak;
            maxChar = currentChar;
        }

        System.out.printf("Longest Streak: '%c' repeated %d times\n", maxChar, maxStreak);
    }

    public static void main(String[] args) {
        System.out.print("Input: \"RRGGGYRR\" | Output: ");
        findLongestStreak("RRGGGYRR");

        System.out.print("Input: \"RRRRYYGG\" | Output: ");
        findLongestStreak("RRRRYYGG");
    }
}