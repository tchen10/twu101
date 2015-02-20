// Create a new version of the Chapter 5 problem where you also record all of the users guesses
// and print them out once they guess correctly. Use an ArrayList to store the guesses.
import java.util.Scanner;
import java.util.ArrayList;

public class Ch6 {
    public static void main (String[] args) {
        Ch6Game game = new Ch6Game();
        game.setUpGame();
        game.playGame();
    }
}