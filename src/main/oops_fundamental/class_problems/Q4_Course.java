package OOP_Fundamentals.class_problems;

public class Q4_Course {
    String code;
    String title;

    public Q4_Course(String code, String title) {
        this.code = code;
        this.title = title;
    }

    public static void main(String[] args) {
        Q4_Course course = new Q4_Course("21CSC201J", "Data Structures");

        System.out.println(course.code + " - " + course.title);
    }
}
