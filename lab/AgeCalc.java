import java.util.Scanner;

class Age {
    private int birthYear, birthMonth, birthDay;
    private int currentYear, currentMonth, currentDay;

    public Age(int birthYear, int birthMonth, int birthDay, int currentYear, int currentMonth, int currentDay) {
        this.birthYear = birthYear;
        this.birthMonth = birthMonth;
        this.birthDay = birthDay;
        this.currentYear = currentYear;
        this.currentMonth = currentMonth;
        this.currentDay = currentDay;
    }

    public void calculateAge() {
        int years = currentYear - birthYear;
        int months = currentMonth - birthMonth;
        int days = currentDay - birthDay;

        if (days < 0) {
            months--;
            days += getDaysInMonth(currentMonth - 1, currentYear);
        }

        if (months < 0) {
            years--;
            months += 12;
        }

        System.out.println("Your age is: " + years + " years, " + months + " months, and " + days + " days.");
    }

    private int getDaysInMonth(int month, int year) {
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (month == 1 && isLeapYear(year)) {
            return 29;
        }

        return daysInMonth[month];
    }

    private boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}

public class AgeCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your birth year: ");
        int birthYear = scanner.nextInt();
        System.out.print("Enter your birth month: ");
        int birthMonth = scanner.nextInt();
        System.out.print("Enter your birth day: ");
        int birthDay = scanner.nextInt();

        System.out.print("Enter the current year: ");
        int currentYear = scanner.nextInt();
        System.out.print("Enter the current month: ");
        int currentMonth = scanner.nextInt();
        System.out.print("Enter the current day: ");
        int currentDay = scanner.nextInt();

        Age personAge = new Age(birthYear, birthMonth, birthDay, currentYear, currentMonth, currentDay);
        personAge.calculateAge();

        scanner.close();
    }
}
