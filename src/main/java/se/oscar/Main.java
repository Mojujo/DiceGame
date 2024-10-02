package se.oscar;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        Scanner scan = new Scanner(System.in);
        int round = 1;

        System.out.println("""
                Welcome to the dice game!
                       ***********
                """);

        System.out.println("Enter Player 1 name:");
        Player player1 = new Player(scan.next());

        System.out.println("Enter Player 2 name:");
        Player player2 = new Player(scan.next());

        game.setTurn();

        System.out.println("The game is starting. . ." + "\n");

        do { //GAME SEQUENCE
            if (game.getTurn()) {
                game.enterPrompt(player1);
                game.throwDice(player1);
                game.changeTurn();
            } else {
                game.enterPrompt(player2);
                game.throwDice(player2);
                game.changeTurn();
            }
            if (round == 4) {
                game.draw(player1, player2);
            }
            round++;
        } while (round <= 4);
        game.winner(player1, player2);
    }
}