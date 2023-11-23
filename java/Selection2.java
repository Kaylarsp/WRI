import java.util.Scanner;

public class Selection2 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {

            int score1,score2;
            double avarage;

            System.out.println("Enter a score 1 : ");
            score1 = input.nextInt();
            System.out.println("Enter a score 2 : ");
            score2 = input.nextInt();

            avarage = (score1 + score2) / 2;

            if (avarage >= 100) {
                avarage -= 5;
            }


            System.out.println("The final score is " + avarage);
        }
    }
}
