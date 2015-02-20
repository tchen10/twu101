import java.util.Scanner;

public class Ch6Guess {
    private int userGuess;

    public int getUserGuess() {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Guess a number between 1 and 100 : ");
        userGuess = userInput.nextInt();
        return userGuess;
    }

    public String checkUserGuess (int answer) {
        String guessState = "";
        if (userGuess > answer) {
            guessState = "too high";
        }
        if (userGuess < answer) {
            guessState = "too low";
        }
        if (userGuess == answer) {
            guessState = "correct";
        }
        return guessState;
    }
}
