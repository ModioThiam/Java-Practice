package controlflow;

import java.util.Scanner;

// converts students' numeric scores to a letter grade (A-F), allows grading multiple scores with input validation (0 - 100) range.
// Scanner, while loops, if/else, logical operators
public class GradeCalculator {
    public static void main(String[] args){
        // store grade score and read input
        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.println("Enter a student's score(-1 to exit): ");
            int score = scanner.nextInt();

            if (score == -1) {
                System.out.println("Exiting Grade Calculator.");
                break;
            }

            if (score < 0 || score > 100) {
                System.out.println("Please enter a score between 0 and 100, or -1 to exit.");
                continue;
            }

            // A = 90 - 100
            if (score >= 90)
                System.out.println("Your grade is an A!");
                // B = 80 - 89
            else if (score >= 80)
                System.out.println("Your grade is a B!");
                // C = 70 - 79
            else if (score >= 70)
                System.out.println("Your grade is a C.");
                // D = 60 - 69
            else if (score >= 60)
                System.out.println("Your grade is a D.");
                // F =< 59
            else
                System.out.println("Your grade is a F.");
        }
}
}
