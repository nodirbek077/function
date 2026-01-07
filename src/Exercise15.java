/**
 * 15.  Berilgan sonning toq yoki juftligini aniqlaydigan metod yarating;
 */
public class Exercise15 {
    public static void main(String[] args) {
        isEvenOrOdd(30);
    }

    public static void isEvenOrOdd(int number) {
        if (number % 2 == 0)
            System.out.println("juft");
        else
            System.out.println("toq");
    }
}
