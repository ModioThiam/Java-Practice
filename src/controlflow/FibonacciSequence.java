package controlflow;

import java.util.Scanner;

public class FibonacciSequence {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number = scanner.nextInt();
        int first = 0;
        int second = 1;
        System.out.println(first + " ");
        if (second < number){
            System.out.println(second + " ");
        }
        int third = first + second;
        while (third < number){
            System.out.println(third + " ");
            first = second;
            second = third;
            third = first + second;
        }
    }
}
