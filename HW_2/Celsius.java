import java.util.Scanner;

public class Celsius {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the temperature in Fahrenheit    
        System.out.print("Enter Fahrenheit: ");    
        float fahrenheit = scanner.nextFloat();
        

        // Convert Fahrenheit to Celsius
        float celsius = (fahrenheit - 32) * 5 / 9;

        // Round the result to 2 decimal places
        double roundedCelsius = Math.round(celsius * 100.0) / 100.0;

        // Display the result
        System.out.println(fahrenheit + " Fahrenheit is equal to " + roundedCelsius + " Celsius.");

        // Close the scanner
        scanner.close();
    }
}
