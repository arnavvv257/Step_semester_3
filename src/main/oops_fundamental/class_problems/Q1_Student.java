package OOP_Fundamentals.class_problems;

public class Q1_Student {
    String name;
    int marks;

    public static void main(String[] args) {
        Q1_Student student = new Q1_Student();

        student.name = "Divya";
        student.marks = 88;

        System.out.println("Name: " + student.name + " | Marks: " + student.marks);
    }
}
