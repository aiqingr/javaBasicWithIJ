package academy.learningProgramming;

public class MethodChallenge {
    /*
    TODO:
    Create a method called displayScorePosition
    it should a player's name as a parameter, and a 2nd parameter as a position in the high score table
     You should display the player along with a message like "managed to get into position" and the
    position they got and a further message "on the high score table".

    create a 2nd method called calculateHighScorePosition
    it should be sent one argument only, the player score
    it should return an int
     the return data should be
     1 if the score is > 1000
     2 if the score is  > 500 and  < 1000
     3 if the score is >100 and < 500
     4 in all other cases
     call both methods and display the results of the following
     a score of 1500, 900, 400 and 50
    */

    public static void main(String[] args) {
        displayHighScorePosition("Nick1", calculateHighScorePosition(1000));
        displayHighScorePosition("Nick2", calculateHighScorePosition(900));
        displayHighScorePosition("Nick3", calculateHighScorePosition(400));
        displayHighScorePosition("Nick4", calculateHighScorePosition(50));
        displayHighScorePosition("Nick5", calculateHighScorePosition(5000));


    }

    public static void displayHighScorePosition(String playerName, int position) {
        System.out.println(playerName + " managed to get into position " + position + " on the high score table.");
    }

    public static int calculateHighScorePosition(int playerScore) {
        if(playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500) {
            return 2;
        } else if (playerScore >= 100) {
            return 3;
        } else {
            return 4;
        }
    }
}
