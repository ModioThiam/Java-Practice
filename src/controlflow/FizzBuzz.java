package controlflow;

import java.util.Scanner;

// class definition
public class FizzBuzz {
    // main definition method
    public static void main(String[] Args) {

        // read number input from user, use Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number: ");
        int number = scanner.nextInt();

        // If number is divisible by 5, it prints out Fizz.
        if (number % 5 == 0 && number % 3 == 0) {
            System.out.println("FizzBuzz");
            // If number is divisible by 3, it prints out Buzz.
        }
        else if (number % 3 == 0) {
            System.out.println("Buzz");
            // if number is divisible by both 5 and 3, we get FizzBuzz
        }
        else if(number % 5 == 0) {
            System.out.println("Fizz");
        }
        else {
            // if not divisible by both 5 and 3, print that number.
            System.out.println(number);
                }
            }
        }