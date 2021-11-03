package HigherLower;

/*
    Exercise 5.4 Prompt

    Design and implement an application that plays the Hi-Lo guessing game with numbers. The
    program should pick a random number between 1 and 100 (inclusive), then repeatedly prompt
    the user to guess the number. On each guess, report to the user that he or she is correct or that
    the guess is high or low. Continue accepting guesses until the user guesses correctly or chooses
    to quit. Use a sentinel value to determine whether the user wants to quit. Count the number of
    guesses and report that value when the user guesses correctly. At the end of each game (by
    quitting or a correct guess), prompt to determine whether the user wants to play again. Continue
    playing games until the user chooses to stop.
 */

public class HiLo {

    private int rdm, result;

    public HiLo() {
        generateRdm();
    }

    public int generateRdm() {
        int random = (int) (Math.random() * 101);
        rdm = random;
        return rdm;
    }

    public int compareNum(int input) {
        if (input == rdm) {
            result = 0;
        }
        else if (input < rdm) {
            result = -1;
        }
        else if (input > rdm) {
            result = 1;
        }
        else {
            result = 2;
        }
        return result;
    }
}
