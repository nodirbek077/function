import java.util.Scanner;

/**
 * 18.  Uchburchakning a, b, c tomonlarini qabul qilib uning yuzasini hisoblab beradigan dastur tuzing;
 * Quyidagi formuladan foydalaning:
 * p = (a+b+c)/2 ;
 * S = sqrt(p*(p-a)*(p-b)*(p-c))
 */
public class Exercise18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number a: ");
        double a = input.nextDouble();

        System.out.print("Enter the number b: ");
        double b = input.nextDouble();

        System.out.print("Enter the number c: ");
        double c = input.nextDouble();
        calculateAre(a, b, c);
    }

    public static void calculateAre(double a, double b, double c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("Side of the triangle cannot be negative!");
            return;
        }

        if (a + b < c || b + c < a || a + c < b) {
            System.out.println("Invalid triangle (a + b > c)!");
            return;
        }

        double halfPerimeter = (a + b + c) / 2;
        double triangleAre = Math.sqrt(halfPerimeter * (halfPerimeter - a) * (halfPerimeter - b) * (halfPerimeter - c));
        System.out.println("The area of the triangle: " + triangleAre);
    }
}
