import java.util.ArrayList;

public class Ch6Game {
    private int answer;
    private ArrayList<Integer> guessedList = new ArrayList<Integer>();

    public void setUpGame() {
        answer = (int) (Math.random() * 100);
        System.out.println("We picked a number between 1 and 100. You get to try and guess the number.");
        System.out.println("We'll tell you if your guess is too high or too low. Good Luck!");
    }

    public void playGame() {
        boolean isPlaying = true;
        while (isPlaying) {
            Ch6Guess newGuess = new Ch6Guess();
            guessedList.add(newGuess.getUserGuess());
            String guessState = newGuess.checkUserGuess(answer);
            if (guessState.equals("correct")) {
                isPlaying = false;
                System.out.println("That's right! You win! Game over.");
            } else {
                System.out.println("Your guess is " + guessState);
            }

        }
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
