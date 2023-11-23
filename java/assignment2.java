import java.util.Scanner;

public class assignment2 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int age;

            System.out.println("Enter your age");
            age = input.nextInt();

            if (age >= 17) {
                System.out.println("Allowed to drive");
            } else {
                System.out.println("Not allowed to drive");
            }

        }
    }
}
