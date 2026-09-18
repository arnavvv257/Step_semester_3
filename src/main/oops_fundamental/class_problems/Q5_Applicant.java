package OOP_Fundamentals.class_problems;

public class Q5_Applicant {
    static int totalApplicants = 0;

    public Q5_Applicant() {
        totalApplicants++;
    }

    public static void main(String[] args) {
        Q5_Applicant applicant1 = new Q5_Applicant();
        Q5_Applicant applicant2 = new Q5_Applicant();
        Q5_Applicant applicant3 = new Q5_Applicant();

        System.out.println("Total applicants: " + Q5_Applicant.totalApplicants);
    }
}
