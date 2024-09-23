package se.oscar;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("""
                Welcome to the dice game!
                       ***********
                
                To start, press 1:
                If u wish to exit, press 2:
                """);
        switch (scan.nextInt()) {
            case 1:
                System.out.println("Enter Player 1 name:");
                Player player1 = new Player(scan.next());
                System.out.println("Enter Player 2 name:");
                Player player2 = new Player(scan.next());
                System.out.println("The dice game is starting. . .");
                Game game = new Game(player1, player2);
                game.start();

                break;
            case 2:
                System.out.println("Thank you for playing!");
                break;
        }
    }
}