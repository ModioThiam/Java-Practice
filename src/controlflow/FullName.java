package controlflow;

import java.util.Scanner;

public class FullName {
    public static void main(String[] args){
        // prompt user to type full name, and then print back.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your first and last name. ");
        String name = scanner.nextLine();
        System.out.println("Hello " + name + "!");

    }
}
