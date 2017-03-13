import java.util.Scanner;
/**
 * Created by Михаил on 09.02.2017.
 */
public class CalcFour {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("a = ");
        double a = in.nextDouble();

        System.out.print("b = ");
        double b = in.nextDouble();

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(Math.pow(a, b));
        System.out.println(Math.sqrt(a));
        System.out.println(Math.pow(a,1/b));
    }
}
