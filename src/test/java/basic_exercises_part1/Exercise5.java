package basic_exercises_part1;


import java.util.Scanner;//Importing Scanner fro m java.util Library

public class Exercise5 {

    /**
     * Author Vishwanatha NY
     * 5. Write a Java program that takes two numbers as input and display the product of two numbers.
     */

    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     System.out.println("Enter first number");
     int  num1 = scanner.nextInt();
     System.out.println("Enter second number");
     int num2 = scanner.nextInt();
     System.out.println("Multiplication of these two numbers is");
     System.out.println(num1*num2);






    }
}
