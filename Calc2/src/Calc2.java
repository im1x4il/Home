import java.io.IOException;
import java.util.Scanner;
/**
 * Created by Михаил on 24.02.2017.
 */
public class Calc2 {
    public static void main(String[] args) throws IOException {
        int a, b;
        char choise;
        Scanner s = new Scanner(System.in);
        System.out.println("Введите число а");
        a = s.nextInt();
        System.out.println("Введите действие");
        choise = (char) System.in.read();
        System.out.println("Введите число b");
        b = s.nextInt();
        switch (choise) {
            case '+':
                plus(a,b);
                System.err.println("Результат: " + plus(a,b));
                break;
            case '-':
                minus(a,b);
                System.err.println("Результат: " + minus(a,b));
                break;
            case '*':
                umnogit(a,b);
                System.err.println("Результат: " + umnogit(a,b));
                break;
            case '/':
                podilit(a,b);
                System.err.println("Результат: " + podilit(a,b));
                break;
        }
    }
    private static int podilit(int a, int b) {
        return a/b;
    }
    private static int umnogit(int a, int b) {
        return b * a;
    }
    private static int minus(int a, int b) {
        return a - b;
    }
    private static int plus(int a, int b) {
        return a + b;
    }
}
