package Basic;
import java.util.Scanner;

public class BMIcalculator{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your weight(kilogramm): ");
        int weight = in.nextInt();
        System.out.print("Enter your height(in metres): ");
        double height = in.nextDouble();
        
        double calculate = (double)weight/Math.pow(height, 2);
        System.out.printf("Your BMI: %.2f\n", calculate);

        if (calculate < 18.5) {
            System.out.println("Underweight");
        } else if (calculate > 18.5 && calculate < 24.9){
            System.out.println("Normal Weight");
        } else if (calculate > 25.0 && calculate < 29.9) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }

        in.close();
    }
}