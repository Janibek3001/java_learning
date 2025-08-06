
import java.util.Scanner;

public class BMIcalculator{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Calculate(in);
        in.close();
    }
    static void Calculate(Scanner in){
        System.out.print("Enter your height in meters: ");
        double height = in.nextDouble();
        System.out.print("Enter your weight in kilogramms: ");
        double weight = in.nextDouble();

        double result = weight / Math.pow(height, 2);
        System.out.println(result);
        validator(result);
    }

    static void validator(double r){
        if (r < 18.5) {
            System.out.println("Light weight");
        } else if (r > 18.5 && r < 24.5){
            System.out.println("Normal weight");
        } else if (r > 24.6 && r < 30){
            System.out.println("Extra weight");
        } else {
            System.out.println("Obese");
        }
    }
}