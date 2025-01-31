import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        There are 8 primitive data tyres in Java
        1. byte
        2. short
        3. int
        4. long
        5. float
        6. double
        7. char
        8. boolean
        We tend to use int, double, and boolean the most.
         */
        System.out.println("Lab 1a");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number1 = scanner.nextInt();
        System.out.println("You entered: " + number1);

        System.out.println("Enter a second number: ");
        int number2 = scanner.nextInt();
        System.out.println("You entered: " + number1 + " and " + number2);
        //Perform the basic mathematical operations of +, -, /, * and %.
        System.out.print(number1 + number2);
        System.out.println("Enter a number: ");
        int number3 = scanner.nextInt();
        System.out.println("Enter a number: ");
        int number4 = scanner.nextInt();
        System.out.print(number3 - number4);
        System.out.println("Enter a number: ");
        int number5 = scanner.nextInt();
        System.out.println("Enter a number: ");
        int number6 = scanner.nextInt();
        System.out.print(number5 / number6);
        System.out.println("Enter a number: ");
        int number7 = scanner.nextInt();
        System.out.println("Enter a number: ");
        int number8 = scanner.nextInt();
        System.out.print(number7 * number8);
        System.out.println("Enter a number: ");
        int number9 = scanner.nextInt();
        System.out.println("Enter a number: ");
        int number10 = scanner.nextInt();
        System.out.println(number9 % number10);



        //Output the results of each operation.

        //Cut and past the code above but use doubles instead of integers.

        double sum1 = 10.6 + 15.4;
        double sum2 = sum1 + 17;
        double sum3 = sum2 + sum2;
        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);
        double min1 = 18.4 - 8;
        double min2 = min1 - 12;
        System.out.println(min2);


        //If you complete this ask for the next task.
    }
}