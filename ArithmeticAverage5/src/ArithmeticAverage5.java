import java.util.Scanner;

/**
 * Created by Михаил on 02.03.2017.
 */
public class ArithmeticAverage5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Введите длину масива : ");
        int L = s.nextInt();
        System.out.println("Введите масив : ");
        int array[] = new int[L];
        for (int i=0;i<(L);i++){
            array[i]=s.nextInt();}

        System.out.println("Наш масив: ");
        for (int i=0;i<(L);i++)
            System.out.println(array[i]+" ");

        int sum=0;
        for (int i =0; i<(L);i++)
            sum = sum + array[i];
        System.out.print( "Среднее значение: "+sum/L);
    }
}
