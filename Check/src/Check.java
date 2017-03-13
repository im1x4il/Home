import java.util.Scanner;

/**
 * Created by Михаил on 02.03.2017.
 */
public class Check {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int y = s.nextInt();
        System.out.println("x3 - y2 ≤ 0 "+ ((x*x*x)-(y*y) <= 0));
        System.out.println("(не (x * y < 1)) и (y > x) "+(!(x*y<1)&(y>x)));

    }
}
