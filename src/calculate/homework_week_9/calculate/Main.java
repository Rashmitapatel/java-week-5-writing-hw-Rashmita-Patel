package calculate.homework_week_9.calculate;

import calculate.Calculator;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(System[]args){
        //declaring a scanner object
        Scanner scanner = new Scanner(System.in);
        String answer = null;
        do{
            System.out.println("Please first number:");
            // input wizard
            int a = scanner.nextInt();
            System.out.println("please second number:");
            int b  = scanner.nextInt();
            System.out.println("please enter one of symbol + ,- ,*,/:");
            //input wizard`
            char symbol = scanner.next().charAt(0);
            Calculator calculator = new Calculator();
            calculator.calculateResult(a,b,symbol);
            System.out.println("Would you like to do more calculation Please enter 'Y'or 'N':");//
           // input wizard
            scanner.next().toLowerCase(Locale.ROOT);
        }
        while (answer.startsWith("y"));
        //closing a scanner object
        scanner.close();
    }
}
