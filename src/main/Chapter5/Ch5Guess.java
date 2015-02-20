import java.util.Scanner;

public class Ch5Guess {

        private int getUserGuess() {
            Scanner userInput = new Scanner(System.in);
            System.out.print("Guess a number between 1 and 100 : ");
            return userInput.nextInt();
        }

        public String checkUserGuess (int answer) {
            int userGuess = getUserGuess();
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
