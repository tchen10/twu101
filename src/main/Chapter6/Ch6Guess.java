import java.util.Scanner;

public class Ch6Guess {
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
