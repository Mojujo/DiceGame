package se.oscar;

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

                case 2:

            }
        }
    }

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
