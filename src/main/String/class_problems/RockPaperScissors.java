import java.util.*;

public class RockPaperScissors {

    static String playRound(String playerMove, String computerMove) {
        if (playerMove.equals(computerMove))
            return "Draw";

        if ((playerMove.equals("Rock") && computerMove.equals("Scissors")) ||
            (playerMove.equals("Paper") && computerMove.equals("Rock")) ||
            (playerMove.equals("Scissors") && computerMove.equals("Paper")))
            return "Player Wins";

        return "Computer Wins";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] moves = {"Rock", "Paper", "Scissors"};

        int rounds = 5, wins = 0, losses = 0, draws = 0;

        String[] player = new String[rounds];
        String[] computer = new String[rounds];
        String[] result = new String[rounds];

        for (int i = 0; i < rounds; i++) {
            System.out.print("Round " + (i + 1) +
                    " - Enter Rock, Paper or Scissors: ");
            player[i] = sc.next();

            computer[i] = moves[(int)(Math.random() * 3)];
            result[i] = playRound(player[i], computer[i]);

            if (result[i].equals("Player Wins"))
                wins++;
            else if (result[i].equals("Computer Wins"))
                losses++;
            else
                draws++;
        }

        System.out.println("\nRound | Player Move | Computer Move | Result");
        System.out.println("---------------------------------------------");

        for (int i = 0; i < rounds; i++)
            System.out.printf("%-5d | %-11s | %-13s | %s%n",
                    i + 1, player[i], computer[i], result[i]);

        double winPercentage = (wins * 100.0) / rounds;

        System.out.println("\nFinal Summary");
        System.out.printf("Wins: %d | Losses: %d | Draws: %d | Win %% = %.1f%%%n",
                wins, losses, draws, winPercentage);

        sc.close();
    }
}