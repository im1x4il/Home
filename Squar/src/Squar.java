/**
 * Created by Михаил on 01.03.2017.
 */
public class Squar {
    public static void main(String[] args) {
        double a = 0;
        double b = 0;
        double c = 9999999999D;
        double d = (b*b)-( 4*a*c);
        double x1=(-b+(Math.sqrt(d)))/( 2*a);
        double x2=(-b-(Math.sqrt(d)))/( 2*a);

        if (Double.isInfinite(x1)||Double.isInfinite(x2))
            System.out.println("x1=0.0");

        else if (Double.isNaN(x1)){
            System.out.println("x1=");}
        else
            System.out.println("x1=" + x1);

        if (Double.isInfinite(x2))
            System.out.println("x2=0.0");

        else if (Double.isNaN(x2)){
            System.out.println("x2=");}
        else
        System.out.println("x2="+x2);
    }
}
