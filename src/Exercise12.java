/**
 * 12.  Milyani kilometrga o’girib beradigan metod yozing.
 */
public class Exercise12 {
    public static void main(String[] args) {
        double km = convertKm(2);
        System.out.println("km = " + km);
    }

    public static double convertKm(double mile){
        return mile * 1.60934;
    }
}
