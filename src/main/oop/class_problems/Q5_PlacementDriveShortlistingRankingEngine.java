import java.util.Arrays;

public class Q5_PlacementDriveShortlistingRankingEngine {

    static class Candidate implements Comparable<Candidate> {
        private String name;
        private double cgpa;
        private int codingScore;

        public Candidate(String name, double cgpa, int codingScore) {
            this.name = name;
            this.cgpa = cgpa;
            this.codingScore = codingScore;
        }

        // Strong CGPA alone is enough.
        static boolean isEligible(double cgpa) {
            return cgpa >= 7.5;
        }

        // Borderline CGPA can qualify with a strong coding score.
        static boolean isEligible(double cgpa, int codingScore) {
            return cgpa >= 6.5 && codingScore >= 60;
        }

        // Composite score chosen to match the assignment example:
        // CGPA contributes 10 points per CGPA unit,
        // coding score contributes 0.5 points per mark.
        private double compositeScore() {
            return cgpa * 10 + codingScore * 0.5;
        }

        @Override
        public int compareTo(Candidate other) {
            return Double.compare(other.compositeScore(), this.compositeScore());
        }

        private String getResult() {
            return name + " (" + compositeScore() + ")";
        }
    }

    static String shortlistAndRank(Candidate[] candidates) {
        Candidate[] shortlisted = new Candidate[candidates.length];
        int count = 0;

        for (Candidate candidate : candidates) {
            if (isEligible(candidate.cgpa)
                    || isEligible(candidate.cgpa, candidate.codingScore)) {
                shortlisted[count] = candidate;
                count++;
            }
        }

        Candidate[] result = Arrays.copyOf(shortlisted, count);
        Arrays.sort(result);

        String output = "";

        for (int i = 0; i < result.length; i++) {
            if (i > 0) {
                output += " | ";
            }

            output += (i + 1) + ". " + result[i].getResult();
        }

        return output;
    }

    public static void main(String[] args) {
        Candidate[] candidates = {
            new Candidate("Aisha", 8.2, 40),
            new Candidate("Rohit", 6.8, 65),
            new Candidate("Meena", 6.0, 90),
            new Candidate("Karan", 7.5, 20)
        };

        System.out.println(shortlistAndRank(candidates));
    }
}