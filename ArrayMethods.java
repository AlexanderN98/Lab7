import java.util.Arrays;

/**
 * This class implements array processing methods.
 * 
 * @author Alexander Nguyen
 * @version v2.0
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

    /**
     * Finds the index of the last occurrence of a value in myArray.
     * Searches from right to left, stops at the first match.
     * 
     * @param key the value to search for
     * @return the right most index of key, or -1 if key is not found
     */
    public int findLast(int key) {
        int index = -1;
        for (int i = myArray.length - 1; i >= 0 && index == -1; i--) {
            if (myArray[i] == key) {
                index = i;
            }
        }
        return index;
    }

    /**
     * Finds the index of every occurrence of a value in myArray.
     * Uses two passes. the first counts the matches so the new array can be
     * sized correctly, and the second stores each matching index.
     * 
     * @param key the value to search for
     * @return a new array holding every index where key occurs, or an empty
     *         array if key does not occur
     */
    public int[] findAll(int key) {
        // pass 1 - count how many times key occurs
        int occurrences = 0;
        for (int value : myArray) {
            if (value == key) {
                occurrences++;
            }
        }

        // create array big enough to hold every index
        int[] indices = new int[occurrences];

        // pass 2 - store the index of each match, moving to the next slot each time
        int next = 0;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == key) {
                indices[next] = i;
                next++;
            }
        }
        return indices;
    }

    /**
     * Getter for the myArray instance variable
     * 
     * @return a reference to myArray
     */
    public int[] getArray() {
        return myArray;
    }

    /**
     * Creates a copy of myArray
     * 
     * @return a new array with the same values as myArray
     */
    public int[] copyArray() {
        return Arrays.copyOf(myArray, myArray.length);
    }

    /**
     * Reverses order of elements in the array that is passed in.
     * Swaps the left and right ends, then moves both indexes 
     * toward the center until they meet.
     * 
     * @param inArray the int array to reverse
     * @return the same array, now in reverse order
     */
    public int[] reverseArray(int[] inArray) {
        int left = 0;
        int right = inArray.length - 1;
        while (left < right) {
            int temp = inArray[left];
            inArray[left] = inArray[right];
            inArray[right] = temp;
            left++;
            right--;
        }
        return inArray;
    }
}