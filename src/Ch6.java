// Create a new version of the Chapter 5 problem where you also record all of the users guesses
// and print them out once they guess correctly. Use an ArrayList to store the guesses.

import java.util.Scanner;
import java.util.ArrayList;

public class Ch6 {
    public static void main (String[] args) {
        Game game = new Game();
        game.setUpGame();
        game.playGame();
    }
}

class Game {
    private int answer;
    private boolean isPlaying = false;
    private ArrayList<Integer> guessedList = new ArrayList<Integer>();

    public void setUpGame() {
        isPlaying = true;
        answer = (int) (Math.random() * 100);
        System.out.println("We picked a number between 1 and 100. You get to try and guess the number.");
        System.out.println("We'll tell you if your guess is too high or too low. Good Luck!");
    }

    public void playGame() {
        while (isPlaying) {
            Guess newGuess = new Guess();
            guessedList.add(newGuess.getUserGuess());
            if (newGuess.checkUserGuess(answer)) {
                isPlaying = false;
            }
        }
        System.out.println("You win!");
        printGuessedList();
    }

    public void printGuessedList() {
        System.out.print("Your guesses: ");
        for (int guessedAnswer: guessedList) {
            System.out.print(guessedAnswer + " ");
        }
        System.out.print("\n");
    }
}

class Guess {
    private int userGuess;
    private boolean isAnswer = false;

    public int getUserGuess() {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Guess a number between 1 and 100 : ");
        userGuess = userInput.nextInt();
        return userGuess;
    }

    public boolean checkUserGuess (int answer) {
        if (userGuess > answer) {
            System.out.println("Your guess is too high.");
        }
        if (userGuess < answer) {
            System.out.println("Your guess is too low.");
        }
        if (userGuess == answer) {
            isAnswer = true;
        }
        return isAnswer;
    }

}