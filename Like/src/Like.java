import java.util.Scanner;

/**
 * Created by Михаил on 02.03.2017.
 */
public class Like {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите Х");
        String x = s.nextLine();
        System.out.println("Введите У");
        String y = s.nextLine();
        String s1 = "I like ";
        String s2 = " because of ";
        String result =s1+x+s2+y;
        System.out.println(result);

    }
}
