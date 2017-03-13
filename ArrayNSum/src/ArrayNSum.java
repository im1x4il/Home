import java.util.Scanner;

/**
 * Created by Михаил on 25.02.2017.
 */
public class ArrayNSum {
    public static void main(String[] args) {
        int z = 0;

        System.out.print("Введите длину масива N: ");
        Scanner s = new Scanner(System.in);
        int N =s.nextInt();

        int[] array = new int[N];

        for (int i = 0; i <= (N-1); i++){
            array [i] = z;
             z = (int) (Math.random() * 10);} //  Решение второй задачи
             //z++;} // Решение первой задачи

        System.out.print("Наш масив: ");

        for (int i = 0; i <= (N-1); i++){
            System.out.print(array[i] + " ");}

        int sum=0;
        for(int i=0; i <= (N-1); i++) {
            sum = sum + array[i];
        }
        System.out.print( "\n"+ "Сума: "+sum);
    }
}

