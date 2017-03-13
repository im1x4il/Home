import java.util.Scanner;

/**
 * Created by Михаил on 02.03.2017.
 */
public class FlipMatrix {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Введите количество строк: ");
        int size1 = s.nextInt();
        System.out.print("Введите количество столюцов: ");
        int size2 = s.nextInt();
        int matrix[][]= new int[size1][size2];

        System.out.println("Введите элементы матрицы: ");
        for (int i=0;i<(size1);i++){
            for (int j=0;j<(size2);j++)
            matrix[i][j] =s.nextInt();}

        System.out.println("Наша матрица: ");
        for (int i=0;i<(size1);i++){
            for (int j=0;j<(size2);j++)
                System.out.print(matrix[i][j]+" ");
            System.out.println();}

        System.out.println("Наша матрица1: ");
        for (int i=0;i<(size1);i++)
            for (int j=0;j<(size2);j++)
                System.out.print(matrix[i][j]+" ");
        System.out.println();

        System.out.println("Наша матрица2: ");
        for (int i=0;i<(size1);i++)
            for (int j=0;j<(size2);j++)
                System.out.println(matrix[i][j]+" ");

        }
}
