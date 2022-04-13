import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class shawnscalculator {

    public static void main(String args[]) {
        String input = "";
        System.out.println("Welcome to the dashboard please select a place to go. \n 1.Calculator \n 2.Exit Program");
        Scanner stdin = new Scanner(System.in);
        input = stdin.nextLine();
        if (input.equals("1")) {
            int resolvedAnswer = (CalculatorDash());
            System.out.println(resolvedAnswer);

        } else if (input.equals("2")) {
            System.out.println("Thanks for visiting.");
        }
    }

    public static int CalculatorDash() {
        Scanner stdin = new Scanner(System.in);
        int numberOne;
        int numberTwo;
        String input = "";
        System.out.println("Enter a number.");
        numberOne = Integer.parseInt(stdin.nextLine());
        System.out.println("Please enter the next number.");
        numberTwo = Integer.parseInt(stdin.nextLine());

        System.out.println("Please type in the operation you would like to perform.(add/subtract/multiply/divide).");
        input = stdin.nextLine();
        if (input.equalsIgnoreCase("add")) {
            return (numberOne + numberTwo);
        } else if (input.equalsIgnoreCase("subtract")) {
            return (numberOne - numberTwo);
        } else if (input.equalsIgnoreCase("multiply")) {
            return (numberOne * numberTwo);
        } else if (input.equalsIgnoreCase("divide")) {
            return (numberOne / numberTwo);
        }return 0;
    }
}