public class DataVariables {

    public static void main(String[] args) {

        // single line print statement
        System.out.println("Hello World");

        // comments two types
        // 1. single line comment
        // 2. multiple line comment

        // => single line comment

        /*
         * => multiple line comment
         */

        // Data Types
        // 1. Primitive Data Types
        // 2. Non-Primitive Data Types

        // Primitive Data Types
        // 1. byte
        // 2. short
        // 3. int
        // 4. long
        // 5. float
        // 6. double
        // 7. char
        // 8. boolean

        // Non-Primitive Data Types
        // 1. String
        // 2. Array
        // 3. Class
        // 4. Interface

        // Data types are used to declaration & initialization of variables
        int a = 10;
        System.out.println("Int Value " + a);

        double b = 10.5;
        System.out.println("Double Value " + b);

        char c = 'a';
        System.out.println("Char Value " + c);

        boolean d = true;
        System.out.println("Boolean Value " + d);

        String e = "Hello";
        System.out.println("String Value " + e);

        // Arithmatic operations
        int x = 10;
        int y = 20;
        System.out.println("Addition of x and y " + (x + y));
        System.out.println("Subtraction of x and y " + (x - y));
        System.out.println("Multiplication of x and y " + (x * y));
        System.out.println("Division of x and y " + (x / y)); // division gives quotient
        System.out.println("Modulus of x and y " + (x % y)); // division gives remainder

        // Assignment operators
        int num = 10;
        num += 10; // num = num + 10
        System.out.println("Addition of num and 10 " + num);

        num -= 10; // num = num - 10
        System.out.println("Subtraction of num and 10 " + num);

        num *= 10; // num = num * 10
        System.out.println("Multiplication of num and 10 " + num);

        num /= 10; // num = num / 10
        System.out.println("Division of num and 10 " + num);

        num %= 10; // num = num % 10
        System.out.println("Modulus of num and 10 " + num);

        // Relational operators
        int p = 10;
        int q = 20;
        System.out.println("Greater than " + (p > q)); // p is greater than q
        System.out.println("Less than " + (p < q)); // p is less than q
        System.out.println("Greater than or equal to " + (p >= q)); // p is greater than or equal to q
        System.out.println("Less than or equal to " + (p <= q)); // p is less than or equal to q
        System.out.println("Equal to " + (p == q)); // p is equal to q
        System.out.println("Not equal to " + (p != q)); // p is not equal to q

        // Logical operators
        int r = 10;
        int s = 20;
        System.out.println("Logical AND " + (r > s && r < s)); // logical AND
        System.out.println("Logical OR " + (r > s || r < s)); // logical OR
        System.out.println("Logical NOT " + !(r > s)); // logical NOT

        // Bitwise operators
        int t = 10;
        int u = 20;
        System.out.println("Bitwise AND " + (t & u)); // 29
        System.out.println("Bitwise OR " + (t | u)); // 30
        System.out.println("Bitwise XOR " + (t ^ u)); // 1

        // Unary operators
        int v = 10;
        System.out.println("Post increment " + v++); // post increment
        System.out.println("Pre increment " + ++v); // pre increment
        System.out.println("Post decrement " + v--); // post decrement
        System.out.println("Pre decrement " + --v); // pre decrement

        // Ternary operators
        int max1 = 10;
        int max2 = 20;
        int max3 = 30;
        System.out.println("Maximum of " + max1 + ", " + max2 + " and " + max3 + " is "
                + ((max1 > max2 && max1 > max3) ? max1 : (max2 > max3 && max2 > max1) ? max2 : max3));

        // Type casting
        int num1 = 10;
        double num2 = num1;
        System.out.println("Addition of " + num1 + " and " + num2 + " is " + (num1 + num2));

        // Type conversion
        double num3 = 10.9;
        int num4 = (int) num3;
        System.out.println("Type conversion of " + num3 + " to int " + num4);

        // Type promotion
        int num5 = 10;
        double num6 = 10.5;
        System.out.println("Addition of " + num5 + " and " + num6 + " is " + (num5 + num6));

        // Type promotion
        double num7 = 10.5;
        double num8 = 10.5;
        System.out.println("Addition of " + num7 + " and " + num8 + " is " + (num7 + num8));

    }

}
