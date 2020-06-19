package academy.learningProgramming;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }

        // Print out a second score on the screen with the following
        // Score set to 10000
        // levelCompleted set to 8
        // bonus set to 200
        // But make sure tje first printout above still display as well
        int score2 = 10000;
        int levelCompleted2 = 8;
        int bonus2 = 200;
        if(gameOver) {
            int finalScore = score2 + (levelCompleted2 * bonus2);
            System.out.println("Your second score was " + finalScore);
        }
    }
}
