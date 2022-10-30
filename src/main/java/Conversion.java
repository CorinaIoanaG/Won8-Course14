public class Conversion {
    public static void main(String[] args) {
        System.out.println("100 fahrenheit converted in celsius: " + fahrenheitToCelsius(100));
        System.out.println("O celsius converted in fahrenheit: " + celsiusToFahrenheit(0));
    }

    public static double fahrenheitToCelsius(double temperature) {
        if (temperature >= -10000 && temperature <= 10000) {
            return (temperature - 32) * 5 / 9;
        }
        throw new RuntimeException("Calling value out of interval");
    }

    public static double celsiusToFahrenheit(double temperature) {
        if (temperature >= -5500 && temperature <= 5500) {
            return temperature * 9 / 5 + 32;
        }
        throw new RuntimeException("Calling value out of interval");
    }

}
