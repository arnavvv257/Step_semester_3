package OOP_Fundamentals.assignment_problems;

public class Q4_Product {
    String productId;
    String productName;

    public Q4_Product(String productId, String productName) {
        this.productId = productId;
        this.productName = productName;
    }

    public static void main(String[] args) {
        Q4_Product product = new Q4_Product("P-1042", "Wireless Mouse");

        System.out.println(product.productId + " - " + product.productName);
    }
}
