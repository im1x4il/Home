/**
 * Created by Михаил on 01.03.2017.
 */
public class Lohica {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        boolean c = false;

        //
        System.out.println("a или b "+ (a|b));
        //
        System.out.println("a и b "+(a&b));
        //
        System.out.println("b и c "+(b&c));
        //
        System.out.println("не a и b "+(!(a&b)));
        //
        System.out.println("a или не b "+(a|!b));
        //
        System.out.println("a или b и c "+(a|b&c));
        //
        System.out.println("a или (не (b и c)) "+(a|(!(b&c))));

    }
}
