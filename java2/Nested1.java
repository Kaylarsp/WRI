import java.util.Scanner;

/**
 * Nested1
 */
public class Nested1 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int value;

            System.out.println("Enter a value (0 - 100) : ");
            value = sc.nextInt();

            if (value >= 0 && value <= 100) {
                if (value >= 90 && value <= 100) {
                    System.out.println("Grade A, EXCELLENT!!!");
                } else if (value >= 80 && value <= 89) {
                    System.out.println("Grade B, keep up your achievements!");
                } else if (value >= 60 && value <= 79) {
                    System.out.println("Grade C, increase your achievement!");
                } else if (value >= 0 && value <= 59) {
                    System.out.println("Grade D, improve your study!");
                } else {
                    System.out.println("Grade E, you didn't pass");
                }
            } else {
                System.out.println("The value you entered is");
            }
            if (value <= 0) {
                System.out.println("less than 0");
            } else {
                System.out.println("more than 100");
            }
        }
    }
}