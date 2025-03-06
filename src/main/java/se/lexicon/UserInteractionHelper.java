package se.lexicon;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInteractionHelper {
    public static final Scanner scanner = new Scanner(System.in);

    public static void menu()
    {
        String menu = "Welcome to my calculator app.\n" +
                "Enter the number of operator you want to use:\n" +
                "1. Addition\n" +
                "2. Subtraction\n" +
                "3. Multiplication\n" +
                "4. Division\n" +
                "5. Exit";
        System.out.println(menu);
    }

    public static void showUserText(String text){
        System.out.println(text);
    }
    //
    public static double doubleInputFromUser(String text){
        boolean errors = false;
        double input = 0;

        do{
            errors = false;
            System.out.println(text);
            try{
                input = scanner.nextDouble();
            }
            catch (InputMismatchException exception) {
                String emptyScanner = scanner.nextLine();
                System.out.println("Invalid input, try again.");
                errors = true;
            }
        } while (errors);

        return input;
    }
    public static int intInputFromUser(){
        boolean errors = false;
        int input = -1;
        do{
            errors = false;
            try {
                input = scanner.nextInt();
            }
            catch (InputMismatchException exception){
                // NextInt and similar scanner methods doesn't clear / consume invalid tokens.
                // So in case of errors, next time such methods are used it takes the old error input.
                // So nextLine or next needs to be used to clear / consume the invalid token.
                String emptyScanner = scanner.nextLine();
                System.out.println("Invalid input, try again.");
                errors = true;
            }
        } while (errors);

        return input;
    }
}
