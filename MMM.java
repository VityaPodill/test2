public class MMM {
    public static void main(String[] args) {
        int a = 5, b = 11;
        System.out.println(square(a + b));
        System.out.println(sum(a, b));
        System.out.println(sqrt(a + b));
        minus(a, b);
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
}
