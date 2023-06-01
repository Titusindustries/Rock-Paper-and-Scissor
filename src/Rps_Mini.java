import java.util.Random;
import java.util.Scanner;

public class Rps_Mini {
    public static void main(String[] args) {
        Scanner game = new Scanner(System.in);
        Random random = new Random();
        int playerMove = 0;
        int computerMove = 0;

        System.out.print("Enter the round you want to play: ");
        int rounds = game.nextInt();

        for (int round = 1; round <= rounds; round++) {
            System.out.println("Rounds set is: " + rounds);
            System.out.println("Let's play Rock,Paper and Scissor game with " + rounds + " round of game");
            System.out.println("Player enter your move: ");
            int player = game.nextInt();
            System.out.println("Player move is: " +getPlayer(player));

            int computer = random.nextInt(3) + 1;
            System.out.println("Computer's move is: " + getMove(computer));

            if (player == computer) {
                System.out.println("It's a tie!");
            } else if ((player == 1 && computer == 3) || (player == 3 && computer == 2) || (player == 2 && computer == 3)) {
                System.out.println("Player Won this Round!");
                playerMove++;
            } else {
                System.out.println("Computer Won this Round!");
                computerMove++;
            }
        }
        System.out.println("Game has been over!");
        System.out.print("Player Score is: " + playerMove);
        System.out.println();
        System.out.print("Computer Score is: " + computerMove);
        System.out.println();

        if (playerMove < computerMove) {
            System.out.println("Computer Won the Game");
        } else if (playerMove > computerMove) {
            System.out.println("Player Won the Game!");
        } else {
            System.out.println("The Game ended in a Draw!");
        }
    }
    public static String getMove(int move) {
        return switch (move) {
            case 1 -> "Rock";
            case 2 -> "Paper";
            case 3 -> "Scissor";
            default -> "Invalid Move";
        };
    }
    public static String getPlayer(int moves) {
        return switch (moves) {
            case 1 -> "Rock";
            case 2 -> "Paper";
            case 3 -> "Scissor";
            default -> "Invalid move!";
        };
    }
}