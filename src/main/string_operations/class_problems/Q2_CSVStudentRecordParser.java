package string_operations_performance.class_problems;

public class Q2_CSVStudentRecordParser {
    static void parseStudentRecord(String csvLine) {
        String[] fields = csvLine.split(",");

        if (fields.length != 3) {
            System.out.println("Invalid Record");
            return;
        }

        System.out.println("Name: " + fields[0] +
                " | Roll No: " + fields[1] +
                " | Dept: " + fields[2]);
    }

    public static void main(String[] args) {
        parseStudentRecord("Divya,101,CSE");
    }
}
