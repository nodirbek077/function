import java.util.Scanner;

/**
 * 16.  Tezlikni km/soat da qabul qilib m/s da qaytaradigan metod yarating; 1m/s = 3.6km/soat
 */
public class Exercise16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the velocity value (km/hour): ");
        double km = input.nextDouble();

        double metres = calculateVelocity(km);
        System.out.println(metres);
    }

    public static double calculateVelocity(double kilometers) {
        return 10 * kilometers / 36;
    }
}
