package game;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * The type Abstract rock paper scissors.
 */
public abstract class AbstractRockPaperScissors {

    /** The ArrayList 'move', used to store the human and computer moves. */
    private static ArrayList<String> move = new ArrayList<String>();

    /**
     * Gets counter.
     *
     * @return the counter
     */
    abstract int getCounter();

    /**
     * Sets counter.
     *
     * @param counter the counter
     */
    abstract void setCounter(final int counter);

    /**
     * Throw initialization.
     *
     * @return the string
     */
    abstract String throwInitialization();

    /**
     * Construct stock phrase for console.
     *
     * @return the string
     */
    abstract String constructStockPhraseForConsole();

    /**
     * Define throw constants.
     */
    abstract void defineThrowConstants();

    /**
     * Get winning throws.
     *
     * @return two-dimensional array that defines the winning throw moves.
     */
    abstract String[][] getWinningThrows();

    /**
     * Get losing throws.
     *
     * @return two-dimensional array that defines the losing throw moves.
     */
    abstract String[][] getLosingThrows();

    /**
     * Get tying throws.
     *
     * @return two-dimensional array that defines the tying throw moves.
     */
    abstract String[][] getTyingThrows();

    /**
     * Interface initialization.
     *
     * @return the scanner
     */
    private Scanner interfaceInitialization() {
        return new Scanner(System.in);
    }

    /**
     * Play the game.
     */
    public final void playTheGame() {

        Scanner console = interfaceInitialization();
        String gameThrow = throwInitialization();
        String append1 = "Hi, I am ready to play a game.";
        String append2 = "\nOops! Try again.";

        while (!throwIsAQuit(gameThrow)) {
            askHumanToPlay(console, append1);

            gameThrow = humanDoesThrow();

            while (throwIsAQuit(gameThrow)) {
                doQuit();
            }

            while (
                    isValidThrowCalled(gameThrow)) {

                askHumanToPlay(console, append2);

                gameThrow = humanDoesThrow();

                while (throwIsAQuit(gameThrow)) {
                    doQuit();
                }
            }


            String randThrow = randomizeThrow();

            move.add(gameThrow);
            move.add(randThrow);

            //convert ArrayList<String> to String[]
            String[] arrayMove = move.toArray(new String[move.size()]);

            System.out.println(getRoundResult(arrayMove) + "\n");

            move.clear();

        }
    }

    /**
     * Ask human to play.
     *
     * @param console the console
     * @param phrase the phrase
     */
    abstract void askHumanToPlay(Scanner console, String phrase);

    /**
     * Human does throw.
     *
     * @return the string
     */
    abstract String humanDoesThrow();

    /**
     * Randomize throw.
     *
     * @return the string
     */
    abstract String randomizeThrow();

    /**
     * Is valid throw called.
     *
     * @param gameThrow the game throw
     * @return the boolean
     */
    abstract boolean isValidThrowCalled(String gameThrow);

    /**
     * Displays who wins and who loses as well as
     * the user and computer?s selections.
     *
     * @param move the move
     * @return the round result
     */
    private String getRoundResult(final String[] move) {

        int localCounter = this.getCounter();
        localCounter++;
        setCounter(localCounter);

        String userMove = move[0];
        String computerMove = move[1];

        String resultForRound = "Cannot determine who won and who lost -- "
                + "check for coding errors, please";

        while (computerMove.equals(userMove)) {
            resultForRound = "Round #" + localCounter + ": "
                    + "It is a tie -- computer and human both threw "
                    + userMove + ".";
            return resultForRound;
        }

        for (String[] winValue : getWinningThrows()) {
            while (Arrays.equals(winValue, move)) {
                resultForRound = "Round #" + localCounter + ": "
                        + "Human wins (threw " + userMove + ")" + " "
                        + "and computer loses (threw " + computerMove + ").";
                return resultForRound;
            }
        }
        resultForRound = "Round #" + localCounter + ": "
                + "Computer wins (threw " + computerMove + ") and "
                + "human loses (threw " + userMove + ").";
        return resultForRound;
    }

    /**
     * Throw is a quit.
     *
     * @param gameThrow the game throw
     * @return the boolean
     */
    abstract boolean throwIsAQuit(String gameThrow);

    /**
     * A bit extreme -- but it certainly quits the game (by exiting the
     * program).
     */
    public static void doQuit() {
        System.out.println("Quitter! You aren't afraid of a little computer,"
                + " are you?");
        System.exit(-1);

    }
}
