package javaprogramme7;

/**
 * Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
 * any other alphabet should be invalid entry.
 */

public class Programme_8_PrintCityName {
    //main method
    public static void main(String[] args) {
        char  alphabet ='A';
        // if condition
        if (alphabet == 'A' ) {
            System.out.println("Amsterdam");
        } else if (alphabet == 'B') {
            System.out.println("Berlin");
        } else if (alphabet == 'C') {
            System.out.println("Cambridge");
        } else if (alphabet == 'D') {
            System.out.println("Delhi");
        } else if (alphabet == 'E') {
            System.out.println("Edinburgh");
        } else if (alphabet == 'F' ) {
            System.out.println("Frankfort");
        } else {
            System.out.println("Invalid entry");
        }
    }
}
