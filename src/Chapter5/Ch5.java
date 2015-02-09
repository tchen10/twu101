// Write a program that chooses a random number between 1 and 100.
// Then asks the user to enter a guess. If they guess right then tell them they win,
// otherwise tell them if they guessed too high or low.
// Keep asking the user to guess until they get the right answer.
// Use classes to separate the different concerns of this program.

import java.util.Scanner;

public class Ch5 {
    public static void main (String[] args) {
        Game game = new Game();
        game.setUpGame();
        game.playGame();
    }
}

class Game {
    private int answer;
    private boolean isPlaying = false;

    public void setUpGame() {
        isPlaying = true;
        answer = (int) (Math.random() * 100);
        System.out.println("We picked a number between 1 and 100. You get to try and guess the number.");
        System.out.println("We'll tell you if you're too high or too low. Good Luck!");
    }

    public void playGame() {
        while (isPlaying) {
            Guess newGuess = new Guess();
            newGuess.getUserGuess();
            if (newGuess.checkUserGuess(answer)) {
                isPlaying = false;
                System.out.println("You win! Game over.");
            }
        }
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