package string_operations_performance.class_problems;

public class Q5_BankTransactionReferenceValidator {

    static String normalizeReference(String raw) {
        raw = raw.trim();

        if (raw.length() < 3) {
            return raw.toUpperCase();
        }

        return raw.substring(0, 3).toUpperCase() + raw.substring(3);
    }

    static String validateAndFormat(String reference) {
        if (reference.length() != 14) {
            return "Invalid — wrong length";
        }

        String bankCode = reference.substring(0, 3);
        String body = reference.substring(3);

        for (int i = 0; i < 3; i++) {
            char ch = bankCode.charAt(i);
            if (!Character.isLetter(ch)) {
                return "Invalid — bank code not 3 letters";
            }
        }

        for (int i = 0; i < body.length(); i++) {
            if (!Character.isDigit(body.charAt(i))) {
                return "Invalid — non-digit body";
            }
        }

        String date = body.substring(0, 6);
        String sequence = body.substring(6);

        return "[" + bankCode + "] DATE: " +
                date.substring(0, 2) + "/" +
                date.substring(2, 4) + "/" +
                date.substring(4, 6) +
                " | SEQ: " + sequence;
    }

    public static void main(String[] args) {
        String reference = normalizeReference("abc12092612345");
        System.out.println(validateAndFormat(reference));
    }
}
