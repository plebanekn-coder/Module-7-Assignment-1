
/**
 * AverageCalculator class takes an input of string, takes each of the double (number)
 * values and calculates the average between the number of numbers in the list and
 * summing those values in said list together.
 * 
 * Utilized AI for the section of the assignment where we are asked "Explain the 
 * call stack of a NullPointerException in Java and suggest a defensive check for
 * a null array." Also utilized AI to help me figure out how to work the debugger
 * when one is using GitHub, so that I can do the whole assignment on Github.
 * 
 * @author Professor GK (original author of file)
 * @author Natalie Plebanek (bug fixes and optimization)
 * @since Week 7 of CSC 6301
 * @version 1.0.1
 */

public class AverageCalculator {

    /**
     * Tests method and implements calculateAverage to make sure that the method works.
     * User must hardcode populate their values into the myInputs array that they would like
     * the program to take the average of. Preferred that user inputs doubles only, however
     * program now accounts for that.
     * 
     * @param args default parameter for a main - not used.
     */
    public static void main(String[] args) {
        // Test case that might cause a crash or incorrect result
        String[] myInputs = {"10", "20", "abc", "30"}; 
        System.out.println("Average: " + calculateAverage(myInputs));
    }

    /**
     * Calculates average of numeric strings.
     * LOGIC: Sum all numbers and divide by count.
     * 
     * @param inputs takes in a string of inputs.
     * @return the average of the valid inputs as a double; returns 0 if input array is null, empty, or has no parsable numbers.
     * @throws IllegalArgumentException if the input array is null
     */
    public static double calculateAverage(String[] inputs) {
        double sum = 0;
        if (inputs == null) {
            throw new IllegalArgumentException("Input array cannot be null.");
        }

        if (inputs == null || inputs.length == 0) {
            return 0;
        }
        for (int i = 0; i < inputs.length; i++) { 
            try {
                int val = Integer.parseInt(inputs[i]);
                sum += val;
            } catch (NumberFormatException e) {
                System.err.println("Skipping Invalid Input: " + inputs[i]);
            }
        }
        return sum / inputs.length;
    }
}
