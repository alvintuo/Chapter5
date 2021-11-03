package HigherLower;
import java.util.Locale;
import java.util.Scanner;

public class Run {

    public static void main(String[] args) {
        boolean play = false;
        while (play = true) {
            int attempts = 0;
            System.out.println("Welcome to the Higher or Lower game. Please enter a valid integer between 0 and 100.");
            boolean didWin = false;
            HiLo hilo = new HiLo();
            hilo.generateRdm();

            while (didWin == false) {

                Scanner num = new Scanner(System.in);
                int in = num.nextInt();
                int result = hilo.compareNum(in);

                if (result == 0) {
                    attempts++;
                    System.out.println("You won! It took you " + attempts + " attempts to win this time...");
                    System.out.println("Play again? (Y/N)");
                    Scanner question = new Scanner(System.in);
                    String q = question.nextLine();
                    q.toLowerCase();
                    if (q == "y") play = true;
                    else if (q == "n") play = false;
                    else System.out.println("Error: Invalid input.");
                    didWin = true;
                }

                if (result > 0) {
                    System.out.println("Too high! Guess again.");
                    attempts++;
                }

                if (result < 0) {
                    System.out.println("Too low! Guess again.");
                    attempts++;
                }

            }

        }

    }
}
