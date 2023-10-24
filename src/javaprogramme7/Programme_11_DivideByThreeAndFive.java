package javaprogramme7;

/**
 * Write a java program to print the numbers between 1 to 100 which can be divided by 3 and 5 separately.
 */

public class Programme_11_DivideByThreeAndFive {
    public static void main(String[] args) {
        //print number divide by 3
        System.out.println("Number divisible by 3");

        for(int i =1; i<=100; i++){

        if( i % 3 == 0) {
            System.out.print ( i );
        }
        }
        System.out.println( "Number divisible by 5");
        for(int i =1; i<=100; i++){

            if( i % 5 == 0) {
                System.out.print( i );
            }
        }
        System.out.println( "Number divisible by 3 & 5");
        for(int i =1; i<=100; i++) {

        if( i % 3 == 0 && i % 5 == 0) {
            System.out.print( i );
        }
        }
    }

}
