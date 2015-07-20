package game;

import java.util.*;

/**
 *
 * This is a simple command-line java executable application that plays the 
 * user vs. the computer in many rounds of Rock, Paper, Scissors.
 *
 * <h2>CODING SPECIFICATION</h2>
 * <h3>Task Outline</h3>
 * <ol>
 * <li>Produce a simple game that allows you as a user to play rock paper scissors.</li>
 * <li>Allow the user to select rock, paper, or scissors to throw.</li>
 * <li>Provide a mechanism to initiate the throw.</li>
 * <li>Display who wins and who loses as well as the user and computer's
 * selections.</li>
 * </ol>
 *
 * <h3>Constraints</h3>
 * <ul>
 * <li>You may not use any switch case statements, if then conditionals or<br>
 * equivalent ternary operations in your application.</li>
 * <li><b>Note</b>: In many cases, I have programmed where the`while' statement doesn't<br>
 * loop -- but as I am constrained not to use an `if' statement this un-<br>
 * suggested coding practice meets the constraints and functionally acts the<br>
 * same as the disallowed `if' statement.</li>
 * </ul>
 *
 * <h3>Deliverables</h3>
 * Provide with your solution:
 * <ol>
 * <li>All of your source files.</li>
 * <li>Instructions to play the game and any relevant setup or release notes<br>
 * needed to compile and run the application (you can use any language you are<br>
 * familiar with).</li>
 * <li>Provide what you would have done to improve or complete this application<br>
 * with the given if you had more time.</li>
 * </ol>
 * <br>
 * <h2>INSTRUCTIONS</h2>
 * <h3>Setup</h3>
 * <ol>
 * <li>The only source file required (besides having Java 1.7 or later installed <br>
 * on your system) is the executable Jar file RockPaperScissors.jar.</li>
 * <li>It has been assumed that you have set up a proper environment (defined JAVA_HOME)<br>
 * such that you can run java from any directory location on your system.
 * <li>The Jar file provided is executable, and thus no compilation or build<br>
 * instructions are needed</li>
 * <li>Navigate to the directory where you have placed your copy of RockPaperScissors.jar</li>
 * <li>Run the jar file using the command line<br><pre>java -jar RockPaperScissors.jar</pre></li>
 * </ol>
 * <h3>Bill of Materials</h3>
 * A ZIP file has been included for your convenience. In it is:<br><br>
 * <ol>
 * <li>The aforementioned executable jar file RockPaperScissors.jar</li>
 * <li>A simple README text file, with these instructions</li>
 * <li>The javadoc, in a directory <i>doc</i><br>To access the API documentation,<br>
 * open the file doc/index.html in your favorite browser</li>
 * </ol>
 * <h3>How to Play</h3>
 * <ol>
 * <li>For those who may not be familiar with the general concepts of the game,<br>
 * please refer to the <a href="https://en.wikipedia.org/wiki/Rock-paper-scissors">wikipedia</a>
 * article regarding <i>Rock-paper-scissors</i></li>
 * <li>To play versus the computer, you obviously do not use hands as people do. Instead you<br>
 * type instructions.</li>
 * <li>When you run the executable jar file, the command line prompt politely requests:<br>
 * <pre>Hi, I am ready to play a game. Please enter ROCK, PAPER, or SCISSORS (or, to quit the game, enter QUIT) :</pre></li>
 * <li>You always go first! Type in one of the words (without the quotes): "rock", "Paper", or "SCISSORS".<br>
 * and then hit the Enter or Return key on your keyboard.
 * Don't worry about capitalization -- the computer is smart and will figure it out.</li>
 * <li>As the prompt suggests, at any time you can decide you don't want to play any longer. To accomplish<br>
 * that, you simply type in (without the quotes): "Quit"
 * and then hit the Enter or Return key on your keyboard.</li>
 * <li>If you enter any other text, the command line prompt politely requests:<br>
 * <pre>Oops! Try again. Please enter ROCK, PAPER, or SCISSORS (or, to quit the game, enter QUIT) :</pre></li>
 * <li>If that happens, either supply the proper word requested -- or type QUIT to exit the game.</li>
 * <li>Once the computer understands your input, it makes a random "throw" and gives you the results, such as one of these:<br>
 * 
 * <pre>Round #4: It is a tie -- computer and human both threw ROCK.</pre>
 * <pre>Round #5: Human wins (threw ROCK) and computer loses (threw SCISSORS).</pre>
 * <pre>Round #6: Computer wins (threw PAPER) and human loses (threw ROCK).</pre>
 * </li>
 * <li>You then proceed to the next round, where you are once again asked to make 
 * your "throw" selection.</li>
 * </ol>
 * <h3>Release Notes</h3>
 * <ol>
 * <li>This is the first release of this game. Although a "Future Goals" section exists, below, <br>
 * the reality is that there is no future work planned on this game!</li>
 * </ol>
 * <h3>Future Goals</h3>
 * This section defines how I would have improved or completed this application,<br>
 * with the given constraints, if I had more time.<br><br>
 * 
 * <h4>Better reporting of results</h4>
 * <ol>
 * <li> Currently the product only gives the results on a round-by-round basis, <br>
 * saying who threw what and which was the winner. The proposal is to (after<br>
 * the user chooses to quit the game) give a report on the cumulative results.</li>
 * <li>The general proposal is to put each round result (minus the Round Identifier prefix) as<br>
 * the Key to a LinkedHashMap and the incrementing round counter as the Value. Any attempt<br>
 * to add a duplicate result to the map simply increments the value for that key.</li>
 * <li>After the user is done playing (types in 'QUIT'), the program would use the Iterator<br>]
 * on the map entries to retrieve the results and give the number of instances of each. Also, <br>
 * a counter would be maintained to get the total number of wins, ties, and losses.</li>
 * <li>For instance, such a report might be displayed in this way:
 * <pre>
 
		<b>WINNER -- HUMAN</b>

        27 Human wins
        --------------
        12 Human wins (threw ROCK) and computer loses (threw SCISSORS).
        09 Human wins (threw SCISSORS) and computer loses (threw PAPER).
        06 Human wins (threw PAPER) and computer loses (threw ROCK).
        
        22 Computer wins
        -----------------
        08 Computer wins (threw ROCK) and human loses (threw SCISSORS).
        09 Computer wins (threw SCISSORS) and human loses (threw PAPER).
        07 Computer wins (threw PAPER) and human loses (threw ROCK).
        
        31 Ties (Nobody won!)
        ----------------------
        11 It is a tie -- computer and human both threw ROCK.
        13 It is a tie -- computer and human both threw SCISSORS. 
        07 It is a tie -- computer and human both threw PAPER.
          
 * </pre>
 * </li>
 * </ol>
 * <h4>More clever solutions to the constraints of not allowing if / switch case / ternary</h4>
 * <ol>
 * <li>Thus far, I have met the constraint by using <code>for</code> and <code>while</code> statements <br>
 * in less than ideal ways (according to code and style checkers). Given more <br>
 * time, I would like to research further to see if using mathematical represen-<br>
 * tations of data; doing binary shifts; or, other<br> methods might allow me to <br>
 * meet the constraints in a more acceptable way.</li>
 * <li>My initial research has shown little more than the ways I found on my own.<br>
 * Perhaps searching on a deeper meaning for the boolean concept and how computers <br>
 * internally represent branching iterative code might give me more insights.</li>
 * </ol>
 * <h4>A simple web interface</h4>
 * <ol>
 * <li>It wouldn't be difficult to present a page with three images of hands making the<br>
 * ROCK, PAPER, and SCISSORS images -- and player1 (human) would click that image to choose<br>
 * their throw.</li>
 * <li>This choice could be made more obvious by somehow dimming the non-chosen images.</li>
 * <li>A second row would present just one container and the code (after the player1<br>
 * choice has been made) would cause a quickly rotating set of ROCK, PAPER, and SCISSORS<br>
 * images, which would stop after some random generated amount of time.</li>
 * <li>The image container's background would be changed to a light green for the winner<br>
 * and perhaps a light red for the loser. If a tie occurred, both images (which would <br>
 * obviously be the same) would inherit a yellow-orange background.</li>
 * <li>At the bottom of the page, a counter would increment for the winner and the loser of
 * <br> the round would still how the same count. This would handle the overall score report</li>
 * <li> A couple of buttons would be in the bottom right of the page. Button 1 would say, <br>
 * "Start" initially and Button 2 would say, "Quit". After starting the game, Button 1's text<br>
 * might change to "Go Again"
 * <li><b>Note:</b>There are many simple free, online web versions of the Rock-paper-scissors<br>
 * game. (<a href="http://www.bigfishgames.com/online-games/5709/rock-paper-scissors-challenge/index.html">One poorly written application</a> where the computer chooses first and then you<br>
 * make your [obviously] winning choice second). There is no real market for such a product!</li>
 * </ol>
 * <h4>Enhancements, Changes, or Variations on the Command-Line Game</h4>
 * <ol>
 * <li>I believe I wrote this well enough that it wouldn't be hard to extend to<br>
 * cover other variants such as "Rock Paper Scissors Lizard Spock" one. This game<br>
 * (developed by Sheldon Cooper on the TV show "The Big Bang Theory") follows similar<br>
 * rules, but adds complexity and thus decrease the chance of a tie using these rules:
 * <pre>
                    
                    Scissors cuts Paper 

                    Paper covers Rock 

                    Rock crushes Lizard 

                    Lizard poisons Spock 

                    Spock smashes Scissors 

                    Scissors decapitates Lizard 

                    Lizard eats Paper 

                    Paper disproves Spock 

                    Spock vaporizes Rock 

                    (and as it always has) Rock crushes scissors 
 * </pre>
 * 
 * As it is currently written, I would just need to add to the enum THROWS; modify the
 * <br> String arrays defining win, loss, and tie situations; change some online prompts; and,
 * <br> modify the while loops that check for valid input from those prompts. Not only would
 * <br> this be interesting, but it would help to make me think in a more object-oriented way
 * <br> so that future variants would be less work. </li>
 * <li>Although not proficient in multi-threading coding, I could look into that further<br>
 * as a method on improving the overall code. The methodology of quitting the game is <br>
 * not very good code at all (force exiting the application) and maintaining two threads --<br>
 * the main one to choose "throws" and the secondary thread to wait for a keystroke (such<br>
 * as CTRL/CMD-Q) to quit the game is potentially a better solution.</li>
 * <li>Another improvement would be to use a Listener to keep checking for the magic<br>
 * keystroke to end the application.</li>
 * <li>Also, I could have done a better job of Object Oriented coding. Normally, QA Engineers<br>
 * don't have to worry about that level of coding -- but I could have made objects for Players<br>
 * and they would have properties such as throws. Throws would also be objects and they could<br>
 * interact with each other and one would be dominant over the other. This logical way of attacking<br>
 * the issue would make the code (game) more maintainable, and thus more easily extendable.</li>
 * <li>However, one thing I noticed that would make the current implementation better (without <br>
 * extensive refactoring) would be a more simple method for determining whether a valid throw was<br>
 * chosen. This could have been done by taking the input string and attempting to convert it to <br>
 * the Throws enum. If an exception occurred, catch it and ask them to try again ... or else just<br>
 * keep going with the throw and process it along with the random throw from the computer player, <br>
 * as usual.
 * </ol>
 * 
 * <br><br>
 * A final comment. A "Rock Paper Scissors Lizard Spock" variant of the game already exists as a <br>
 * free online web application. See it in action at <a href = "http://www.y8.com/games/rock_paper_scissors_lizard_spock"> this Games site</a>
 * 
 * 

 */
public class RockPaperScissors {

    /**
     * The constructor `game'.
     */
    private static RockPaperScissors game = new RockPaperScissors();

    /**
     * The counter that keeps track of the current ROCK-PAPER-SCISSORS round.
     */
    private int roundCounter = 0;

    /**
     * Gets the current value for the counter.
     *
     * @return the counter
     */
    public final int getCounter() {
        return roundCounter;
    }

    /**
     * Sets the counter's value.
     *
     * @param counter the counter
     */
    public final void setCounter(final int counter) {
        this.roundCounter = counter;
    }

    /**
     * The map structure reserved for future reporting use.
     */
    private LinkedHashMap<Integer, String[]> llhm = new LinkedHashMap<Integer, String[]>();

    /**
     * The enum Throws.
     */
//We are considering 'QUIT' to be a valid throw (as in, "I Quit!")
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
         * The QUIT.
         */
        QUIT
    }

    /**
     * The constant ROCK.
     */
    private static final String ROCK = Throws.values()[0].toString();
    /**
     * The constant PAPER.
     */
    private static final String PAPER = Throws.values()[1].toString();
    /**
     * The constant SCISSORS.
     */
    private static final String SCISSORS = Throws.values()[2].toString();
    /**
     * The constant QUIT.
     */
    private static final String QUIT = Throws.values()[3].toString();

    /**
     * The constant WANNA_PLAY.
     */
    private static final String WANNA_PLAY = "Please enter " + ROCK + ", "
            + PAPER + ", or " + SCISSORS + " (or, to quit the game, enter "
            + QUIT + ") :";

    /**
     * The Human's throw.
     */
    private String humanThrowParam = ROCK;

    /**
     * Gets the current throw value (for human).
     *
     * @return the human throw param
     */
    private String getHumanThrowParam() {
        return humanThrowParam;
    }

    /**
     * Sets the throw value (for human).
     *
     * @param humanThrowParam the human throw param
     */
    private void setHumanThrowParam(String humanThrowParam) {
        this.humanThrowParam = humanThrowParam;
    }

    /**
     * The constant WIN_VALUES -- representing the winning moves.
     */
    private static final String[][] WIN_VALUES = new String[][]{
            {ROCK, SCISSORS},
            {PAPER, ROCK},
            {SCISSORS, PAPER}
    };

    /**
     * The constant LOSE_VALUES -- representing the losing moves.
     */
    /* Not currently explicitly used, but might be handy in future if
    constraint removed or a more complex version of the game is proposed
    */
    private static final String[][] LOSE_VALUES = new String[][]{
            {SCISSORS, ROCK},
            {ROCK, PAPER},
            {PAPER, SCISSORS}
    };

    /**
     * The constant TIE_VALUES -- representing the tying moves.
     */
/* Not currently explicitly used, but might be handy in future if
constraint removed or a more complex version of the game is proposed
*/
    private static final String[][] TIE_VALUES = new String[][]{
            {ROCK, ROCK},
            {PAPER, PAPER},
            {SCISSORS, SCISSORS}
    };

    /**
     * The ArrayList 'move', used to store the human and computer moves.
     */
    private static ArrayList<String> move = new ArrayList<String>();

    /**
     * The main method, for running the Java Executable
     *
     * @param args the args
     */
    public static void main(String[] args) {
        /*
        INITIAL PSEUDO-CODE
        --------------------
        Enum THROW with values  ROCK, PAPER, SCISSORS is defined
        Enum RESULT with values WINS, LOSES, and TIES is defined

        MOVES is defined as Array with THROW value from Human, THROW value from
            Computer

        WINS is a String[][] containing all the winning MOVES
        LOSES is a String[][] containing all the losing MOVES
        TIES  a String[][] containing all the tie MOVES

        HashListMap hm is declared and initialized as a new empty map

        Declare and initialize an int roundNumber to 0

        Set String version of THROW to any non-QUIT value (use Random?)

        While not QUIT
            Human enters choice of THROW (as String) on command-line:
                or enters QUIT
            Computer generates Random int from 1-3 & that's used to choose THROW

            MOVES is populated with the Human, Computer THROW
            Return RESULTS from IsItWinning(MOVES) by seeing if MOVES is in
                WINS, LOSES, or TIES using a for loop
            Increment RoundNumber

            Put String consisting of MOVES and RESULT as Key and counter as
                Value in the map `hm'.
        [ End the While loop by declaring "QUIT']

         Use Iterator to essentially do a For Loop on Map to gather all results
         Use that data to print out results for all rounds -- who won each
            round and Throw vs Throw information, and a cumulative count for
            each such result.
         */

        Scanner console = new Scanner(System.in);

        //initializing to non-QUIT situation
        String gameThrow = ROCK;

        while (!gameThrow.equals(QUIT)) {
            game.blurb(console, "Hi, I am ready to play a game.");
            gameThrow = game.getHumanThrowParam().toUpperCase();

            while (gameThrow.equals(QUIT)) {
                game.doQuit();
            }

                while (
                        !gameThrow.equals(ROCK)
                                && !gameThrow.equals(PAPER)
                                && !gameThrow.equals(SCISSORS)
                        ) {
                    game.blurb(console, "\nOops! Try again.");
                    gameThrow = game.getHumanThrowParam().toUpperCase();

                    while (gameThrow.equals(QUIT)) {
                        game.doQuit();
                    }
                }

                String randThrow = randomizeThrow();

                move.add(gameThrow);
                move.add(randThrow);

                //convert ArrayList<String> to String[]
                String[] arrayMove = move.toArray(new String[move.size()]);

                System.out.println(game.getRoundResult(arrayMove) + "\n");

                /*
                Here is where, time permitting, I would use the hashMap to set the
                (the result string) and the VALUE (the aggregate count for each KEY)
                 -- and then I could print out a summary of all the rounds after
                 the human quits the game.
                */

                // clean-up
                move.clear();

            }
        }
/**
A bit heavy-handed -- but it certainly quits the game (by exiting the program).
 */
    public void doQuit () {
        System.out.println("Quitter! You aren't afraid of a little computer,"
                + " are you?");
        System.exit(-1);

    }
    /**
     * The friendly or warning-style greeting inviting the user to play the
     * game or decide to quit.
     *
     * @param console  the console
     * @param preamble the preamble
     */
    private void blurb(final Scanner console, final String preamble) {
        System.out.println(preamble + " " + WANNA_PLAY);
        game.setHumanThrowParam(console.nextLine());

    }

    /**
     * Randomizes throw to get whether computer chose ROCK, PAPER, or SCISSORS.
     *
     * @return the string
     */
    private static String randomizeThrow() {
        Random randomNum = new Random();
        //Note: subtract one, as the last one is the special case "QUIT"
        int rand = randomNum.nextInt((Throws.values().length)-1);
        return String.valueOf(Throws.values()[rand]);
    }

    /**
     * Displays who wins and who loses as well as
     * the user and computer’s selections.
     *
     * @param move the move
     * @return the round result
     */
    private String getRoundResult(final String[] move) {

        int localCounter = getCounter();
        localCounter++;
        setCounter(localCounter);

        String userMove = move[0];
        String computerMove = move[1];

        String resultForRound = "Cannot determine who won and who lost -- "
                + "check for coding errors, please";

        while (computerMove.equals(userMove)) {
            resultForRound = "Round #" + localCounter + ": "
                    + "It is a tie -- computer and human both threw "
                    + userMove +".";
            return resultForRound;
        }

        for (String[] WIN_VALUE : WIN_VALUES) {
            while (Arrays.equals(WIN_VALUE, move)) {
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
}
