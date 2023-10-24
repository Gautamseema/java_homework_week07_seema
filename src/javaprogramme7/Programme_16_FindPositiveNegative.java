package javaprogramme7;
/**
 * Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or “ZERO”
 */

import java.util.Scanner;

public class Programme_16_FindPositiveNegative {
    //main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System .in) ; // Scanner declare
        System.out.println("Input a number");
        int number = scanner.nextInt();
        scanner.close() ;
        // if condition
        if (number > 0) {
            System.out.println("Number is positive");
            //else if condition
        } else if (number < 0) {
            System.out.println("Number is negative");
            //else condition
        }else{
            System.out.println("Number is Zero");
        }

    }
}
