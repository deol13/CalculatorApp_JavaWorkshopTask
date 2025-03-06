package se.lexicon;

import java.util.Scanner;

public class UserInteractionHelper {
    private static final Scanner scanner = new Scanner(System.in);

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
    public static double doubleInputFromUser(String text){
        System.out.println(text);
        return scanner.nextDouble();
    }
    public static int intInputFromUser(){
        return scanner.nextInt();
    }
}
