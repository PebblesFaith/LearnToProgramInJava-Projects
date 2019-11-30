/*
    In my Module Two (2) online course for “Learn to Program in Java,” in logical Control Structures.
    I am instructed to write a Java language file program in an Odds or Evens” Project; in order to
    thoroughly understand my Module Two (2) logical Control Structures programmatic coding in Primitive
    Data Types such as, Boolean and Boolean relational operators and, Strings, as an objects and,
    if / else statements and combining logic of an if / else statements logical control structures and,
    Java language coding a while and for Loops’ statements and nesting those while and For Loops
    statements in grid-like output structures, as well.

    My Module Two (2) Odds and Evens Project is similar to a rock, paper and scissor game and, the Odds
    and Evens games is played between two (2) players and, I have programmatic Java language coded for
    the user (player 1) versus my written algorithm Java language file program (Module2OddsAndEvensProject)
    in which, each user (player 1) and my algorithm Java language file program which is user (player 2)
    will either select Odds or Evens. And, since, user (player 1) will get to pick first (1st) either Odds
    or Evens selection than my algorithm Java language file program (player 2) will become the opposite of
    the Odds of Evens choice of the user (player 1) Odds or Evens selection. After, the user (player 1) and
    my algorithm Java language file program (player 2) chosen their Odds or Evens sides then the user (player 1)
    must choose a number of fingers on their hands from zero (0) to five (5). And, the winner of the Odds or
    Evens game is determined by whether the sum of the user (player 1) had entered in fingers selection is odd or
    even number and, this depends on what the user (player 1) had chosen in his or her number of fingers entered,
    as a number selection in order to win the Odds or Evens game.


    I, Sarai Hannah Ajai had completed, the Module Two (2) online course for “Learn to Program in Java,” in an
    Odds or Evens Project written for the Java language file program (Module2OddsAndEvensProject) dated on
    November 30, 2019.
 */

import java.util.*;
// Create a new Java file program call, Module2OddsAndEvensProject written in Java language.
public class Module2OddsAndEvensProject {
    public static void main(String[] args) {
    /*  Create a Scanner constructor to call when using "asksUserInput" special keyword, new in order to
        stream into the object's parameter System.in.
    */
        Scanner asksUserInput = new Scanner(System.in);
    /*  Write a Java language print line statement asking user (player 1) to enter his or her full
        name.
    */
        System.out.print("What is your full name? ");
        /*  Write a Java language codes for Scanner input that stream user's (player 1) interactive String
            variable name (fullName) next to the corresponding print lint statement truncating user (player 1)
            middle and [or] last name.
        */
            String fullName = asksUserInput.next();

    /*  Write a Java language print line statement codes for welcoming the user (player 1) to the Odds or
        Evens game.
    */
        System.out.println("Welcome to the Odds or Evens game, " + fullName + ".");


        System.out.print(fullName + ", Please enter your Odds or Evens choice by typing in O(dd) or (E)ven.");
            String userChoice = asksUserInput.nextLine();
            System.out.println(fullName + ", you have selected " + userChoice + ".");



    }

}