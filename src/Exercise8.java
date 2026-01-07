/**
 * 8. 1 dan 7 gacha sonni kiritganda, hafta kunini qaytaradigan metod yozing. Konsolga chiqaring.
 * Metdoni yaratganda switch dan foydalaning.
 * Maslahat: oldin bu misolni ishlagansiz, agar if mavzusidagi barcha misollarni ishlagan bo`lsangiz.
 */
public class Exercise8 {
    public static void main(String[] args) {
        String weekdays = getWeekdays(2);
        System.out.println(weekdays);
    }

    public static String getWeekdays(int weekday) {
        return switch (weekday) {
            case 1 -> "Dushanba";
            case 2 -> "Seshanba";
            case 3 -> "Chorshanba";
            case 4 -> "Payshanba";
            case 5 -> "Juma";
            case 6 -> "Shanba";
            case 7 -> "Yakshanba";
            default -> "bunday hafto kuni mavjud emas!";
        };
    }
}
