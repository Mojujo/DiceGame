package se.oscar;

import java.util.Random;
import java.util.Scanner;

public class Game {
    private final Scanner scan = new Scanner(System.in);
    private final Random random = new Random();
    private boolean state;

    //WINNING CONDITION
    public void winner(Player player1, Player player2) {
        if (player1.getScore() > player2.getScore()) {
            System.out.println(player1.getName() + " wins with " + player1.getScore() + " points");
        } else if (player2.getScore() > player1.getScore()) {
            System.out.println(player2.getName() + " wins with " + player2.getScore() + " points");
        } else {
            System.out.println("You tie with: " + player1.getScore() + " points");
        }
    }

    // CHECK DRAW
    public void draw(Player player1, Player player2) {
        if (player1.getScore() == player2.getScore()) {
            System.out.println("""
                    You are currently tied, do you want to:
                    1: Continue another round
                    2: Exit and tie
                    """);
            switch (scan.nextInt()) {
                case 1:
                    scan.nextLine();

                    enterPrompt(player1);
                    throwDice(player1);
                    enterPrompt(player2);
                    throwDice(player2);

                    draw(player1, player2); // CHECK FOR DRAW &LOOP
                    break;
                case 2:
                    break;
            }
        }
    }

    // THROW DICE
    public void throwDice(Player player) {
        int roll = random.nextInt(6) + 1;
        player.setScore(player.getScore() + roll);
        System.out.println("Player: " + player.getName() + " rolled: " + roll);
        System.out.println(player.getName() + " has " + player.getScore() + " points" + "\n");
    }

    // ENTER PROMPT
    public void enterPrompt(Player player) {
        System.out.println(player.getName() + "'s turn");
        System.out.println("Press enter to throw the dice");
        scan.nextLine();
    }

    // TURN MECHANICS
    public void setTurn() {
        System.out.println("""
                Choose who starts:
                1: Player 1
                2: Player 2""");
        switch (scan.nextInt()) {
            case 1:
                state = true;
                break;
            case 2:
                state = false;
                break;
        }
        scan.nextLine();
    }

    public void changeTurn() {
        state ^= true;
    }

    public boolean getTurn() {
        return state;
    }
}
