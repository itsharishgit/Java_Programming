package Projects;

import java.util.Scanner;

import utilityClass.ArithmaticOps;

public class Calculator {

    public static void main(String[] args) {

        boolean flag = true;
        // Global variable
        String operator = "";

        Scanner scanner = new Scanner(System.in);
        ArithmaticOps arithmaticOps = new ArithmaticOps();

        System.out.println("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.println("Enter the second number: ");
        int num2 = scanner.nextInt();

        while (flag) {
            System.out.println("Calculator");
            System.out.println("----------------");
            System.out.println("+ for addition");
            System.out.println("- for subtraction");
            System.out.println("* for multiplication");
            System.out.println("/ for division");
            System.out.println("% for modulo");
            System.out.println("Give All operations");
            System.out.println("exit for exit");

            System.out.println("Enter the operator: ");
            operator = scanner.nextLine();
            switch (operator) {
                case "+":
                    System.out.println("Addition: " + arithmaticOps.add(num1, num2));
                    break;
                case "-":
                    System.out.println("Subtraction: " + arithmaticOps.sub(num1, num2));
                    break;
                case "*":
                    System.out.println("Multiplication: " + arithmaticOps.mul(num1, num2));
                    break;
                case "/":
                    System.out.println("Division: " + arithmaticOps.div(num1, num2));
                    break;
                case "%":
                    System.out.println("Modulo: " + arithmaticOps.mod(num1, num2));
                    break;
                case "Give All operations":
                    arithmaticOps.ArithmaticOperations(num1, num2);
                    break;
                default:
                    System.out.println("Invalid operator");
                    if (operator.equals("exit") || operator.matches("[a-zA-Z]+[0-9]*")) {
                        flag = false;
                    }
            }

        }

        scanner.close();

    }

}
