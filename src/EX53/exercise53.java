package EX53;
import java.util.Scanner;

/*
    Exercise 5.3 Prompt
    Design and implement an application that determines and prints the number of odd, even,
    and zero digits in an integer value read from the keyboard.
 */

public class exercise53 {

    public static void main(String[] args) {
        int num, len = 0, index = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter number:");
        num = input.nextInt();

        String number = new String(Integer.toString(num));
        len = number.length();

        while (index < len) {
            String tempNum = number.substring(index, index+1);
            int i = Integer.parseInt(tempNum);
            if (((i % 2) == 0) && !(i == 0)) {
                System.out.println("The number at index " + index + " is even.");
                index++;
            }
            else if (((i % 2) - 1) == 0){
                System.out.println("The number at index " + index + " is odd.");
                index++;
            }
            else {
                System.out.println("The number at index " + index + " is zero");
                index++;
            }
        }

    }
}
