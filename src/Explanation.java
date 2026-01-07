public class Explanation {
    public static void main(String[] args) {
        print(100, 7, 2, 6, 12);
    }

    public static void add(int a, int b) {
        System.out.println(a + b);
    }

    public static void add(long a, int b) {
        System.out.println(a + b);
    }

    public static void print(int age, int... array) {
        System.out.println(age);

        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}