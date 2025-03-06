package se.lexicon;

import java.util.ArrayList;
import java.util.List;

public class CalculatorApp {
    public static void main(String[] args) {
        boolean keepRunning = true;

        do{
            UserInteractionHelper.menu();
            int userSelection = UserInteractionHelper.intInputFromUser();

            switch (userSelection){
                case 1: // Addition
                    additionSelected();
                    break;
                case 2: // Subtraction
                    subtractionSelected();
                    break;
                case 3: // Multiplication
                    multiplicationSelected();
                    break;
                case 4: // Division
                    divisionSelected();
                    break;
                case 5: // Exit
                    UserInteractionHelper.showUserText("Good bye.");
                    keepRunning = false;
                    break;
                default:
                    UserInteractionHelper.showUserText("Not a valid menu option.\n");
                    break; // Use continue if necessary
            }

        } while (keepRunning);
    }

    private static void additionSelected(){
        boolean keepGettingNewNumbers = true;
        List<Double> nums = new ArrayList<Double>();

        UserInteractionHelper.showUserText("This addition takes any number of numbers, if you want to stop inputting numbers, input a 0.");

        do {
            double num = UserInteractionHelper.doubleInputFromUser("Input a number: ");
            if (num != 0)
                nums.add(num);
            else
                keepGettingNewNumbers = false;
        } while (keepGettingNewNumbers);

        double sum = Calculator.addition(nums);
        UserInteractionHelper.showUserText("The sum of all the numbers is: " + sum + "\n");
    }
    private static void subtractionSelected(){
        boolean keepGettingNewNumbers = true;
        List<Double> nums = new ArrayList<Double>();

        UserInteractionHelper.showUserText("This subtraction takes any number of numbers, if you want to stop inputting numbers, input a 0.");

        do {
            double num = UserInteractionHelper.doubleInputFromUser("Input a number: ");
            if (num != 0)
                nums.add(num);
            else
                keepGettingNewNumbers = false;
        } while (keepGettingNewNumbers);

        double sum = Calculator.subtraction(nums);
        UserInteractionHelper.showUserText("The minuend(result) of all the numbers is: " + sum + "\n");
    }
    private static void multiplicationSelected(){
        UserInteractionHelper.showUserText("This multiplication takes two numbers.");
        double num1 = UserInteractionHelper.doubleInputFromUser("Input first number");
        double num2 = UserInteractionHelper.doubleInputFromUser("Input second number");

        double sum = Calculator.multiplication(num1, num2);
        UserInteractionHelper.showUserText("The product(result) of " + num1 + " * " + num2 + " is: " + sum + "\n");
    }
    private static void divisionSelected(){
        UserInteractionHelper.showUserText("This division takes two numbers.");
        double num1 = UserInteractionHelper.doubleInputFromUser("Input first number");
        double num2 = UserInteractionHelper.doubleInputFromUser("Input second number");

        double sum = Calculator.division(num1, num2);
        UserInteractionHelper.showUserText("The quotient(result) of " + num1 + " / " + num2 + " is: " + sum + "\n");
    }
}
