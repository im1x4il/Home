import java.util.Scanner;

/**
 * Created by Михаил on 11.02.2017.
 */
public class Chisla {
    public static void main(String[] args) {
        int a, b, c, d, f;
        a = new Scanner(System.in).nextInt();
        b = new Scanner(System.in).nextInt();
        c = new Scanner(System.in).nextInt();
        d = new Scanner(System.in).nextInt();
        //f = new Scanner(System.in).nextInt();

        if (a < b)
            if (c < a)
                if (c < d)
                     System.out.println(d);
                else
                    System.out.println(c);
            else System.out.println(a);
        else System.out.println(b);

    }
}