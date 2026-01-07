/**
 * 7. Bitta son qabul qilib, uning manfiy yoki musbat ekanligini aniqlab beradigan va qaytarganda “musbat” yoki “manfiy”
 * String tipidagi o`zgaruvchilarni qaytaradigan metod yozing.
 * Asosiy metodda uning qiymatini String’ga yuklab, javobini konsolga chiqaring.
 * Yaratilgan metodni to’g’ridan to’g’ri println ichiga yozib chaqirib ko’ring.
 */
public class Exercise7 {
    public static void main(String[] args) {
        System.out.println(positiveOrNegative(-10));
    }

    public static String positiveOrNegative(int num) {
        String str;
        if (num > 0)
            str = "musbat";
        else if (num < 0)
            str = "manfiy";
        else
            str = "Nol";
        return str;
    }
}
