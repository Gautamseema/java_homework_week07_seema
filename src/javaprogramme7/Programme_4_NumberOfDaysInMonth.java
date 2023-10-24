package javaprogramme7;
/**
 * Write a method isLeapYear with a parameter of type int named year.
 * The parameter needs to be greater than or equal to 1 and less than or equal to 9999.
 * If the parameter is not in that range return false. Otherwise, if it is in the valid range,
 * calculate if the year is a leap year and return true if it is, otherwise return false.
 * A year is a leap year if it is divisible by 4 but not by 100, or it is divisible by 400.
 */

import java.util.Scanner;

public class Programme_4_NumberOfDaysInMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System .in ) ;
        System.out.println("Enter a year :");
        int year = scanner . nextInt() ;
        System.out.println("Enter a month (1 -12)");
        int month = scanner .nextInt() ;
        boolean leapYear = isLeapYear(year);
        int daysInMonth = getDaysInMonthMethod(month, year);
        if(leapYear ) {
            System.out.println(year + "is leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }if(daysInMonth == -1) {
            System.out.println("Invalid month or year input:");
        }else{
            System.out.println("Number of days in month" + month + " in year " + year + " : " + daysInMonth);
        }
         scanner .close() ;
    }
    public static boolean isLeapYear (int year) {
        if( year < 1 ||  year > 9999){
            return false;
        }return (year % 4 == 0 && year % 100 != 0);
    }public static int getDaysInMonthMethod(int month, int year) {
        if (month < 1 || month > 12 || year < 1 || year > 9999) {
            return -1;
        } switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 2:
                return isLeapYear(year) ? 29 : 28;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                return -1;
        }
    }
}
