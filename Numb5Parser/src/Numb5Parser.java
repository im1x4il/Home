import java.util.Scanner;

/**
 * Created by Михаил on 01.03.2017.
 */
public class Numb5Parser {
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       String a = s.nextLine();

        int start = 0;
        int end = a.length();
        char buf[] = new char[end - start];
        a.getChars(start, end, buf, 0);
        for (int i=0; i<= a.length()-1;i++)
            System.out.println(buf[i]);


        /*System.out.println(buf[0]);
        System.out.println(buf[1]);
        System.out.println(buf[2]);
        System.out.println(buf[3]);
        System.out.println(buf[4]);*/

        /*String Str = new String("Добро пожаловать на ProgLang.su");
        System.out.print("Возвращаемое значение: ");
        System.out.println(Str.toCharArray());*/

    }
}
