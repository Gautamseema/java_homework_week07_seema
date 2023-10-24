package javaprogramme7;

/**
 * Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
 * any other alphabet should be invalid entry
 * Using switch statement.
 */

public class Programme_9_PrintCityNameWithSwich {
    public static void main(String[] args) {
        char alphabet = 'B';
    switch (alphabet){
     case'A':
          System.out.println("Amesterdam");
     case'B' :
            System.out.println("Berlin");
     case'C':
            System.out.println("Cambridge");
     case'D':
            System.out.println("Delhi");
     case'E':
            System.out.println("Edinburgh");
     case'F':
            System.out.println("Frankfort");
     default :
            System.out.println("Invalid entry");
        }
    }
}
