/*import java.util.Scanner;

public class Calculator {
    public static void main(String[] args)
    {
        Calculator obj = new Calculator();
        System.out.println("Enter a number : ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(obj.factorial(n));

    }
    public int factorial(int n)
    {
        int ans=1;
        for(int i=1; i<=n; i++)
        {
            ans = ans * i;
        }
        return ans;
    }
}
*/


import java.util.InputMismatchException;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {
    private static final Logger logger = LogManager.getLogger(Calculator.class);
    public Calculator() {
    }

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        double number1, number2;
        do {
            System.out.println("Calculator-using-DevOps, Choose to perform operation");
            System.out.print("Press 1 to find Square Root\nPress 2 to find Factorial\nPress 3 to find Natural Log\nPress 4 to find Power\n" +
                    "Press 5 to exit\nEnter your choice: ");
            int choice;
            try {
                choice = scanner.nextInt();
            } catch (InputMismatchException error) {
                return;
            }

            switch (choice) {
                case 1:
                    // do Square root
                    System.out.print("Enter the first number : ");
                    number1 = scanner.nextDouble();
                    System.out.println("Square root of "+number1+" is : " + calculator.sqrt(number1));
                    System.out.println("\n");
                    break;

                case 2:
                    // do Factorial
                    System.out.print("Enter the first number : ");
                    number1 = scanner.nextDouble();
                    System.out.println("Factorial of "+number1+" is : " + calculator.factorial(number1));
                    System.out.println("\n");
                    break;

                case 3:
                    // do Natural Log
                    System.out.print("Enter the first number : ");
                    number1 = scanner.nextDouble();
                    System.out.println("Natural Log of "+number1+" is : " + calculator.naturallog(number1));
                    System.out.println("\n");
                    break;

                case 4:
                    // do Power
                    System.out.print("Enter the first number : ");
                    number1 = scanner.nextDouble();
                    System.out.print("Enter the second number : ");
                    number2 = scanner.nextDouble();
                    System.out.println(number1+" raised to the power "+number2+" is : " + calculator.power(number1,number2));
                    System.out.println("\n");
                    break;

//                case 1:
//                    // do Multiplication
//                    System.out.print("Enter the first number : ");
//                    number1 = scanner.nextDouble();
//                    System.out.print("Enter the second number : ");
//                    number2 = scanner.nextDouble();
//                    System.out.println("Multiplication of "+number1+" and "+number2+" is : " + calculator.multiplication(number1,number2));
//                    System.out.println("\n");
//                    break;
//                case 2:
//                    // find cube root
//                    System.out.print("Enter a number : ");
//                    number1 = scanner.nextDouble();
//                    System.out.println("Cube root of "+number1+" is : " + calculator.cuberoot(number1));
//                    System.out.println("\n");
//
//                    break;
//                case 3:
//                    // find square
//                    System.out.print("Enter a number : ");
//                    number1 = scanner.nextDouble();
//                    System.out.println("Square of "+number1+" is : " + calculator.square(number1));
//                    System.out.println("\n");
//
//                    break;
//                case 4:
//                    // do Subtraction
//                    System.out.print("Enter the first number : ");
//                    number1 = scanner.nextDouble();
//                    System.out.print("Enter the second number : ");
//                    number2 = scanner.nextDouble();
//                    System.out.println("Subtraction of "+number2+" from "+number1+" is : " + calculator.sub(number1,number2));
//                    System.out.println("\n");
//
//                    break;
                default:
                    System.out.println("Exiting....");
                    return;
            }
        } while (true);
    }


    public double multiplication(double number1, double number2) {
        logger.info("[MULTIPLICATION - " + number1 + " AND " + number2);
        double result = number1 * number2;
        logger.info("[RESULT - MULTIPLICATION] - " + result);
        return result;
    }

    public double cuberoot(double number1) {
        logger.info("[CUBE ROOT] - " + number1);
        double result = Math.cbrt(number1);
        logger.info("[RESULT - CUBE ROOT] - " + result);
        return result;
    }

    public double square(double number1) {
        logger.info("[SQUARE] - " + number1);
        double result = number1 * number1;
        logger.info("[RESULT - SQUARE] - " + result);
        return result;
    }

    public double sub(double number1, double number2) {
        logger.info("[SUBTRACTION - " + number2 + " FROM " + number1);
        double result = number1 - number2;
        logger.info("[RESULT - SUBTRACTION] - " + result);
        return result;
    }

    public double sqrt(double number1) {
        logger.info("[SQUARE ROOT] - " + number1);
        double sqr = Math.sqrt(number1);
        double result = sqr;
        logger.info("[RESULT - SQUARE ROOT] - " + result);
        return result;
    }

    public double factorial(double number1){
        logger.info("[FACTORIAL] - " + number1);
        double result = (number1==1 || number1==0) ? 1:number1*factorial(number1-1);
        logger.info("[RESULT - FACTORIAL] - " + result);
        return result;
    }

    public double naturallog(double number1){
        logger.info("[NATURAL LOGARITHM] - " + number1);
        double result = Math.log(number1);
        logger.info("[RESULT - NATURAL LOGARITHM - " + result);
        return result;
    }

    public double power(double number1, double number2){
        logger.info("[POWER FUNCTION] - " + number1 + "RAISED TO THE POWER" + number2);
        double result = Math.pow(number1, number2);
        logger.info("[RESULT - POWER FUNCTION - " + result);
        return result;
    }

}
