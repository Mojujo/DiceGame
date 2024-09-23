package se.oscar;

import java.util.Random;
import java.util.Scanner;

public class Game {
    private final Player player1;
    private final Player player2;
    private int round = 1;

    public Game(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        while (round <= 4) {
            System.out.println();
            if (round % 2 != 0) {
                System.out.println("Player 1: " + player1.getName() + " throws the dice. . .");
                System.out.println(player1.getName() + " rolls a: " + throwDice());

            } else {
                System.out.println("Player 2: " + player2.getName() + " throws the dice. . .");
                System.out.println(player2.getName() + " rolls a: " + throwDice());
            }
            round++;
        }
    }
    public int throwDice() {
        Random random = new Random();
        return random.nextInt(6) + 1;
    }
}
