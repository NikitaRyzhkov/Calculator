import java.math.MathContext;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Calc {
    Scanner scanner = new Scanner(System.in);
    InputHandler handler = new InputHandler();
    //комментарий комментарий комментарий
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
            handler.enterNums();
            System.out.println(String.format("The result: %g", handler.getArg1().add(handler.getArg2())));
        } catch (InputMismatchException e) {
            System.out.println("Wrong input");
        }

    }

    public void subtraction() {
        try {
            handler.enterNums();
            System.out.println(String.format("The result: %g", handler.getArg1().subtract(handler.getArg2())));
        } catch (InputMismatchException e) {
            System.out.println("Wrong input");
        }
    }

    public void product() {
        try {
            handler.enterNums();
            System.out.println(String.format("The result: %g", handler.getArg1().multiply(handler.getArg2())));
        } catch (InputMismatchException e) {
            System.out.println("Wrong input");
        }
    }

    public void division() {
        try {
            handler.enterNums();
            System.out.println(String.format("The result: %g", handler.getArg1().divide(handler.getArg2(), MathContext.DECIMAL64)));
        } catch (ArithmeticException e) {
            System.out.println("Division by zero is impossible");
        } catch (InputMismatchException e) {
            System.out.println("Wrong input ");
        }


    }
}

