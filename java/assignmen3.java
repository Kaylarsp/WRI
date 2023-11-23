import java.util.Scanner;

public class assignmen3 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int midterm,fnl,quiz,assignment;
            double finalscore;

            System.out.println("Enter midterm score");
            midterm = input.nextInt();
            System.out.println("Enter final score");
            fnl = input.nextInt();
            System.out.println("Enter quiz score");
            quiz = input.nextInt();
            System.out.println("Enter assignment score");
            assignment = input.nextInt();
            
            finalscore = (0.3*midterm) + (0.4*fnl) + (0.1*quiz) + (0.2*assignment);

            if (finalscore >= 65) {
                System.out.println("Your final score is :" +finalscore);
            } else {
                System.out.println("Remedies :(");
            }
        }

    }
}
