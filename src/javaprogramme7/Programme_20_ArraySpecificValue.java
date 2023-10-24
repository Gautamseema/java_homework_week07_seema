package javaprogramme7;

/**
 * Write a Java program to test if an array contains a specific value.
 */

public class Programme_20_ArraySpecificValue {

    //main method
    public static void main(String[] args) {
        int[] myArray ={50, 40, 35, 23};
        int num = 35;
        for(int i = 0; i<myArray.length; i++ ){
            if(num == myArray [i]){
                System.out.println("int.35");//print method
            }
        }
    }
}
