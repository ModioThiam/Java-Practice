package controlflow;

import java.util.Scanner;

// Write a program that takes an integer input from the user and prints whether it is even or odd.
public class EvenOrOdd{
        public static void main(String[] args){
        // allows us to be able to take in input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer.");
        int integer = scanner.nextInt();

        if (integer % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
