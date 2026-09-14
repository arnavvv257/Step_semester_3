public class ExamHallChecker {

    public static void checkDuplicateSeats(int[] seatNumbers) {
        boolean duplicateFound = false;
        int n = seatNumbers.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (seatNumbers[i] == seatNumbers[j]) {
                    System.out.println("Duplicate Seat Number Found: " + seatNumbers[i]);
                    duplicateFound = true;
                    // Breaking here avoids printing the same pair multiple times
                    break; 
                }
            }
        }

        if (!duplicateFound) {
            System.out.println("No Duplicate Seats Found");
        }
    }

    public static void main(String[] args) {
        System.out.println("Test Case 1:");
        int[] test1 = {101, 102, 103, 102, 105};
        checkDuplicateSeats(test1);

        System.out.println("\nTest Case 2:");
        int[] test2 = {101, 102, 103, 104, 105};
        checkDuplicateSeats(test2);
    }
}