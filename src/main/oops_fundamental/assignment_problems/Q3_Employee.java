package OOP_Fundamentals.assignment_problems;

public class Q3_Employee {
    String empName;
    double salary;
    boolean permanent;

    public static void main(String[] args) {
        Q3_Employee employee = new Q3_Employee();

        System.out.println("Name: " + employee.empName);
        System.out.println("Salary: " + employee.salary);
        System.out.println("Permanent: " + employee.permanent);
    }
}
