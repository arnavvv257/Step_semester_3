package string_operations_performance.assignment_problems;

public class Q4_LibraryISBNNormalizer {
    static String normalizeCode(String raw) {
        raw = raw.trim();

        if (raw.length() < 3) {
            return raw.toUpperCase();
        }

        return raw.substring(0, 3).toUpperCase() + raw.substring(3);
    }

    static String validateAndFormat(String code) {
        if (code.length() != 13) {
            return "Invalid — wrong length";
        }

        String publisher = code.substring(0, 3);
        String body = code.substring(3);

        for (int i = 0; i < 3; i++) {
            if (!Character.isLetter(publisher.charAt(i))) {
                return "Invalid — publisher code must be 3 letters";
            }
        }

        for (int i = 0; i < body.length(); i++) {
            if (!Character.isDigit(body.charAt(i))) {
                return "Invalid — non-digit body";
            }
        }

        String year = body.substring(0, 4);
        String catalog = body.substring(4);

        return "[" + publisher + "] YEAR: " + year +
                " | CATALOG: " + catalog;
    }

    public static void main(String[] args) {
        String code = normalizeCode("abc2026123456");
        System.out.println(validateAndFormat(code));
    }
}
