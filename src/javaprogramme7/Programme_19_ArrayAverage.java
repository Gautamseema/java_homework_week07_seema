package javaprogramme7;

/**
 * Write a Java program to calculate the average value of array elements.
 */
public class Programme_19_ArrayAverage {
    public static void main(String[] args) {

        int[] numbers = new int[] {10,20,30, -15,-30};
        //sum of array element
        int sum = 0;
       for(int i = 0; i < numbers.length ; i++) {
           sum = sum + numbers[i];
       }
         double average = sum / numbers.length;
           System.out.println("Average value of the array element is: " + average );
       }
    }

