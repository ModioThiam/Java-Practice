package controlflow;

import java.util.Scanner;

public class AgeClassifier {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your age: ");
        int age = scanner.nextInt();
        if (age < 13){
            System.out.println("Children");
        } else if (13 <= age &&  age <= 19 ){
            System.out.println("Teenager");
        } else {
            System.out.println("Adult");
        }
    }
}
