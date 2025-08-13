package fundamentals;
import java.util.Scanner;

public class BubbleSort { //Creating the method to do the Bubble sort
    static void Sort(int[] arr, int n) {
        int i, j, temp;
        boolean swapped;

        for (i = 0; i < n - 1; i++) { //for loop unless n-1 because in n we cannot swap after this number
            swapped = false;
            for(j = 0; j < n - i - 1; j++){ //this is the second loop
                if (arr[j] > arr[j + 1]){

                    temp = arr[j]; //swapp the numbers using temp
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            if (swapped == false){ //if any sort is not occured it tells to program stop
                break;
            }
        }

    }

    static void printarray(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = in.nextInt();
        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("The " + (i + 1) + " number: ");
            numbers[i] = in.nextInt();
        }

        System.out.println("The array before sorted");

        for (int i = 0; i < size; i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        System.out.println("The array after the sort");
        Sort(numbers, size);

    }
}
