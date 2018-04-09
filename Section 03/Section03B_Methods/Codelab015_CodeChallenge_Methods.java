package Section03B_Methods;

public class Codelab015_CodeChallenge_Methods {

    public static void main(String[] args) {

        // ----- CHALLENGE:
        /*
         * Create a method called displayHighScorePosition
         * it should take a players name as a parameter, and a 2nd parameter as a position in the high score table
         * You should display a players name along with a message like "managed to get in position " and the
         * position they got and a further message " on the high score table".
         *
         * Create a second method called calculateHighScorePosition
         * it should be sent one argument only, the player score
         * it should return an int
         * the return data should be:
         * 1: if the score is >1000
         * 2: if the score is >500; <1000
         * 3: if the score is >100; <500
         * 4: in all other cases
         *
         * Call both methods and display the results in the following:
         * score = 1500
         * score = 900
         * score = 400
         * score = 50
         *
         */

        int highScore = calculateScore(true, 800, 5, 100);
        calculateScore(true, 10000, 8, 200);
        System.out.println("Your final score was " + highScore);

        int score1 = calculateHighScorePosition(1500);
        int score2 = calculateHighScorePosition(900);
        int score3 = calculateHighScorePosition(400);
        int score4 = calculateHighScorePosition(50);
        displayHighScorePosition("Zorf", score1);
        displayHighScorePosition("Honingkonijn", score2);
        displayHighScorePosition("lavendelmuisje", score3);
        displayHighScorePosition("ThijmTijger", score4);
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }
        return -1;
    }

    public static int calculateHighScorePosition(int score) {
        if (score >= 1000) {
            return 1;
        } else if ((score >= 500) && (score < 1000)) {
            return 2;
        } else if ((score >= 100) && (score < 500)) {
            return 3;
        } else {
            return 4;
        }
    }

    public static void displayHighScorePosition(String playerName, int positionTable) {
        System.out.println(playerName + " managed to get in position " + positionTable + " on the high score table.");
    }

}
