import java.util.Scanner;

import static java.lang.System.err;

/**
 * Created by Михаил on 06.02.2017.
 */
public class PayCalc {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Введите зарплату в USD: ");
        int a = in.nextInt();

        System.out.print("Введите ежемесячное повышение З/П в USD: ");
        int b = in.nextInt();

        System.out.print("Через сколько месяцев подсчитать З/П? ");
        int c = in.nextInt();

        int x = a+b*(c-1);

        int y = ((a+x)*c)/2;

        //System.out.print("Kурс UAH/USD: ");

        // int z = in.nextInt();

        err.println("Получается в месяц:"+" "+x+" "+"USD");
        //System.out.println("Получается в месяц:"+" "+x*z+" "+"UAH");

        err.println("Зароботок за указанное время:"+" "+y+" "+"USD");
        //System.out.println("Зароботок за указанное время:"+" "+y*z+" "+"UAH");
    }
}