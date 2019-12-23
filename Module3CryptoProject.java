/*
        In my Module Three (3) online course for “Learn to Program in Java,” for Recursion Methods.
        I am instructed to write five (5) sections in a Static Method Calls using Primitive Data types Strings for
        in my written Java language file program for "Encrypting and Decrypting Project," are as follows:

        1. Write a Static Method call, normalizeText() user input texts, so that it is easier to work with.
            a) Removes all the spaces from your texts,
            b) Removes any punctuation (.,::'"!?()),
            c) Turn all lower-case letters into upper-case letter.

        I, Sarai Hannah Ajai had completed only 20% of my Module Three (3) online course for “Learn to Program in Java,” for an
        Encrypting and Decrypting Project, written for the Java language file program (Module3CryptoProject) dated on
        December 22, 2019.
*/

import java.util.*;
public class Module3CryptoProject {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentences :");
        // Create Method Call String "unnormalizationText variable which accept two (2) parameters' values that calls and
        // flows into the Static Method header, name "normalizeText."
        String unnormalizationText =  normalizeText("This is some \"really\" great. (Text)!?", 37);
        // Add console window space.
        System.out.println();
        // Create print line statement for the Part one (1) title in my Java language File program section name, Normalize Text.
        System.out.print("Part 1 - Normalize Texts:  ");
        // Create print line statement in order to return, "normalizedText" recursive method results onto the console window.
        System.out.print(unnormalizationText);
        // Add console window space.
        System.out.println();
    }
    // Create Static Method name, normalizeText that passes the values of String (normalizedText) and the integer (int indexRolls)
    // into the "Actual Parameter or Signature (Function)" variable names, (String normalizedText and int indexRolls).
    public static String normalizeText(String normalizedText, int indexRolls) {
        // Create an if statement that flows the Actual Parameter or Signature (Function) variable names, (String
        // normalizedText and int indexRolls) values into the length of the Strings (normalizedText). If not equal to (!=) to the
        // index total number of Strings, which is 37, my program will throw an exception error message.
        if (normalizedText.length() != indexRolls) {
            throw new IllegalArgumentException("Your output displays a String exception issue.");
        }
        // Create another if statement for the length of the Strings which is, equal to (==) zero (0) for the base case solution
        // when the smallest piece of the condition expression test is true then the length of the Strings flows or passes into the
        // else statement and, the base case solution is similar to the for loop's condition expression test.
        if (normalizedText.length() == 0) {
            return "";
        } else {
            // Create an if statement which, test the length of the Strings that is equal to (==) the index total number
            // of Strings, which is 37 and if the condition expression is true then the String normalizedText value
            // flows to the recursive case that calls, these Stack Calls (loops) with a different index String value which,
            // passes through my base case and store these index values results, in the return statement.
            //
            if (normalizedText.length() == indexRolls) {
                return normalizedText.replace(" ", "")
                        .replace(".", "")
                        .replace(",", "")
                        .replace(":", "")
                        .replace(";", "")
                        .replace("'", "")
                        .replace("\"", "")
                        .replace("!", "")
                        .replace("?", "")
                        .replace(")", "")
                        .replace("(", "")
                        .toUpperCase();
                } else {
                    return "";
                }
            }
        }
}
