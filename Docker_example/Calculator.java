import java.util.Scanner;

public class Calculator {
    
    // Method to add two numbers
    public static double add(double num1, double num2) {
        return num1 + num2;
    }
    
    // Method to subtract two numbers
    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }
    
    // Method to multiply two numbers
    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }
    
    // Method to divide two numbers
    public static double divide(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            throw new ArithmeticException("Cannot divide by zero.");
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter first number: ");
        double num1 = scanner.nextDouble();
        
        System.out.println("Enter second number: ");
        double num2 = scanner.nextDouble();
        
        System.out.println("Select operation: ");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        
        int choice = scanner.nextInt();
        
        double result;
        
        switch (choice) {
            case 1:
                result = add(num1, num2);
                System.out.println("Result: " + result);
                break;
            case 2:
                result = subtract(num1, num2);
                System.out.println("Result: " + result);
                break;
            case 3:
                result = multiply(num1, num2);
                System.out.println("Result: " + result);
                break;
            case 4:
                try {
                    result = divide(num1, num2);
                    System.out.println("Result: " + result);
                } catch (ArithmeticException e) {
                    System.out.println(e.getMessage());
                }
                break;
            default:
                System.out.println("Invalid choice.");
        }
        
        scanner.close();
    }
}
