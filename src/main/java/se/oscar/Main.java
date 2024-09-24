package se.oscar;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
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
        System.out.println("The game is starting. . ." + "\n");

        do {
            System.out.println("Player 1");
        } while (round < 4);
    }
}