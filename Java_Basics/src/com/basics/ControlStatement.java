public class ControlStatement {

    public static void main(String[] args) {

        // Global variables
        int num1 = 10;
        int num2 = 20;

        // Conditional statements
        // if, else if, else conditions
        if (num1 > num2) {
            System.out.println(num1 + "is greater than " + num2);
        } else if (num1 < num2) {
            System.out.println(num1 + "is less than " + num2);
        } else {
            System.out.println(num1 + "is equal to " + num2);
        }

        // Maximum of three numbers
        int num3 = 30;
        if (num1 > num2 && num1 > num3) {
            System.out.println(num1 + "is greater than " + num2 + " and " + num3);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println(num2 + "is greater than " + num1 + " and " + num3);
        } else {
            System.out.println(num3 + "is greater than " + num1 + " and " + num2);
        }

        // switch case
        int day = 1;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }

        // Jumping statements
        // break, continue, return, throw

        // control flow statements
        // for, while, do while

        // for loop, user knows the starting and ending points then he use for loop
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        // while loop, user knows the starting point, he doesn't know the ending point
        int i = 3;
        while (i < 10) {
            i = i + 5;
            System.out.println(i);
            // i++;
        }

        // do while loop, user atleast runs the loop onces besides the conditions
        int j = 9;
        do {
            System.out.println(j);
            j++;
        } while (j <= 10);

        // break statement, it will break the loop when the condition is met, it will
        // not execute the remaining statements
        for (int k = 1; k <= 10; k++) {
            if (k == 5) {
                break;
            }
            System.out.println(k);
        }

        // continue statement, it will skip the iteration when the condition is met, it
        // will execute the remaining statements
        for (int l = 1; l <= 10; l++) {
            if (l == 5) {
                continue;
            }
            System.out.println(l);
        }

    }

}
