void main() {
    // Declarations
        int intOperandA = 1;
        int intOperandB = 2;
        int intSum = 3;
        int intProduct = 5;
        int intDifference = 7;
        int intQuotient = 9;
        int intModulo = 11;
        double doubleOperandA = 3.50;
        double doubleOperandB = 2.32;
        double doubleSum = 5.82;
        double doubleProduct = 12.04;
        double doubleDifference = 15.00;
        double doubleQuotient = 0.00;
    // IPO
    intSum = intOperandA + intOperandB; // Take the integer operands A and B, and then add them with the arithmetic operator +
    System.out.println("The sum of the integers " + intOperandA + " and " + intOperandB + " is " + intSum); // Output statement

    intProduct = intOperandA * intOperandB; // Take the integer operands A and B, and then multiply them with the arithmetic operator *
    System.out.println("The product of the integers " + intOperandA + " and " + intOperandB + " is " + intProduct); // Output Statement

    intDifference = intOperandA - intOperandB; // Take the integer operands A and B, and then subtract them with the arithmetic operator -
    System.out.println("The difference of the integers " + intOperandA + " and " + intOperandB + " is " + intDifference); // Output Statement

    intQuotient = intOperandA / intOperandB; // Take the integer operands A and B, and then divide them with the arithmetic operator /
    System.out.println("The quotient of the integers " + intOperandA + " and " + intOperandB + " is " + intQuotient); // Output Statement

    intModulo = intOperandA % intOperandB; // Take the integer operands A and B, and then divide them and return the remainder with the arithmetic operator %
    System.out.println("The remainder of the integers " + intOperandA + " and " + intOperandB + " is " + intModulo); // Output Statement

    doubleSum = doubleOperandA + doubleOperandB; // Take the double operands A and B, and then add them with the arithmetic operator +
    System.out.println("The sum of the doubles " + doubleOperandA + " and " + doubleOperandB + " is " + doubleSum); // Output Statement

    doubleProduct = doubleOperandA * doubleOperandB; // Take the double operands A and B, and then multiply them with the arithmetic operator *
    System.out.println("The product of the doubles " + doubleOperandA + " and " + doubleOperandB + " is " + doubleProduct); // Output Statement

    doubleDifference = doubleOperandA - doubleOperandB; // Take the double operands A and B, and then subtract them with the arithmetic operator -
    System.out.println("The difference of the doubles " + doubleOperandA + " and " + doubleOperandB + " is " + doubleDifference); // Output Statement

    doubleQuotient = doubleOperandA / doubleOperandB; // Take the double operands A and B, and then divide them with the arithmetic operator /
    System.out.println("The quotient of the doubles " + doubleOperandA + " and " + doubleOperandB + " is " + doubleQuotient); // Output Statement
}