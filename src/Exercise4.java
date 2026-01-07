/**
 * 4. To'g'ri to'rtburchakning a va b tomonlarini qabul qilib uning perimetrini hisoblab,
 * natijani return qiladigan perim nomli metod tuzing va uni asosiy metoddan chaqirib ishlating.
 */
public class Exercise4 {
    public static void main(String[] args) {
        double perim = perim(1, 3);
        System.out.println(perim);
    }

    public static double perim(double a, double b) {
        return 2 * (a + b);
    }
}
