/**
 * 6. Char [] (array) ni qabul qiladigan va shu arraydan String yasab uni return qiladigan metod ni yozing.
 * Matodni nomi convertToString bo'lsin.
 */
public class Exercise6 {
    public static void main(String[] args) {
        String str = convertToString(new char[]{'h', 'e', 'l', 'l', 'o'});
        System.out.println(str);
    }

    public static String convertToString(char[] charArray) {
        String str = "";
        for (char c : charArray) {
            str += c;
        }
        return str;
    }
}
