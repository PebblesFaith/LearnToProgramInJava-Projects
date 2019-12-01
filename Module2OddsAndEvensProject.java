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
    must choose a number value from zero (0) to ten-million (10,000,000). And, the winner of the Odds or
    Evens game is determined by whether the sum of the user (player 1) had entered in number value selection is odd or
    even number and, this depends on what the user (player 1) had chosen in his or her number value entry,
    as a number selection in order to win the Odds or Evens game.

    I, Sarai Hannah Ajai had completed, the Module Two (2) online course for “Learn to Program in Java,” in an
    Odds or Evens Project written for the Java language file program (Module2OddsAndEvensProject) dated on
    November 30, 2019.
 */

import java.util.*;
// Create a new Java file program call, Module2OddsAndEvensProject written in Java language.
public class Module2OddsAndEvensProject {
    public static void main(String[] args) {
        Dashes();

        /*  Create a Scanner constructor to call when using "asksUserInput" special keyword, new; in order to
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
        //  Write java language codes in order to add a blank line.
        System.out.println();
        /*
        Create a string variable (userPlayer1Pick) name in order to store user (player 1) value.
         */
        String userPlayer1Pick = asksUserInput.nextLine();
        /*
        Create a while statement that will loop user (player 1) variable (userPlayer1Pick) (O)odd or (E)ven
        selection value based on my Java language codes' operator conditions test; and, if the operator condition
        is true the loop will end or else the loop will continue to loop until the user (player 1) enter the correct
        condition value.
         */
        while (!userPlayer1Pick.startsWith("O") && !userPlayer1Pick.equals("Odd") && !userPlayer1Pick.startsWith("E") && !userPlayer1Pick.equals("Even")) {

            System.out.print(fullName + ", Please enter either (0)dd or (E)ven letter or typed in the whole word 'Odd' or 'Even' name. ");

            userPlayer1Pick = asksUserInput.nextLine();
        }
        /*
        Create a String variable names in order to store, the user (player 1) input value.
         */
        String O = "Odd";
        String Odd = "Odd";
        String E = "Even";
        String Even = "Even";
        /*
        Create an if /else statement in Java language codes in order to identify user's (player 1) (O)dd or (E)ven
        selection and, if the condition test is true then the appropriate print line statement will be displays onto the
        console window in the IntelliJ IDE compiler and, if the condition test is false then my written Java language
        codes will generate an exception error message.
         */
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
        /*
        Create an if /else statement in Java language codes in order to identify user's (player 1) (O)dd or (E)ven
        selection and, if the condition test is true then the appropriate print line statement will be displays onto the
        console window in the IntelliJ IDE compiler and, if the condition test is false then my written Java language
        codes will generate an exception error message.
         */
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
        // To call static method (Dashes()).
        Dashes();

        /*  Create a Scanner constructor to call when using "howManyFingersInput" special keyword, new in order to
            stream into the object's parameter System.in.
        */
        Scanner numberInput = new Scanner(System.in);

        /*  Write a Java language codes print line statement in order to asks the user (player 1) to enter any number value
            from 0 to 10,000,000.
        */
        System.out.print("Enter any number from 0 to 10,000,000: ");
        // Create an integer variable name for user (player 1) input value.
        int userNumber = numberInput.nextInt();
        /*
        Create a Random constructor to call when using "computerRandom" special keyword, new; in order to
        stream into an empty object's parameter that store Java language codes random numbers.
        */
        Random computerRandom = new Random();
        /*
        Create an integer variable name (computerPlayer) in which randomly select the computer (player 2) number value
        in order to play the Odds or Evens against user (player 1).
         */
        int computerPlayer = computerRandom.nextInt(100000000) + 1;
        /*
        Create a Java language codes print line statements in order to display user (player 1) amd computer (player 2)
        number selection outputs onto the IntelliJ IDE compiler.
        */
        System.out.println(fullName + ", you have chosen " + userNumber + ", as your number value selection.");
        System.out.println("And, the computer player 2 has selected " + computerPlayer + ", as it number value selection.");

        // To call static method (Dashes()).
        Dashes();
        /*
       Create in Java language codes in an integer variable (bothNumbers) for calculating user (player 1) and
       computer player 2 combine numbers.
         */
        int bothNumbers = userNumber + computerPlayer;
        /*
        Create an if / else statement in Java language codes to evaluate user (player 1) and computer (player 2) combine
        numbers' selections in order to determine, the total calculated number values in whether or not the total
        number is even then the user (player 1) wins the Odds or Evens game or if the total calculated number is
        odd then the computer (player 2) wins the Odds or Evens game.
         */
        System.out.println(fullName + ", selected number, " + userNumber + " and the Computer player 2 selected number, " + computerPlayer + " and, both players' numbers calculates to " + bothNumbers + ".");
        if (bothNumbers % 2 == 0) {
            System.out.println("The number " + bothNumbers + " results is even.");
            if (userPlayer1Pick.equals("E") || userPlayer1Pick.equals("Even")) {
                System.out.println(fullName + ", YOU HAVE WON the ODDS AND EVENS GAME!");
                } else {
                    System.out.println("The computer Player 2, HAVE WON THE ODDS AND EVENS GAME!");
                }
            }
        /*
        Create an if / else statement in Java language codes to evaluate user (player 1) and computer (player 2) combine
        numbers' selections in order to determine, the total calculated number values in whether or not the total
        number is odd then the user (player 1) wins the Odds or Evens game or if the total calculated number is
        even then the computer (player 2) wins the Odds or Evens game.
         */
        if (bothNumbers % 2 != 0) {
            System.out.println("The number " + bothNumbers + " results is odd.");
            if (userPlayer1Pick.equals("O") || userPlayer1Pick.equals("Odd")) {
                System.out.println(fullName + ", YOU HAVE WON the ODDS AND EVENS GAME!");
            } else {
                System.out.println("The computer Player 2, HAVE WON THE ODDS AND EVENS GAME!");
            }
        }
    }
    /*
    Create a static method in Java language in order to call the dashes function to separate sections
    in my file program.
     */
    public static void Dashes(){
        for (int i = 1; i <= 150; i++) {
            System.out.print("-");
        }
        System.out.println();
    }
}







