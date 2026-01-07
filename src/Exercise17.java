import java.util.Scanner;

/**
 * 17.  Haroratni C(Selsiy) da qabul qilib K(Kelvin) shkalasida qaytaradigan metod yarating;
 * Quyidagi formuladan foydalaning: T=t+273;
 */
public class Exercise17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the temperature in Celsius: ");
        double c = input.nextDouble();

        double kelvin = convertKelvin(c);
        System.out.println(kelvin);
    }

    public static double convertKelvin(double temperature) {
        return temperature + 273;
    }
}
