package com.natirosh;

public class a5_03_Methods_3_challenge {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        displayHighScorePosition("Player1", calculateHighScorePosition(600));

        displayHighScorePosition("Player2", calculateHighScorePosition(300));

        displayHighScorePosition("Player3", calculateHighScorePosition(40));

        displayHighScorePosition("Player4", calculateHighScorePosition(5000));
    }

    public static void displayHighScorePosition(String playerName, int position) {
        System.out.println(playerName + " managed to get into position " + position + " on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore) {
//        if (playerScore >= 1000) {
//            return 1;
//        } else if (playerScore >= 500) {
//            return 2;
//        } else if (playerScore >= 100) {
//            return 3;
//        }
//        return 4;
    int position = 4;
    if (playerScore >= 1000) {
        position = 1;
    } else if (playerScore >= 500) {
        position = 2;
    } else if (playerScore >= 100) {
        position = 3;
    }
    return position;
    }

    public static int calculateScore(boolean gameOver, int score, int leverComplete, int bonus) {
        if (gameOver) {
            int finalScore = score + (leverComplete * bonus);
            finalScore += 1500;
            return finalScore;

        } else {
            return -1;
        }
    }

}
