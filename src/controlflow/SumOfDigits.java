// Return sum of digits, and number of digits in number.
package controlflow;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args){
        // Input a number (like 1234) and output the sum of its digits (1+2+3+4 = 10).
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = scanner.nextInt();
        int original_number = number;
        int total_sum = 0;
        int digit_count = 0;
        // modulus used to strip off last digit off of total number.
        while (number != 0) {
            int last_digit = number % 10;
            total_sum += last_digit;
            // take that last number off of the original number
            number = number / 10;
            digit_count += 1;
        }
        System.out.println("Original Number: " + original_number);
        System.out.println("Sum: " + total_sum);
        System.out.println("Number of digits in original number: " + digit_count);
    }
}
