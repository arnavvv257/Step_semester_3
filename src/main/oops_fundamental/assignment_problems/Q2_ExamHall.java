package OOP_Fundamentals.assignment_problems;

public class Q2_ExamHall {
    String hallName;
    int seatsFilled;

    public static void main(String[] args) {
        Q2_ExamHall hallA = new Q2_ExamHall();
        Q2_ExamHall hallB = new Q2_ExamHall();

        hallA.hallName = "Block-3 Hall A";
        hallB.hallName = "Block-3 Hall B";

        hallA.seatsFilled++;
        hallA.seatsFilled++;
        hallA.seatsFilled++;
        hallA.seatsFilled++;

        System.out.println(hallA.hallName + " seatsFilled: " + hallA.seatsFilled);
        System.out.println(hallB.hallName + " seatsFilled: " + hallB.seatsFilled);
    }
}
