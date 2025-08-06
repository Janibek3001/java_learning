
import java.util.Scanner;
import java.util.Random;

public class NumberGuess {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(true) {
            validator(in);

            System.out.println("Do you want to play again? (yes/no)");
            String answer = in.next().toLowerCase();
            if (!answer.equals("yes") && !answer.equals("y")){
                break;
            }
        }
        in.close();
    }   

    static void validator(Scanner in){
        Random random = new Random();
        int guessNumber = random.nextInt(100) + 1;
        int number = -1;
        System.out.println("Choose a number between the 1 and 100");
        int attempts = 0;
        while (true){
            if(in.hasNextInt()){
                number = in.nextInt();
                attempts++;
                if (Guess(number, guessNumber) == 0){
                    System.out.println("You guessed it in " + attempts + " tries!");
                    break;
                }
            } else {
                System.out.println("Invalid number");
                in.next();
            }
        }
    }
    
    static int Guess(int number, int guess){
        if (number < guess) {
            System.out.println("Too low!");
            return 1;
        } else if (number > guess) {
            System.out.println("Too high!");
            return 1;
        } else {
            System.out.println("You find a number!");
            return 0;
        }
    }
}
