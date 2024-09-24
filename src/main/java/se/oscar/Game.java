package se.oscar;

import java.util.Random;
import java.util.Scanner;

public class Game {
    private final Scanner scan = new Scanner(System.in);
    private boolean state;

    //WINNING CONDITION
    public void Winner(Player player1, Player player2) {
        if (player1.getScore() > player2.getScore()) {
            System.out.println(player1.getName() + " wins with " + player1.getScore() + " points");
        } else if (player2.getScore() > player1.getScore()) {
            System.out.println(player2.getName() + " wins with " + player2.getScore() + " points");
        } else {
            System.out.println("You tie with: " + player1.getScore() + " points");
        }
    }

    // IMPLEMENT DRAW
    public void Draw(Player player1, Player player2) {
        if (player1.getScore() == player2.getScore()) {
            System.out.println("""
                    You are currently tied, do you want to:
                    1: Continue another round
                    2: Exit and tie
                    """);
            switch (scan.nextInt()) {
                case 1:
                    enterPrompt(player1);
                    throwDice(player1);
                    enterPrompt(player2);
                    throwDice(player2);

                    Draw(player1, player2); // CHECK FOR DRAW &LOOP
                    break;
                case 2:
                    break;
            }
        }
    }

    // IMPLEMENT THROW DICE
    public void throwDice(Player player) {
        Random random = new Random();
        int roll = random.nextInt(6) + 1;
        player.setScore(player.getScore() + roll);
        System.out.println("Player: " + player.getName() + " rolled: " + roll);
        System.out.println(player.getName() + " has " + player.getScore() + " points" + "\n");
    }

    // IMPLEMENT PROMPT
    public void enterPrompt(Player player) {
        Scanner scan = new Scanner(System.in);
        System.out.println(player.getName() + "'s turn");
        System.out.println("Press enter to throw the dice");
        scan.nextLine();
    }

    // TURN MECHANICS
    public void setTurn(boolean turn) {
        state = turn;
    }

    public void changeTurn() {
        state ^= true;
    }

    public boolean getTurn() {
        return state;
    }
}
