# Xero
Coding Exercise to write a program that does RockPaperScissors

<p>......................................................................................................</p>

<b>*Table of Contents*</b>

[CODING SPECIFICATION 1](#coding-specification)

[Task Outline 1](#task-outline)

[Constraints 1](#constraints)

[Deliverables 2](#deliverables)

[INSTRUCTIONS 2](#instructions)

[Setup 2](#setup)

[Bill of Materials 3](#bill-of-materials)

[How to Play 3](#how-to-play)

[Release Notes 3](#release-notes)

[Future Goals 3](#future-goals)

[Better reporting of results 3](#better-reporting-of-results)

[More clever solutions to the constraints of not allowing if / switch case / ternary 4](#more-clever-solutions-to-the-constraints-of-not-allowing-if-switch-case-ternary)

[A simple web interface 4](#a-simple-web-interface)

[Enhancements, Changes, or Variations on the Command-Line Game 5](#enhancements-changes-or-variations-on-the-command-line-game)

**This is a simple command-line java executable application that plays the user vs. the computer in many rounds of *Rock, Paper, Scissors*. **
==========================================================================================================

====================================

CODING SPECIFICATION
--------------------

### Task Outline

1.  Produce a simple game that allows you as a user to play rock paper scissors.

2.  Allow the user to select rock, paper, or scissors to throw.

3.  Provide a mechanism to initiate the throw.

4.  Display who wins and who loses as well as the user and computer's selections.

### Constraints

-   You may not use any switch case statements, if then conditionals or
    equivalent ternary operations in your application.

-   **Note**: In many cases, I have programmed where the 'while' statement doesn't
    loop -- but as I am constrained not to use an \`if' statement this un-
    suggested coding practice meets the constraints and functionally acts the
    same as the disallowed \`if' statement.

### Deliverables

Provide with your solution:

1.  All of your source files.

2.  Instructions to play the game and any relevant setup or release notes
    needed to compile and run the application (you can use any language you are
    familiar with).

3.  Provide what you would have done to improve or complete this application
    with the given if you had more time.

INSTRUCTIONS
------------

### Setup

1.  The only source file required (besides having Java 1.7 or later installed
    on your system) is the executable Jar file RockPaperScissors.jar.

2.  It has been assumed that you have set up a proper environment (defined JAVA\_HOME)
    such that you can run java from any directory location on your system.

3.  The Jar file provided is executable, and thus no compilation or build
    instructions are needed

4.  Navigate to the directory where you have placed your copy of RockPaperScissors.jar

5.  Run the jar file using the command line

<pre> -jar RockPaperScissors.jar </pre>

### Bill of Materials

A ZIP file has been included for your convenience. In it is:

1.  The aforementioned executable jar file RockPaperScissors.jar

2.  A simple README text file, with these instructions

3.  The Javadoc, in a directory *doc*
    To access the API documentation, open the file doc/index.html in your favorite browser

### How to Play

1.  For those who may not be familiar with the general concepts of the game,
    please refer to the [Wikipedia](https://en.wikipedia.org/wiki/Rock-paper-scissors) article regarding *Rock-paper-scissors*

2.  To play versus the computer, you obviously do not use hands as people do.
 Instead, you type instructions.

3.  When you run the executable jar file, the command line prompt politely requests:

<pre>Hi, I am ready to play a game. Please enter ROCK, PAPER, or SCISSORS (or, to quit the game, enter QUIT) :</pre>

1.  You always go first! Type in one of the words (without the quotes): "rock", "Paper", or "SCISSORS",
    and then hit the Enter or Return key on your keyboard. Do not worry about capitalization -- the computer is smart and will figure it out.

2.  As the prompt suggests, at any time you can decide you do not want to play any longer. To accomplish
    that, you simply type in (without the quotes): "Quit" and then hit the Enter or Return key on your keyboard.

3.  If you enter any other text, the command line prompt politely requests:

<pre>Oops! Try again. Please enter ROCK, PAPER, or SCISSORS (or, to quit the game, enter QUIT) : </pre>

1.  If that happens, either supply the proper word requested -- or type QUIT to exit the game.

2.  Once the computer understands your input, it makes a random "throw" and gives you the results, such as 

one of these:
<pre>
Round #4: It is a tie -- computer and human both threw ROCK.
Round #5: Human wins (threw ROCK) and computer loses (threw SCISSORS).
Round #6: Computer wins (threw PAPER) and human loses (threw ROCK).
</pre>

1.  You then proceed to the next round, where you are once again asked to make your "throw" selection.

### Release Notes

1.  This is the first release of this game. Although a "Future Goals" section exists, below,
    the reality is that there is no future work planned on this game!

### Future Goals

This section defines how I would have improved or completed this application,
with the given constraints, if I had more time.

#### Better reporting of results

1.  Currently the product only gives the results on a round-by-round basis,
    saying who threw what and which was the winner. The proposal is to (after
    the user chooses to quit the game) give a report on the cumulative results.

2.  The general proposal is to put each round result (minus the Round Identifier prefix) as
    the Key to a LinkedHashMap and the incrementing round counter as the Value. Any attempt
    to add a duplicate result to the map simply increments the value for that key.

3.  After the user is done playing (types in 'QUIT'), the program would use the Iterator
    \] on the map entries to retrieve the results and give the number of instances of each. In addition,
    a counter would be maintained to get the total number of wins, ties, and losses.

4.  For instance, such a report might be displayed in this way:
<pre>
**WINNER -- HUMAN**<br>
27 Human wins<br>
12 Human wins (threw ROCK) and computer loses (threw SCISSORS).
09 Human wins (threw SCISSORS) and computer loses (threw PAPER).
06 Human wins (threw PAPER) and computer loses (threw ROCK).
<br>
22 Computer wins<br>
08 Computer wins (threw ROCK) and human loses (threw SCISSORS).
09 Computer wins (threw SCISSORS) and human loses (threw PAPER).
07 Computer wins (threw PAPER) and human loses (threw ROCK).
<br>
31 Ties (Nobody won!)<br>
11 It is a tie -- computer and human both threw ROCK.
13 It is a tie -- computer and human both threw SCISSORS.
07 It is a tie -- computer and human both threw PAPER.
</pre>

#### More clever solutions to the constraints of not allowing if / switch case / ternary

1.  Thus far, I have met the constraint by using for and while statements
    in less than ideal ways (according to code and style checkers). Given more
    time, I would like to research further to see if using mathematical represen-
    tations of data; doing binary shifts; or, other
    methods might allow me to meet the constraints in a more acceptable way.

2.  My initial research has shown little more than the ways I found on my own.
    Perhaps searching on a deeper meaning for the boolean concept and how computers
    internally represent branching iterative code might give me more insights.

#### A simple web interface

1.  It would not be difficult to present a page with three images of hands making the
    ROCK, PAPER, and SCISSORS images -- and player1 (human) would click that image to choose
    their throw.

2.  This choice could be made more obvious by somehow dimming the non-chosen images.

3.  A second row would present just one container and the code (after the player1
    choice has been made) would cause a quickly rotating set of ROCK, PAPER, and SCISSORS
    images, which would stop after some random generated amount of time.

4.  The image container's background would be changed to a light green for the winner
    and perhaps a light red for the loser. If a tie occurred, both images (which would
    obviously be the same) would inherit a yellow-orange background.

5.  At the bottom of the page, a counter would increment for the winner and the loser of
    the round would still how the same count. This would handle the overall score report

6.  A couple of buttons would be in the bottom right of the page. Button 1 would say,
    "Start" initially and Button 2 would say, "Quit". After starting the game, Button 1's text
    might change to "Go Again"

7.  **Note:** There are many simple free, online web versions of the Rock-paper-scissors
    game. ([One poorly written application](http://www.bigfishgames.com/online-games/5709/rock-paper-scissors-challenge/index.html) where the computer chooses first and then you
    make your \[obviously\] winning choice second). There is no real market for such a product!

#### Enhancements, Changes, or Variations on the Command-Line Game

1.  I believe I wrote this well enough that it would not be hard to extend to
    cover other variants such as "Rock Paper Scissors Lizard Spock" one. This game
    (developed by Sheldon Cooper on the TV show "The Big Bang Theory") follows similar
    rules, but adds complexity and thus decrease the chance of a tie using these rules:
<pre>
Scissors cuts Paper
Paper covers Rock
Rock crushes Lizard
Lizard poisons Spock
Spock smashes Scissors
Scissors decapitates Lizard
Lizard eats Paper
Paper disproves Spock
Spock vaporizes Rock
(And as it always has) Rock crushes scissors
</pre>
As it is currently written, I would just need to add to the enum THROWS; modify the
String arrays defining win, loss, and tie situations; change some online prompts; and,
modify the while loops that check for valid input from those prompts. Not only would
this be interesting, but also it would help to make me think in a more object-oriented way
so that future variants would be less work.

1.  Although not proficient in multi-threading coding, I could look into that further
    as a method on improving the overall code. The methodology of quitting the game is
    not very good code at all (force exiting the application) and maintaining two threads --
    the main one to choose "throws" and the secondary thread to wait for a keystroke (such
    as CTRL/CMD-Q) to quit the game is potentially a better solution.

2.  Another improvement would be to use a Listener to keep checking for the magic
    keystroke to end the application.

3.  In addition, I could have done a better job of Object Oriented coding. Normally, QA Engineers
    do not have to worry about that level of coding -- but I could have made objects for Players
    and they would have properties such as throws. Throws would also be objects and they could
    interact with each other and one would be dominant over the other. This logical way of attacking
    the issue would make the code (game) more maintainable, and thus more easily extendable.

4.  However, one thing I noticed that would make the current implementation better (without
    extensive refactoring) would be a more simple method for determining whether a valid throw was
    chosen. This could have been done by taking the input string and attempting to convert it to
    the Throws enum. If an exception occurred, catch it and ask them to try again ... or else just
    keep going with the throw and process it along with the random throw from the computer player,
    as usual.

A final comment. A "Rock Paper Scissors Lizard Spock" variant of the game already exists as a
free online web application. See it in action at [this Games site](http://www.y8.com/games/rock_paper_scissors_lizard_spock)
