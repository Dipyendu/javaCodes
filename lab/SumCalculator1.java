public class SumCalculator1 {
    public static void main(String[] args) {
        // Check if there are exactly two command line arguments
        if (args.length != 2) {
            System.out.println("Please provide two numbers as command line arguments.");
            return;
        }

        // Parse the command line arguments as doubles
        try {
            double num1 = Double.parseDouble(args[0]);
            double num2 = Double.parseDouble(args[1]);

            // Calculate the sum
            double sum = num1 + num2;

            // Print the result
            System.out.println("Sum of " + num1 + " and " + num2 + " is: " + sum);
        } catch (NumberFormatException e) {
            // Handle the case where the input is not a valid number
            System.out.println("Please provide valid numeric values as command line arguments.");
        }
    }
}
