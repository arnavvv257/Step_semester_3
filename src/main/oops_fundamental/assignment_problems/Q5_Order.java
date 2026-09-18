package OOP_Fundamentals.assignment_problems;

public class Q5_Order {
    static int totalOrders = 0;

    public Q5_Order() {
        totalOrders++;
    }

    public static void main(String[] args) {
        Q5_Order order1 = new Q5_Order();
        Q5_Order order2 = new Q5_Order();
        Q5_Order order3 = new Q5_Order();
        Q5_Order order4 = new Q5_Order();

        System.out.println("Total orders: " + Q5_Order.totalOrders);
    }
}
