package OOP_Fundamentals.assignment_problems;

public class Q1_Book {
    String title;
    double price;

    public static void main(String[] args) {
        Q1_Book book = new Q1_Book();

        book.title = "Clean Code";
        book.price = 650.0;

        System.out.println("Title: " + book.title + " | Price: Rs " + book.price);
    }
}
