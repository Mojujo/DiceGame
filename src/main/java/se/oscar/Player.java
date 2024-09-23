package se.oscar;
import java.util.Random;

public class Player {
    private String name;
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
    public void throwDice(Random random) {
        int roll = random.nextInt(6) + 1;
        score += roll;
        System.out.println("Player: " + name + " rolled: " + roll);
        System.out.println(name + " has " + score + " points");
    }
}
