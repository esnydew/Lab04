import java.util.Scanner;

/** This is a program that takes the inputted (given) price of a purchase and then computes and outputs a 5% sales tax. It outputs gross price, sales tax amount, and total price. Scanner input was researched through w3schools.com, as was formatted strings.
 */

public class Task01 {
    static void main() {
        // Declarations
            Scanner input = new Scanner(System.in);
            double purchasePrice; // Inputted by user
            double salesCost;
            double SALES_TAX = 0.05;
            double finalPrice;
        // IPO
            System.out.print("Please enter the gross purchase price (No dollar sign!)>> ");
            purchasePrice = input.nextDouble();
            salesCost = purchasePrice * SALES_TAX;
            finalPrice = purchasePrice + salesCost;
            System.out.printf("The gross price is $%.2f. The cost of sales tax is $%.2f. The total price is $%.2f.%n",
                    purchasePrice, salesCost, finalPrice);
    }
}

