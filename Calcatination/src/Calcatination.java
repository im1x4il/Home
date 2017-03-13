import java.util.Scanner;

/**
 * Created by Михаил on 09.02.2017.
 */
public class Calcatination {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("S1 = ");
        String S1 = in.nextLine();

        System.out.print("S2 = ");
        String S2 = in.nextLine();

        System.out.print("S3 = ");
        String S3 = in.nextLine();

        String S4 = S1 + S3;
        String S5 = S3 + S2 + S1;
        String S6 = S1+S2+S3+S5;

        System.out.println("S4 = "+S4);
        System.out.println("S5 = "+S5);
        System.out.println("S6 = "+S6);

    }
}
