import java.util.*;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        // Taking an input from user
        System.out.print("Enter temperature in Celsius: ");
        double celsius = scn.nextDouble();
        
        // Conversion
        double fahrenheit = (celsius * 9 / 5) + 32;
        
        // Printing result
        System.out.println(celsius + "°C is equal to " + fahrenheit + "°F");
    }
}