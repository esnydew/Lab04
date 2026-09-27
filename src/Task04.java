import java.util.Scanner;

/** The following program takes an integer and uses the modulo function to indicate if the number is odd or even. Though the instructions ask the integer to be hardcoded since input is outside the scope, I have gone ahead and added more functionality. If it were hardcoded, you would simply change the value instantiating the variable numToExamine alongside its declaration.
 */

public class Task04 {
    static void main() {
        // Declarations
            Scanner input = new Scanner(System.in);
            int numToExamine = 0;
        // IPO
        System.out.print("Please enter the number to be examined>> ");
        numToExamine = input.nextInt();
        if (numToExamine % 2 == 0) {
            System.out.print("This number is even.");
        }
        else {
            System.out.print("This number is odd.");
        }
    }
}
