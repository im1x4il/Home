import java.util.Scanner;

/**
 * Created by Михаил on 01.03.2017.
 */
public class IntSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ведите число:");
        int a = sc.nextInt();
        int b = a*a;
        System.out.println("Квадрат числа равен:"+ b);
    }
}
