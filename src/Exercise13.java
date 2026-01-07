/**
 * 13.  Katetlari berilgan to’g’ri burchakli uchburchakning gipotenuzasini aniqlovchi method yarating.
 */
public class Exercise13 {
    public static void main(String[] args) {
        double hypotenuse = calculateHypotenuse(3, 4);
        System.out.println(hypotenuse);
    }

    public static double calculateHypotenuse(double k1, double k2) {
        return Math.sqrt(k1 * k1 + k2 * k2);
    }
}
