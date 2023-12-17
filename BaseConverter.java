import java.util.Scanner;

public class BaseConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите значение градусов по Цельсию: ");
        double celsius = scanner.nextDouble();
        double temperatureInCelsius = celsius;
        convert(temperatureInCelsius);
    }

    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static void convert(double celsius) {
        double kelvin = celsiusToKelvin(celsius);
        double fahrenheit = celsiusToFahrenheit(celsius);

        System.out.println(celsius + " градусов по Цельсию это:");
        System.out.println(kelvin + " градусов по Кельвину");
        System.out.println(fahrenheit + " градусов по Фаренгейту");
    }
}
