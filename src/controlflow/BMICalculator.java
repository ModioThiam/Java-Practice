package controlflow;

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your weight in kilograms: ");
        int weight = scanner.nextInt();
        System.out.println("Enter your height in meters: ");
        int height = scanner.nextInt();
        double BMI = weight/(Math.pow(height, 2));

        if (BMI < 18.5){
            System.out.println("Underweight BMI");
        } else if (BMI >= 18.5 && BMI < 24.9){
            System.out.println("Normal BMI");
        } else if (BMI >= 25 && BMI <= 29.9){
            System.out.println("Overweight BMI");
        } else if (BMI >= 30) {
            System.out.println("Obese");
        }
    }
}
