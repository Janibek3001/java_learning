package Basic;
import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        double x = in.nextInt();
        double y = in.nextInt();
        System.out.println("Choose what operand you want to do: (+, -, *, /)");
        char operand = in.next().charAt(0);
        boolean valid = true;
        double result = 0;
        switch(operand) {
            case '+':
            result = x + y;
            break;
            case '-':
            result = x - y;
            break;
            case '*':
            result = x * y;
            break;
            case '/':
            if (y == 0) {
                System.out.println("Error");
                valid = false;
            } else {
                result = x / y; 
            }
            break;
            default:
            System.out.println("Operation not found!!");
            valid = false;
        }
        if (valid){
            System.out.printf("The result is : %.2f\n", result);
        }

        in.close();
    }
    
}
