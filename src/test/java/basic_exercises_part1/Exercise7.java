package basic_exercises_part1;

import java.util.Scanner;

public class Exercise7 {
    /**Author Vishwanatha NY
     * 7. Write a Java program that takes a number as input and prints its multiplication table upto 10.
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number...");
        int num1 = scanner.nextInt();

        for (int i = 0; i<10; i++){

            System.out.println(num1 + " x " + (i+1) + " = " + (num1*(i+1)));
        }



    }
}
