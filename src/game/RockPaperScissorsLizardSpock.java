package game;

import java.util.Random;
import java.util.Scanner;

/**
 * the Rock-Paper-Scissors-Lizard-Spock console-based game App.
 */
public class RockPaperScissorsLizardSpock extends AbstractRockPaperScissors {
    //***********************CONSTRUCTOR***********************//
    /**
     * The constructor `game'.
     */
    private static RockPaperScissorsLizardSpock game =
            new RockPaperScissorsLizardSpock();

    //**********DECLARATIONS & INITIALIZATIONS**************//
    /**
     * The ROCK.
     */
    static String ROCK;
    /**
     * The PAPER.
     */
    static String PAPER;
    /**
     * The SCISSORS.
     */
    static String SCISSORS;
    /**
     * The LIZARD.
     */
    static String LIZARD;
    /**
     * The SPOCK.
     */
    static String SPOCK;
    /**
     * The 'constant' gameThrow.
     */
    public static String gameThrow = SPOCK;
    /**
     * The QUIT.
     */
    static String QUIT;
    /**
     * The counter that keeps track of the current ROCK-PAPER-SCISSORS round.
     */
    private static int roundCounter = 0;

    //**********MAIN EXECUTABLE**************//
    /**
     * The main method, for running the Java Executable.
     *
     * @param args the args
     */
    public static void main(String[] args) {
        game.defineThrowConstants();
        gameThrow = SPOCK;
        game.playTheGame();
    }

    //**********GETTERS & SETTERS**************//
    /**
     * Gets the current value for the counter.
     *
     * @return the counter
     */
    @Override
    public final int getCounter() {
        return roundCounter;
    }

    /**
     * Sets the counter's value.
     *
     * @param counter the counter
     */
    @Override
    public final void setCounter(final int counter) {
        roundCounter = counter;

    }

    //**********INITIALIZATION CODE*************//
    /**
     * Throw initialization.
     *
     * @return the string
     */
    @Override
    final String throwInitialization() {
        return SPOCK;
    }

    /**
     * Construct stock phrase for console.
     *
     * @return the string
     */
    @Override
    final String constructStockPhraseForConsole() {
        return "Please enter " + ROCK + ", "
                + PAPER + ", " + SCISSORS + ", " + LIZARD + ", or " + SPOCK
                + " (or, to quit the game, enter " + QUIT + ") :";
    }

    ;
    //*****************ENUMERATIONS********************//
    // We are considering 'QUIT' to be a valid throw (as in, "I Quit!")
    /**
     * The enum Throws.
     */
    public enum Throws {
        /**
         * The ROCK.
         */
        ROCK,
        /**
         * The PAPER.
         */
        PAPER,
        /**
         * The SCISSORS.
         */
        SCISSORS,
        /**
         * The LIZARD.
         */
        LIZARD,
        /**
         * The SPOCK.
         */
        SPOCK,
        /**
         * The QUIT.
         */
        QUIT;


    }

    //**********DEFINITIONS**************//
    /**
     * Define throw constants.
     */
    @Override
    final void defineThrowConstants() {

        ROCK = Throws.values()[0].toString();
        PAPER = Throws.values()[1].toString();
        SCISSORS = Throws.values()[2].toString();
        LIZARD = Throws.values()[3].toString();
        SPOCK = Throws.values()[4].toString();
        QUIT = Throws.values()[5].toString();
    }

    ;

    /**
     * Get winning throws.
     *
     * @return the string [ ] [ ]
     */
    @Override
    final String[][] getWinningThrows() {
        return new String[][]{
                {ROCK, SCISSORS}, {ROCK, LIZARD},
                {PAPER, ROCK}, {PAPER, SPOCK},
                {SCISSORS, PAPER}, {SCISSORS, LIZARD},
                {LIZARD, SPOCK}, {LIZARD, PAPER},
                {SPOCK, SCISSORS}, {SPOCK, ROCK},
        };
    }

    /**
     * Get losing throws.
     *
     * @return the string [ ] [ ]
     */
    @Override
    final String[][] getLosingThrows() {
        return new String[][]{
                {SCISSORS, ROCK}, {LIZARD, ROCK},
                {ROCK, PAPER}, {SPOCK, PAPER},
                {PAPER, SCISSORS}, {LIZARD, SCISSORS},
                {SPOCK, LIZARD}, {PAPER, LIZARD},
                {SCISSORS, SPOCK}, {ROCK, SPOCK}
        };
    }

    /**
     * Get tying throws.
     *
     * @return the string [ ] [ ]
     */
    @Override
    final String[][] getTyingThrows() {
        return new String[][]{
                {ROCK, ROCK},
                {PAPER, PAPER},
                {SCISSORS, SCISSORS},
                {LIZARD, LIZARD},
                {SPOCK, SPOCK}
        };
    }

    //***************GAME PLAY ROUTINES**************//
    /**
     * Ask human to play.
     *
     * @param console the console
     * @param phrase  the phrase
     */
    @Override
    final void askHumanToPlay(final Scanner console, final String phrase) {
        System.out.println(phrase + " " + constructStockPhraseForConsole());
        gameThrow = console.nextLine();
    }

    /**
     * Human does throw.
     *
     * @return the string
     */
    @Override
    final String humanDoesThrow() {
        return gameThrow.toUpperCase();
    }

    /**
     * Randomizes throw to get whether computer chose ROCK, PAPER, or SCISSORS.
     *
     * @return the string
     */
    @Override
    final String randomizeThrow() {
        Random randomNum = new Random();
        //Note: subtract one, as the last one is the special case "QUIT"
        int rand = randomNum.nextInt((Throws.values().length) - 1);
        return String.valueOf(Throws.values()[rand]);
    }

    //*****************LOGIC********************//
    /**
     * Is valid throw called?
     *
     * @param gameThrow the game throw
     * @return the boolean
     */
    @Override
    final boolean isValidThrowCalled(final String gameThrow) {
        return (!gameThrow.equals(ROCK)
                && !gameThrow.equals(PAPER)
                && !gameThrow.equals(SCISSORS)
                && !gameThrow.equals(LIZARD)
                && !gameThrow.equals(SPOCK)
        );
    }

    /**
     * Throw is a quit.
     *
     * @param gameThrow the game throw
     * @return the boolean
     */
    @Override
    final boolean throwIsAQuit(final String gameThrow) {
        return gameThrow.equals(QUIT);
    }
}
