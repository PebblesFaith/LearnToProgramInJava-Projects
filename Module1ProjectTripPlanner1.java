import java.util.Scanner;
// import java.util.Arrays;
import java.util.Date;
import java.text.SimpleDateFormat;

/* Name: Sarai Hannah Ajai
   Online Course: Learn to Program in Java (Microsoft Dev 276x)
   Module 1 | Project - Trip Planner
   Chapters: Building Java Programs - A Back to Basics Approach 5e - Chapter 2 and 3 (Section: 3:3 Interactive Programs and Scanner Objects)
   Instructor: Kasey Champion
   Date: November 14, 2019
 */

/*  In my online course “Learn to Program in Java,” for module one (1) project, I am instructed to write an user Trip
    Planner International Program that asks the user for some input value information onto the console window
    about his or her international trip in which, user is schedule to take in the near future. And, I am instructed in the
    module one (1) project to write in Java language an interactive program between my written Java codes and the
    user input value responses information displayed interactions onto the console window from my Java coded
    print line statements’ questions through that are Java coded in mathematical computation conversions using the
    correct literal data types. In order to assists user to plan his or her international trip.  This online course “Learn to
    Program in Java,” project for Module 1 is dated on November 14, 2019.
 */

public class Module1ProjectTripPlanner1 {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Module 1 | Project - Trip Planner International 1 - Java by Sarai Hannah Ajai");
        System.out.println();

        Scanner greetings = new Scanner(System.in);
            System.out.println("Welcome to our International Vacation Trip Planner Web Application.");
            System.out.print("What is your first and last name?");
                String username = greetings.nextLine();
            System.out.print("Nice to meet you " +  username + ", where are you travelling international to? ");
                String country = greetings.nextLine();
            System.out.println("Great! " +  country + " sounds like a great international trip. And, we can assist you in your international vacation scheduling.");
            System.out.println("************");
            System.out.println();

            System.out.print(username + ", how many day[s] have you allocated to schedule on travelling?");
                int numberOfDays = greetings.nextInt();
            System.out.print(username + ", how much money in United States Dollars (\"USD\") are you budget on spending for your international trip?");
                double spendingAmount = greetings.nextDouble();
            System.out.println(username + ", you have planned your international vacation for " + numberOfDays  + " day[s] and, your budget spending is " + spendingAmount + "?");

            System.out.print(username + " is this correct yes or no?");
                String yesNoAnswer = greetings.next();
            System.out.println(username + ", you have answered " + yesNoAnswer + " for " + numberOfDays + " day[s] schedule for your international vacation and you have budgeted a " +  spendingAmount + " in spending amount." );


            String[] threeLettersCountryArray = {"USA", "CAD", "MXN", "NZD", "JPY", "CNY", "ISK", "AED", "ZAR", "PHP", "DOP"};

            System.out.print(username + " , what is the three (3) Alpha Letters code currency for your international travel destinations?");
                String userThreeLetterCountry = greetings.next();

                for (int i = 0; i < threeLettersCountryArray.length; i++) {
                    if (threeLettersCountryArray[i].equals(userThreeLetterCountry)) {
                        System.out.println("match " + username + " " + userThreeLetterCountry);
                    } else  {
                        System.out.println("Do Not match " + username + " " + userThreeLetterCountry );
                    }
                }

            System.out.print(username + " , what is the current foreign value or rate for a " + userThreeLetterCountry + " currency?");
                double foreignRate = greetings.nextDouble();

            int hours = 24;
            int minutes = 60;

            System.out.println(username + ", if you are travelling for " + numberOfDays + " day[s] that is the same as " + (numberOfDays * hours) + " hours or " + ((hours * minutes) * numberOfDays) + " minutes.");
            System.out.println(username + ", if you are going to spend $ " + (spendingAmount) + " in the United States that means per day, you can spend up to " + ((spendingAmount) / numberOfDays) + " in the United States.");
            System.out.println(username + ", your total budget for spending in " + country + " currency is " + (spendingAmount * foreignRate) + ", which per day is " + ((spendingAmount * foreignRate) / numberOfDays) + " in " + country + " currency.");
            System.out.println("************");
            System.out.println();

            System.out.print(username + ", what is the time of your location, in hours to your vacation destination in Military time? (e.g. Military Time as 08:00)");
                String startClockTime = greetings.next();
            System.out.print(username + ", what is the time in hours to your vacation destination in Military time? (e.g. Military Time as 17:00)");
                String endClockTime = greetings.next();

            SimpleDateFormat format = new SimpleDateFormat("HH:mm");
            String result = null;
            try {
                Date hour1 = format.parse(startClockTime);
                Date hour2 = format.parse(endClockTime);
                long difference = hour2.getTime() - hour1.getTime();
                difference = difference / 1000;
                long hoursTravel = difference / (60 * 60) % 24;
                long minutesTravel = hoursTravel * 60;
                System.out.println(username + " you have entered, your vacation destination start time from your location as " + startClockTime + " in military hours and, you have entered for your international travel vacation destination end time as " + endClockTime + " in military hours.");
                System.out.println(username + " this means you are scheduling to travel internationally for " + hoursTravel + " hours and " + minutesTravel + " minutes from your original location to " + country + ".");

                System.out.println(hoursTravel + " hours, ");
                System.out.println(minutesTravel + " minutes, ");

            } catch (Exception e) {
                e.printStackTrace();
            }

            System.out.println("************");
            System.out.println();

            System.out.print(username + ", what is the total miles from your current airport location in the United States to your international " + country + " country destination airport?");
            double miles = greetings.nextDouble();

            double kilometer = 1.609344;
            double nauticalMiles = .868976;
            System.out.println(username + ", you are scheduling to travel from the United States to " + country + " in miles of " + miles + "(miles).");
            System.out.println(username + ", this means, you will travel from the United States to " + country + " in kilometer of " + miles * kilometer + " (km).");
            System.out.println(username + ", this means, you will travel from the United States to " + country + " in nautical miles of " + miles * nauticalMiles + " (nautical miles).");
        }
}

