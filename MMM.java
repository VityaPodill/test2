import java.util.ArrayList;
import java.util.List;

public class MMM {
    public static void main(String[] args) {


    }
}

class FF {
    public static void main(String[] args) {
        List<Integer> opened = new ArrayList<>();
        List<Integer> closed = new ArrayList<>();
        String c = "(11*3)";
        int l = c.length(), d = 0, dex;

        for (int i = 0; i < l; i++) {
            if (c.charAt(i) == '(') opened.add(i);
            else if (c.charAt(i) == ')') closed.add(i);
        }
        System.out.println(opened + " <-- opened");
        System.out.println(closed + " <-- closed");
        for (int i = 0; i < closed.size(); i++) {
            for (int j = d; j < opened.size(); j++) {
                if (closed.get(i) < opened.get(j)) {
                    dex = j - 1;
                }
                if (closed.get(i) == l - 1
                        || closed.size() == 1) {
                    System.out.println("answer: " + action(c.substring(opened.get(0) + 1, closed.get(0))));

                }
            }
        }
    }

    public static String action(String c) {
        int l = c.length(), a = 0, b = 0, amount = 0, left = 0, right = 0;
        for (int i = 0; i < l; i++) {
            if (!Character.isDigit(c.charAt(i))) amount++;
        }
        while (amount > 0) {
            for (int i = 0; i < l; i++) {
                if (c.charAt(i) == '*' || c.charAt(i) == '/') {
                    char znak = c.charAt(i);
                    for (int j = i - 1; j >= 0; j--) {
                        if (!Character.isDigit(c.charAt(j))) {
                            left = j + 1;
                            a = Integer.parseInt(c.substring(left, i));
                        } else if (j == 0) {
                            left = 0;
                            a = Integer.parseInt(c.substring(0, i));
                        }
                    }
                    for (int j = i + 1; j < l; j++) {
                        if (!Character.isDigit(c.charAt(j))) {
                            right = j;
                            b = Integer.parseInt(c.substring(i + 1, right));
                        } else if (j == l - 1) {
                            right = l - 1;
                            b = Integer.parseInt(c.substring(i + 1, l));
                        }
                    }
                    int result = multi(znak, a, b);
                    String temp = "";
                    temp += c.substring(0, left);
                    temp += result;
                    if (right != l - 1) temp += c.substring(right);
                    System.out.println(c + " ===4");
                    c = temp;
                    System.out.println(c + " ===5");
                    l = c.length();
                }
            }
            amount--;
        }
        return c;
    }

    protected static int multi(char znak, int a, int b) {
        return switch (znak) {
            case '-' -> a - b;
            case '+' -> a + b;
            case '*' -> a * b;
            case '/' -> a / b;
            default -> 1000000;
        };
    }
}

class DD extends FF {
    public static void main(String[] args) {

    }
}