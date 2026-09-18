package string_operations_performance.class_problems;

public class Q4_MaskedPhoneNumberFormatter {
    static String maskPhoneNumber(String phone) {
        if (phone.length() != 10) {
            return "Invalid phone number";
        }

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < 6; i++) {
            result.append('X');
        }

        result.append('-');
        result.append(phone.substring(6));

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(maskPhoneNumber("9876543210"));
    }
}
