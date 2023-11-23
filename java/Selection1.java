import java.util.Scanner;

/**
 * Selection1
 */
public class Selection1 {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int number;

            System.out.println("Enter a number : ");
            number = input.nextInt();

            if (number % 2 == 0) {
                System.out.println("Even number");
            } else {
                System.out.println("Odd number");
            }
        }
    }
}