import java.util.Arrays;

/**
 * This class implements array processing methods.
 * 
 * @author Alexander Nguyen
 * @version v1.0
 * @since 11/1/2026
 */
public class ArrayMethods {
    // instance variable initialized
    private int[] myArray = {7, 8, 8, 3, 4, 9, 8, 7};

    /**
     * Default constructor for ArrayMethods
     */
    public ArrayMethods() {
    }

    /**
     * Counts the number of elements in myArray.
     * 
     * @return total count of elements in myArray
     */
    public int count() {
        int count = 0;
        for (int value : myArray) {
            count++;
        }
        return count;
    }

    /**
     * Calculates the sum of all elements in myArray.
     * 
     * @return the total sum of array elements
     */
    public int sum() {
        int accumulator = 0;
        for (int value : myArray) {
            accumulator += value;
        }
        return accumulator;
    }

    /**
     * Calculates the average of all elements in myArray.
     * 
     * @return average value of the array as a double
     */
    public double average() {
        return (double) sum() / count();
    }

    /**
     * Finds the largest integer value in myArray.
     * 
     * @return the highest value in myArray
     */
    public int findMax() {
        int max = myArray[0];
        for (int value : myArray) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    /**
     * Finds the index position of the largest integer in myArray.
     * 
     * @return the zero-based index of the maximum value
     */
    public int findIndexOfMax() {
        int max = myArray[0];
        int index = 0;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] > max) {
                max = myArray[i];
                index = i;
            }
        }
        return index;
    }

    /**
     * Prints an int array formatted inside curly braces.
     * 
     * @param inArray int array to print
     */
    public void print(int[] inArray) {
        System.out.print("{");
        int i;
        for (i = 0; i < inArray.length - 1; i++) {
            System.out.print(inArray[i] + ", ");
        }
        if (inArray.length > 0) {
            System.out.print(inArray[i]);
        }
        System.out.println("}");
    }
}
