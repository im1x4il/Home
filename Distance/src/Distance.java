import java.util.Scanner;

/**
 * Created by Михаил on 09.02.2017.
 */
public class Distance {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("t = ");
        int t = in.nextInt();

        int v1 = 50;
        int v2 = 30;
        int s0 = 80;

        //s=v*t
        int s1=v1*t;
        int s2=v2*t;
        int s=s0+s1+s2;

        System.out.println("Первое авто проехало: " +s1 );
        System.out.println("Второе авто проехало: " +s2);
        System.out.println("Общее расстояние: " +s );
    }
}
