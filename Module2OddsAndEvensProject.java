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

        //characterDashes();



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
        System.out.println();

        String userPlayer1Pick = asksUserInput.nextLine();
        while (!userPlayer1Pick.startsWith("O") && !userPlayer1Pick.equals("Odd") && !userPlayer1Pick.startsWith("E") && !userPlayer1Pick.equals("Even")) {

            System.out.print(fullName + ", Please enter either (0)dd or (E)ven letter or typed in the whole word 'Odd' or 'Even' name. ");

            userPlayer1Pick = asksUserInput.nextLine();
        }
        String O = "Odd";
        String Odd = "Odd";
        String E = "Even";
        String Even = "Even";

        if (userPlayer1Pick.startsWith("O")) {
            System.out.println(fullName + ", you have selected " + O + " as your choice.");
        } else if (userPlayer1Pick.equals("Odd")) {
            System.out.println(fullName + ", you have selected " + Odd + " as your choice.");
        } else if (userPlayer1Pick.startsWith("E")) {
            System.out.println(fullName + ", you have selected " + E + " as your choice.");
        } else if (userPlayer1Pick.equals("Even")) {
            System.out.println(fullName + ", you have selected " + Even + " as your choice.");
        } else {
            System.out.println("An error has occurred in the written Java language program for Odds and Evens game");
            System.out.println("please, contact the Odds and Evens game administration to report the error exception.");
            System.out.println("Thank you.");
        }

        if (userPlayer1Pick.equals("O")) {
            System.out.println("and, the Computer player 2 is " + Even + ".");
        } else if (userPlayer1Pick.equals("Odd")) {
            System.out.println("and, the Computer player 2 is " + Even + ".");
        } else if (userPlayer1Pick.equals("E")) {
            System.out.println("and, the Computer player 2 is " + Odd + ".");
        } else if (userPlayer1Pick.equals("Even")) {
            System.out.println("and, the Computer player 2 is " + Odd + ".");
        } else {
            System.out.println("An error has occurred in the written Java language program for Odds and Evens game");
            System.out.println("please, contact the Odds and Evens game administration to report the error exception.");
            System.out.println("Thank you.");
        }
        //characterDashes();




        /*  Create a Scanner constructor to call when using "howManyFingersInput" special keyword, new in order to
            stream into the object's parameter System.in.
        */
        Scanner numberInput = new Scanner(System.in);

            /*  Write a Java language print line statement asking user (player 1) how many finger(s) in number, value
                he or she will enter.
            */
        System.out.print("Enter any number from 0 to 100: ");
        int userNumber = numberInput.nextInt();
        Random computerRandom = new Random();
        int computerPlayer = computerRandom.nextInt(100) + 1;
        System.out.println(fullName + ", you have chosen " + userNumber + ", as your number value selection.");
        System.out.println("And, the computer player 2 has selected " + computerPlayer + ", as it number value selection.");

        //characterDashes();

        int bothNumbers = userNumber + computerPlayer;

        System.out.println(fullName + ", selected number, " + userNumber + " and the Computer player 2 selected number, " + computerPlayer + " and, both players' numbers calculates to " + bothNumbers + ".");
        if (bothNumbers % 2 == 0) {
            System.out.println("The number " + bothNumbers + " results is even.");
            if (userPlayer1Pick.equals("E") || userPlayer1Pick.equals("Even")) {
                System.out.println(fullName + ", YOU HAVE WON the ODDS AND EVENS GAME!");
            } else {
                System.out.println("The number " + bothNumbers + " results is odd.");
                System.out.println("The computer Player 2 HAVE WON THE ODDS AND EVENS GAME!");
            }

            } if (bothNumbers % 2 != 0) {
                System.out.println("The number " + bothNumbers + " results is odd.");
                if (userPlayer1Pick.equals("O") || userPlayer1Pick.equals("Odd")) {
                    System.out.println(fullName + ", YOU HAVE WON the ODDS AND EVENS GAME!");
                } else {
                    System.out.println("The number " + bothNumbers + " results is even.");
                    System.out.println("The computer Player 2 HAVE WON THE ODDS AND EVENS GAME!");
            }


        }
    }
}







