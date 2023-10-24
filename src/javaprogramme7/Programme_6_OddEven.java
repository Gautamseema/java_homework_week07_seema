package javaprogramme7;

import java.util.Scanner;

/**
 * Write a java program to input any number and find out if it’s odd or even
 */

public class Programme_6_OddEven {
    //main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System .in ); // Scanner declare
        System.out.println("Enter a number"); // print statment
        int num = scanner.nextInt();

        scanner.close();
        if(num % 2 == 0) {
            System.out.println(num + " is even ");
        }else{
            System.out.println( num + " is odd");
        }
    }
}
