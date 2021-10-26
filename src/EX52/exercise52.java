package EX52;
import java.util.Scanner;

public class exercise52 {
    /*
    Exercise 5.1 Prompt
    Design and implement an application that reads an integer value representing a year from
    the user. The purpose of the program is to determine if the year is a leap year (and therefore has
    29 days in February) in the Gregorian calendar. A year is a leap year if it is divisible by 4, unless it
    is also divisible by 100 but not 400. For example, the year 2003 is not a leap year, but 2004 is.
    The year 1900 is not a leap year because it is divisible by 100, but the year 2000 is a leap year
    because even though it is divisible by 100, it is also divisible by 400. Produce an error message
    for any input value less than 1582 (the year the Gregorian calendar was adopted).

    Exercise 5.2
    Modify the solution to the previous project so that the user can evaluate multiple years. Allow
    the user to terminate the program using an appropriate sentinel value. Validate each input value
    to ensure it is greater than or equal to 1582.
     */

    public static void main(String[] args) {
        int index = 0, numEntries, year;

        Scanner entries = new Scanner(System.in);
        System.out.println("Enter number of entries:");
        numEntries = entries.nextInt();

        while (index < numEntries) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Year:");
            year = sc.nextInt();

            boolean is100 = false, is400 = false, is4 = false;

            if ((year % 100) == 0) {
                is100 = true;
            }
            if ((year % 400) == 0) {
                is400 = true;
            }
            if ((year % 4) == 0) {
                is4 = true;
            }

            if (is400) {
                System.out.println("The year " + year + " is a leap year");
            } else if (!is100 && is4) {
                System.out.println("The year " + year + " is a leap year");
            } else {
                System.out.println("The year " + year + " is NOT a leap year");
            }
            index++;
        }
    }
}
