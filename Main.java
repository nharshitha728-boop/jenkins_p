import java.util.Scanner;
//calculator
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2, result = 0;
        char operator;
        boolean validOperation = true;

        // Prompt user for input
        System.out.println("Enter first number:");
        if (scanner.hasNextDouble()) {
            num1 = scanner.nextDouble();
        } else {
            System.out.println("Invalid input for the first number.");
            scanner.close();
            return;
        }

        System.out.println("Enter an operator (+, -, *, /):");
        operator = scanner.next().charAt(0);

        System.out.println("Enter second number:");
        if (scanner.hasNextDouble()) {
            num2 = scanner.nextDouble();
        } else {
            System.out.println("Invalid input for the second number.");
            scanner.close();
            return;
        }

        // Perform the calculation using a switch statement
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Error! Division by zero is not allowed.");
                    validOperation = false;
                } else {
                    result = num1 / num2;
                }
                break;
            default:
                System.out.println("Error! Invalid operator entered.");
                validOperation = false;
                break;
        }

        // Print the result if the operation was valid
        if (validOperation) {
            System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
        }

        // Close the scanner
        scanner.close();
    }
}
