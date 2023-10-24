package javaprogramme7;

import java.util.Scanner;

/**
 * Write a java program that tells us that Input number is odd or even?
 * HINT: use ternary operator (? :)
 */

public class Programme_1_OddEvenTernaryOperator {
    // main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Scanner declaration
        System.out.println("Please enter the number");
        int number = scanner.nextInt();
        isItOddOrEvenNumber(number);
        scanner.close();

    }
    public static void isItOddOrEvenNumber(int number) {
        //ternary operator is used
        String evenOrOdd = (number % 2 == 0) ? "Even" : "Odd" ;
        System.out.println(" The " + number + " is " + evenOrOdd + " number ");

    }
}
