import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Calc calc = new Calc();

        int operation;
        do {
            calc.menu();

            operation = scanner.nextInt();


            switch (operation) {
                case 1 -> calc.addition();
                case 2 -> calc.subtraction();
                case 3 -> calc.product();
                case 4 -> calc.division();
                case 5 -> calc.exit();
                default -> System.out.println("Wrong sign. Run the program again");
            }

        }


        while (operation != 5);

        scanner.close();
    }
}


