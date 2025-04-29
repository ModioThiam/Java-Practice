package controlflow;

import java.util.Scanner;

public class BasicLoginSystem {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your username: ");
        String username = scanner.nextLine();

        System.out.println("Please enter your password: ");
        int password = scanner.nextInt();
        scanner.nextLine();

        if (username.equals("admin") && password == 1234){
            System.out.println("Access granted");
        } else {
            System.out.println("Access denied.");
        }
        
        scanner.close();
    }
}
