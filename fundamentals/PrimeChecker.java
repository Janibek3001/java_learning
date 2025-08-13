package fundamentals;
import java.util.Scanner;

public class PrimeChecker {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isPrime = true;
        System.out.print("Enter a number: ");
        int number = in.nextInt();
        WhetherPrime(number, isPrime);
        in.close();
    }

    static void WhetherPrime(int number, boolean isPrime) {
        if (number > 1) {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println("The number " + number + " is Prime");
            } else {
                System.out.println("The number " + number + " is not Prime");
            }
        } else {
                System.out.println("The number" + number + " is not Prime");
            }
    }

}
