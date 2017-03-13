import java.util.Scanner;

/**
 * Created by Михаил on 02.03.2017.
 */
public class WWS1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String S =s.nextLine();
        System.out.println("Введите К");

        int K =s.nextInt();
        char K1= S.charAt(K);
        String K2 = Integer.toString(K);
        char K3 = K2.charAt(0);

        System.out.print("Изменённая строка:" );
        System.out.println(S.replaceAll(" " , "\t"));
        System.out.print("Изменённая строка i Ka)");
        System.out.println(S.replace(K1 ,K3));

        System.out.print("Длина масива"+S.length());
    }
}