package controlflow;

import java.util.Scanner;

public class TwoIntegerSum {
    public static void main(String[] args){
        // Ask the user to enter in two integers, and print out the sum
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter integer 1 ");
        int integer1 = scanner.nextInt();
        System.out.print("Please enter integer 2 ");
        int integer2 = scanner.nextInt();
        int sum = integer1 + integer2;
        System.out.println("Sum: " + sum);
    }
}
