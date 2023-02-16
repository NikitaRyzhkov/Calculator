import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Calc {
    Scanner scanner = new Scanner(System.in);

    public void menu() {
        System.out.println("Enter the number of operation");
        System.out.println("1 - '+' ");
        System.out.println("2 - '-' ");
        System.out.println("3 - '*' ");
        System.out.println("4 - '/' ");
        System.out.println("5 - Exit the program ");

    }

    public void exit() {
        scanner.close();
        System.out.println("The end");
    }

    public void addition() {
        try {
            System.out.println("Enter the first argument");
            BigDecimal arg1 = scanner.nextBigDecimal();
            System.out.println("Enter the second argument");
            BigDecimal arg2 = scanner.nextBigDecimal();
            System.out.println(String.format("The result: %g", arg1.add(arg2)));
        } catch (InputMismatchException e) {
            System.out.println("Wrong input");
        }

    }

    public void subtraction() {
        try {
            System.out.println("Enter the first argument");
            BigDecimal sub1 = scanner.nextBigDecimal();
            System.out.println("Enter the second argument");
            BigDecimal sub2 = scanner.nextBigDecimal();
            System.out.println(String.format("The result: %g", sub1.subtract(sub2)));
        } catch (InputMismatchException e) {
            System.out.println("Wrong input");
        }
    }

    public void product() {
        try {
            System.out.println("Enter the first multiplier");
            BigDecimal mult1 = scanner.nextBigDecimal();
            System.out.println("Enter the second multiplier");
            BigDecimal mult2 = scanner.nextBigDecimal();
            System.out.println(String.format("The result: %g", mult1.multiply(mult2)));
        } catch (InputMismatchException e) {
            System.out.println("Wrong input");
        }
    }

    public void division() {
        try {
            System.out.println("Enter the numerator");
            BigDecimal num = scanner.nextBigDecimal();
            System.out.println("Enter the second dominator");
            BigDecimal domin = scanner.nextBigDecimal();
            System.out.println(String.format("The result: %g", num.divide(domin, MathContext.DECIMAL64)));
        } catch (ArithmeticException e) {
            System.out.println("Division by zero is impossible");
        } catch (InputMismatchException e) {
            System.out.println("Wrong input ");
        }


    }
}

