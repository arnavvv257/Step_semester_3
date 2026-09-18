package OOP_Fundamentals.class_problems;

public class Q3_LibraryCard {
    String holderName;
    int booksIssued;
    boolean active;

    public static void main(String[] args) {
        Q3_LibraryCard card = new Q3_LibraryCard();

        System.out.println("Holder: " + card.holderName);
        System.out.println("Books Issued: " + card.booksIssued);
        System.out.println("Active: " + card.active);
    }
}
