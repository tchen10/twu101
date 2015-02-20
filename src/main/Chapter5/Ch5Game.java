public class Ch5Game {
    private int answer;

    public void setUpGame() {
        answer = (int) (Math.random() * 100);
        System.out.println("We picked a number between 1 and 100. You get to try and guess the number.");
        System.out.println("We'll tell you if you're too high or too low. Good Luck!");
    }

    public void playGame() {
        boolean isPlaying = true;
        while (isPlaying) {
            Ch5Guess newGuess = new Ch5Guess();
            String guessState = newGuess.checkUserGuess(answer);
            if (guessState.equals("correct")) {
                isPlaying = false;
                System.out.println("That's right! You win! Game over.");
            } else {
                System.out.println("Your guess is " + guessState);
            }

        }
    }
}