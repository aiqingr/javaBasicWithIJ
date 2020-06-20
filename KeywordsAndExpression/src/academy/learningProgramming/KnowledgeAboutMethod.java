package academy.learningProgramming;

public class KnowledgeAboutMethod {
    public static void main(String[] args) {

        calculateScore(true, 100, 2, 90);

        calculateScore(true,200, 3, 10);

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
            return finalScore;
        } else {
            // in algorithm, -1 means value is not found
            return -1;
        }
    }
}
