import java.util.Scanner;

/** This is a program that returns the annual home maintenance cost when provided with each seasonal cost.
 * Rather than having hardcoded values, scanners are used to collect input for each seasonal cost.
 */

public class Task02 {
    static void main() {
        // Declarations
            Scanner input = new Scanner(System.in);
            double springCost = 0.00;
            double summerCost = 0.00;
            double autumnCost = 0.00;
            double winterCost = 0.00;
            double annualCost = 0.00;
        // IPO
        System.out.print("Enter the home maintenance cost for Spring (no dollar signs please!)>> ");
        springCost = input.nextDouble();
        System.out.print("Enter the home maintenance cost for Summer (no dollar signs please!)>> ");
        summerCost = input.nextDouble();
        System.out.print("Enter the home maintenance cost for Autumn (no dollar signs please!)>> ");
        autumnCost = input.nextDouble();
        System.out.print("Enter the home maintenance cost for Winter (no dollar signs please!)>> ");
        winterCost = input.nextDouble();
        annualCost = springCost + summerCost + autumnCost + winterCost;
        System.out.printf("The home maintenance cost for Spring is $%.2f. For Summer, it is $%.2f. For Autumn, it is $%.2f. For Winter, it is $%.2f.%nWith that, the cumulative annual maintenance cost is $%.2f.", springCost, summerCost, autumnCost, winterCost, annualCost);
    }
}