public class CustomerVerification {

    public static String reverseCustomerName(String customerName) {
        char[] characters = customerName.toCharArray();
        StringBuilder reversed = new StringBuilder();
        
        for (int i = characters.length - 1; i >= 0; i--) {
            reversed.append(characters[i]);
        }
        
        return reversed.toString();
    }

    public static void main(String[] args) {
        String originalName = "Sunil";
        String reversedName = reverseCustomerName(originalName);
        
        System.out.println("Input: \"" + originalName + "\"");
        System.out.println("Output:");
        System.out.println("Original Name: " + originalName);
        System.out.println("Reversed Name: " + reversedName);
    }
}