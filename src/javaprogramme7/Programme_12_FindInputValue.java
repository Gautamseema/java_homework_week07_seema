package javaprogramme7;
/**
 * 12. Write a program that tells us input value is number or an alphabet or symbol.
 */

import java.util.Scanner;

public class Programme_12_FindInputValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System .in ) ;
        System.out.println("Enter any variable");
        char ch = scanner.next().charAt(0) ;
        scanner .close() ;
        if(ch >='a' && ch <= 'z' ) {
            System.out.println(ch + " Is a Alphabet");
        } else if ( ch >= '0' && ch <= '9') {
            System.out.println(ch + " Is a Number");
        }else{
            System.out.println(ch + "Is a special character");
        }
    }
}
