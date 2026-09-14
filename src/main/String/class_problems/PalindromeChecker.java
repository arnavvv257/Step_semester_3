public class PalindromeChecker {

    public static boolean isPalindromeIterative(String text) {
        int left = 0;
        int right = text.length() - 1;
        while (left < right) {
            if (text.charAt(left) != text.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static boolean isPalindromeRecursive(String text) {
        if (text.length() <= 1) {
            return true;
        }
        if (text.charAt(0) != text.charAt(text.length() - 1)) {
            return false;
        }
        return isPalindromeRecursive(text.substring(1, text.length() - 1));
    }

    public static boolean isPalindromeArrayReversal(String text) {
        char[] arr = text.toCharArray();
        StringBuilder reversed = new StringBuilder();
        for (int i = arr.length - 1; i >= 0; i--) {
            reversed.append(arr[i]);
        }
        return text.equals(reversed.toString());
    }

    public static void main(String[] args) {
        String[] testCases = {"madam", "hello"};
        
        for (String text : testCases) {
            boolean iterative = isPalindromeIterative(text);
            boolean recursive = isPalindromeRecursive(text);
            boolean arrayRev = isPalindromeArrayReversal(text);
            
            String iterRes = iterative ? "Palindrome" : "Not Palindrome";
            String recRes = recursive ? "Palindrome" : "Not Palindrome";
            String arrRes = arrayRev ? "Palindrome" : "Not Palindrome";
            
            System.out.printf("Input: \"%s\"\n", text);
            System.out.printf("Iterative: %s | Recursive: %s | Array Reversal: %s\n\n", iterRes, recRes, arrRes);
        }
    }
}