/** A program that takes an initial credit card balance of $5000.00 and then calculates the interest on that card at a rate of 17%, with no payments, and displays the interest due after one and two months.
 */

public class Task03 {
    static void main() {
        // Declarations
            double firstMonthInterest = 0.00;
            double firstMonthBalance = 0.00;
            double secondMonthInterest = 0.00;
            double secondMonthBalance = 0.00;
            double INTEREST_RATE = 0.17;
            double BALANCE = 5000.00;
        // IPO
        System.out.printf("The initial balance is $%.2f.%n", BALANCE);
        firstMonthInterest = BALANCE * INTEREST_RATE;
        firstMonthBalance = BALANCE + firstMonthInterest;
        System.out.printf("Provided no payments are made, the interest due for the first month is $%.2f. The total after the first month is $%.2f.%n", firstMonthInterest, firstMonthBalance);
        secondMonthInterest = firstMonthBalance * INTEREST_RATE;
        secondMonthBalance = firstMonthBalance + secondMonthInterest;
        System.out.printf("Provided no payments are made, the interest due for the second month is $%.2f. The total after the first month is $%.2f.", secondMonthInterest, secondMonthBalance);
    }
}
