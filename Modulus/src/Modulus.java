/**
 * Created by Михаил on 03.03.2017.
 */
public class Modulus {
    public static void main(String[] args) {
        //Проверить является ли переданное число четным (even) или нет (odd).
        String s = "101";
        args[0]=s;
        System.out.println(args[0]);
        int a = Integer.parseInt(args[0]);
        if ( a %2==0)
            System.out.println("Чётное");
        else
            System.out.println("Не чётное");


    }
}
