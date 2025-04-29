package controlflow;

import java.util.Scanner;

public class SimpleBillSplitter {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the total bill amount.");
        float bill = scanner.nextFloat();
        System.out.println("Please enter the total number of people splitting the bill.");
        int people = scanner.nextInt();
        float amount = bill/people;
        System.out.println("Each person will pay "+ amount);
    }
}
