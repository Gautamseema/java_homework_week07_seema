package javaprogramme7;

/**
 * Write a java program to input any year like (ex.2007) and find out if it is leap year or not?
 */

public class Programme_2_LeapYear {
    // main method
    public static void main(String[] args) {
        int year = 2007;
        boolean isLeapYear = (year % 4 == 0 );
        // use if condition
        if(isLeapYear) {
            System.out.println(year + "is a leap year");
            // else condition
        }else{
            System.out.println(year + "is not leap year");
        }
    }
}
