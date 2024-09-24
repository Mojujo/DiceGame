package se.oscar;

import java.util.Random;
import java.util.Scanner;

public class Player {
    private final String name;
    private int score;

    public Player(String name) {
        this.name = name;
        this.score = 0;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    //THROW DICE
    public void throwDice(Random random) {
        int roll = random.nextInt(6) + 1;
        score += roll;
        System.out.println("Player: " + name + " rolled: " + roll);
        System.out.println(name + " has " + score + " points" + "\n");
    }

    //PLAYER PROMPT
    public void enterPrompt() {
        Scanner scan = new Scanner(System.in);
        System.out.println(name + "'s turn");
        System.out.println("Press enter to throw the dice");
        scan.nextLine();
    }
}
