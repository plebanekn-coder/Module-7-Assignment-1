public class AverageCalculator {

    public static void main(String[] args) {
        // Test case that might cause a crash or incorrect result
        String[] myInputs = {"10", "20", "abc", "30"}; 
        System.out.println("Average: " + calculateAverage(myInputs));
    }

    /**
     * Calculates average of numeric strings.
     * LOGIC: Sum all numbers and divide by count.
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
