import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class ComplexCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> history = new ArrayList<>();
        
        boolean continueCalculating = true;

        while (continueCalculating) {
            System.out.println("Enter the value of A: ");
            double number1 = scanner.nextDouble();

            System.out.println("Enter the value of B: ");
            double number2 = scanner.nextDouble();

            scanner.nextLine();

            System.out.println("What operation do you want to use? (+, -, x, /, q to quit, c to clear history): ");
            String operation = scanner.nextLine();

            switch (operation) {
                case "+":
                    double resultAdd = number1 + number2;
                    System.out.printf("%f + %f = %f%n", number1, number2, resultAdd);
                    history.add(number1 + " + " + number2 + " = " + resultAdd);
                    break;
                case "-":
                    double resultSubtract = number1 - number2;
                    System.out.printf("%f - %f = %f%n", number1, number2, resultSubtract);
                    history.add(number1 + " - " + number2 + " = " + resultSubtract);
                    break;
                case "x":
                    double resultMultiply = number1 * number2;
                    System.out.printf("%f x %f = %f%n", number1, number2, resultMultiply);
                    history.add(number1 + " x " + number2 + " = " + resultMultiply);
                    break;
                case "/":
                    if (number2 != 0) {
                        double resultDivide = number1 / number2;
                        System.out.printf("%f / %f = %f%n", number1, number2, resultDivide);
                        history.add(number1 + " / " + number2 + " = " + resultDivide);
                    } else {
                        System.out.println("Division by zero is not allowed.");
                    }
                    break;
                case "q":
                    System.out.println("Exiting the calculator.");
                    continueCalculating = false;
                    break;
                case "c":
                    history.clear();
                    System.out.println("Calculation history cleared.");
                    break;
                default:
                    System.out.println("Invalid operation. Please try again.");
                    break;
            }
        }
        
        // Display calculation history
        if (!history.isEmpty()) {
            System.out.println("Calculation History:");
            for (String entry : history) {
                System.out.println(entry);
            }
        }
    }
}