import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        double x = in.nextDouble();
        double y = in.nextDouble();
        System.out.println("Choose the operand (+, -, *, /): ");
        char choice = in.next().charAt(0);
        double result = 0;
        boolean valid = true;

        switch(choice){
            case '+': result = x + y; break;
            case '-': result = x - y; break;
            case '*': result = x * y; break;
            case '/': 
            if (y != 0) { 
                result = x / y;
            } else {
                System.out.println("Divided by 0 is not acceptable!");
                valid = false;
            }
            break;
            default:
            System.out.println("Invalid operator");
        }
        if (valid) {
            System.out.printf("the result: %.2f\n", result);
        }
        in.close();
    }
}