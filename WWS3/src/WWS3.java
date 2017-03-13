import java.util.Scanner;

/**
 * Created by Михаил on 03.03.2017.
 */
public class WWS3 {
    public static void main(String[] args) {
        //Пользователь вводит строку и целое число k. Перенести первые k ее символов в конец. Вывести получившуюся строку.
        Scanner s = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String S =s.nextLine();
        System.out.println("Введите К");
        int K =s.nextInt();
        System.out.println(S.substring(K,S.length())+(S.substring(0, K)));

    }
}
