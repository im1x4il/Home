import java.util.Scanner;
/**
 * Created by Михаил on 09.02.2017.
 */
public class RevInput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Первое число : ");
        int a = in.nextInt();

        System.out.print("Второе число : ");
        int b = in.nextInt();

        System.out.print("Третье число : ");
        int c = in.nextInt();

        System.out.print(c+" ");
        System.out.print(b+" ");
        System.out.print(a);
    }
}
