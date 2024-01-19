package methods;

import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CountEvenDaysInMonth {
    public static void main(String[] args) {
        // Get user input for year and month
        Scanner scanner = new Scanner(System.in);

        int year = 0;
        String monthName;
        int month;

        // Keep asking for year input until a valid input is provided
        while (true) {
            try {
                System.out.print("Enter the year: ");
                year = scanner.nextInt();
                break; // Break out of the loop if a valid integer is provided
            } catch (InputMismatchException e) {
                System.out.println("Invalid year input. Please enter a valid integer.");
                scanner.nextLine(); // Clear the input buffer
            }
        }

        // Keep asking for month input until a valid input is provided
        do {
            System.out.print("Enter the month (e.g., January, February, etc.): ");
            monthName = scanner.next();

            // Convert month name to month number
            month = getMonthNumber(monthName);

            // Validate the month input
            if (month == -1) {
                System.out.println("Invalid month input. Please enter a valid month name.");
            }
        } while (month == -1);

        // Get the number of days in the specified month
        int daysInMonth = getDaysInMonth(month, year);

        // Count the number of even days
        int evenDaysCount = countEvenDays(daysInMonth);

        // Display the result
        System.out.println("Number of days Kunal can go out in " + monthName + ": " + evenDaysCount);

        // Close the scanner
        scanner.close();
    }

    // Function to convert month name to month number
    private static int getMonthNumber(String monthName) {
        String[] months = new DateFormatSymbols().getMonths();
        for (int i = 0; i < months.length; i++) {
            if (months[i].equalsIgnoreCase(monthName)) {
                return i + 1; // Adding 1 because Calendar months are zero-based
            }
        }
        return -1; // Return -1 if the month name is not found
    }

    // Function to get the number of days in a given month and year
    private static int getDaysInMonth(int month, int year) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, 1); // Month is zero-based in Calendar class
        return calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
    }

    // Function to count the number of even days in a month
    private static int countEvenDays(int totalDays) {
        int evenDaysCount = 0;
        for (int day = 2; day <= totalDays; day += 2) {
            evenDaysCount++;
        }
        return evenDaysCount;
    }
}
