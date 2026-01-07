import java.security.PublicKey;

/**
 * 14.  km ni m ga aylantiradgan metod yarating
 */
public class Exercise14 {
    public static void main(String[] args) {
        double metres = convertMetres(5);
        System.out.println(metres);
    }

    public static double convertMetres(double km) {
        return km * 1000;
    }
}
