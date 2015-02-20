// Write a program that chooses a random number between 1 and 100.
// Then asks the user to enter a guess. If they guess right then tell them they win,
// otherwise tell them if they guessed too high or low.
// Keep asking the user to guess until they get the right answer.
// Use classes to separate the different concerns of this program.

public class Ch5 {
    public static void main (String[] args) {
        Ch5Game game = new Ch5Game();
        game.setUpGame();
        game.playGame();
    }
}