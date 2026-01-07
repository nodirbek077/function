/**
 * 10.  Haroratni Farengeytda darajada berganda, uni Selsiy darajaga o’giradigan metod yozing.
 */
public class Exercise10 {
    public static void main(String[] args) {
        double v = convertCelsiusToFahrenheit(2);
        System.out.println(v);
    }

    public static double convertCelsiusToFahrenheit(double temperature) {
        //formula: F = 1.8 * C + 32
        return temperature * 1.8 + 32;
    }
}
