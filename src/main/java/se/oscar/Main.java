package se.oscar;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int round = 1;

        System.out.println("""
                Welcome to the dice game!
                       ***********
                """);
        System.out.println("Enter Player 1 name:");
        Player player1 = new Player(scan.next());

        System.out.println("Enter Player 2 name:");
        Player player2 = new Player(scan.next());

        System.out.println("""
                Choose who starts:
                1: Player 1
                2: Player 2
                """);
        switch (scan.nextInt()) {
            case 1:
                game.setTurn(true);
                break;
            case 2:
                game.setTurn(false);
                break;
        }

        System.out.println("The game is starting. . ." + "\n");

        do {
            if (game.getTurn()) {
                player1.enterPrompt();
                player1.throwDice(random);
                game.changeTurn();
            } else {
                player2.enterPrompt();
                player2.throwDice(random);
                game.changeTurn();
            }
            round++;
        } while (round <= 4);

        game.Winner(player1, player2);
    }
}