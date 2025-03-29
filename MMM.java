public class MMM {
    public static void main(String[] args) {
        System.out.println("fffsssssssf");
        int a = 5, b = 11, c;
        c = sum(a, b);
        System.out.println(c);
        minus(a, b);
    }

    private static int sum(int a, int b) {
        return a + 2 * b;


    }

    public static void minus(int a, int b) {
        System.out.println(Math.abs(a - b));
    }
}
