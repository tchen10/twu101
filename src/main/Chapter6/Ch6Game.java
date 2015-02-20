import java.util.ArrayList;

public class Ch6Game {
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
            Ch6Guess newGuess = new Ch6Guess();
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
