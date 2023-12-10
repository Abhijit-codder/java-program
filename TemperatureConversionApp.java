import java.util.Scanner;

class TemperatureConverter {
    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
}

class TemperatureConversionApp {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();

        double kelvin = TemperatureConverter.celsiusToKelvin(celsius);
        double fahrenheit = TemperatureConverter.celsiusToFahrenheit(celsius);

        System.out.println("Temperature in Kelvin: " + kelvin);
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);

        scanner.close();
    }
}

