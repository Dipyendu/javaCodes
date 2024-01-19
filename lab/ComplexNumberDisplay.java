import java.util.Scanner;
public class ComplexNumberDisplay 
{
 public static void main(String[] args)
 {
 Scanner scanner = new Scanner(System.in);
 System.out.print("Enter the real part (a): ");
 double real = scanner.nextDouble();
 System.out.print("Enter the imaginary part (b): ");
 double imaginary = scanner.nextDouble();
 System.out.println("You entered the complex number: " + real + " + " + imaginary + "i");
 scanner.close();
 }
}