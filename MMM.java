public class MMM {
    public static void main(String[] args) {
        int a = 12, b = 3;
        System.out.println(sum(a, b));
        System.out.println(sqrt(a + b));
        minus(a, b);
        System.out.println(square(a + b));
        exp(a, b);
    }

    private static int sum(int a, int b) {
        return a + b;
    }

    public static void minus(int a, int b) {
        System.out.println(Math.abs(a - b));
    }

    private static double sqrt(int a) {
        return Math.sqrt(a);
    }

    private static double square(int a) {
        return (a * a);
    }

    private static void exp(int a, int b) {
        System.out.println(Math.pow(a, b));
    }
}
