public class Q5_EmployeeCompanyInformationManagement {
    static class Employee {
        String empName;
        double salary;

        static String companyName = "Bright Horizon Technologies";
        static int employeeCount = 0;

        Employee(String empName, double salary) {
            this.empName = empName;
            this.salary = salary;
            employeeCount++;
        }

        static void printCompanyInfo() {
            System.out.println(companyName);
            System.out.println("Employees on record: " + employeeCount);
        }
    }

    public static void main(String[] args) {
        new Employee("Ravi", 50000);
        new Employee("Anitha", 60000);
        new Employee("Karthik", 55000);

        Employee.printCompanyInfo();
    }
}
