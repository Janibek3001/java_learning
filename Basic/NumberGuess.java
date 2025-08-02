package Basic;
import java.util.Scanner;
import java.util.Random;

public class NumberGuess {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner in = new Scanner(System.in);

        int numberGuess = random.nextInt(100) + 1;
        int number = 0;
        while(number != numberGuess){
            System.out.print("Enter your number: ");
            if (in.hasNextInt()){
                number = in.nextInt();
                if (number < numberGuess){
                    System.out.println("Too low!");
                } else if (number > numberGuess){
                    System.out.println("Too high!");
                } else {
                    System.out.println("You find a number!");
                }
            } else {
                System.out.println("Please write a valid number!");
                in.next();
            }
        }
        in.close();
    }    
}
