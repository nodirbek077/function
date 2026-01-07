/**
 * 11.  Aylana radiusini berganda, uning uzunligini topadigan metod yozing.
 */
public class Exercise11 {
    public static void main(String[] args) {
        double circleLength = calculateCircleLength(10);
        System.out.println(circleLength);
    }

    public static double calculateCircleLength(double radius) {
        return 2 * 3.14 * radius;
    }
}
