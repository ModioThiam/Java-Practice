package controlflow;

import java.util.Scanner;

public class PositiveNegativeZero {
    public static void main(String[] args){

        // Is it positive, negative or zero.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please type an integer. ");
        int integer = scanner.nextInt();
        if (integer == 0){
            System.out.print("Zero");
        } else if (integer < 0) {
            System.out.print("Negative");
        } else {
            System.out.print("Positive");
        }
    }
}
