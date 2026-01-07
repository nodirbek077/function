/**
 * 9.  3 xonali sonni kirgizganda, uning raqamlar yig’indisini qaytaradigan metod yozing.
 */
public class Exercise9 {
    public static void main(String[] args) {
        int sum = sumDigits(-12);
        System.out.println(sum);
    }

    public static int sumDigits(int number) {
        int count = 0;
        int actualNumber = number;
        while (number != 0) {
            number /= 10;
            count++;
        }

        if (count != 3) {
            return -1;
        }

        int birlar = actualNumber % 10;
        int onlar = (actualNumber / 10) % 10;
        int yuzlar = actualNumber / 100;

        return birlar + onlar + yuzlar;
    }
}
